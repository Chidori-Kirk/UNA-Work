
Imports System.Collections.Generic
Imports System.Text

Namespace AmazingNS
    Public Class Amazing
        Private maze As Maze
        Private curX As Integer, curY As Integer
        Private makingExit As Boolean, madeExit As Boolean
        Private random As New Random()

        Public Function generateMaze(width As Integer, height As Integer) As Maze
            maze = New Maze(width, height)

            initMaze()

            While Not maze.doneWithMaze()
                takeStep()
            End While

            Return maze
        End Function

        Private Sub initMaze()
            makingExit = False
            madeExit = False

            ' get the opening on top
            Dim entranceX As Integer = rnd(maze.getWidth())
            maze.setEntrance(entranceX)
            maze.markCellDone(entranceX, 1)

            curX = entranceX
            curY = 1
        End Sub


        Private Function canGoUp() As Boolean
            Return Not (curY = 1 OrElse maze.doneWithCell(curX, curY - 1))
        End Function
        Private Function canGoDown() As Boolean
            Return Not (curY = maze.getHeight() OrElse maze.doneWithCell(curX, curY + 1))
        End Function
        Private Function canGoLeft() As Boolean
            Return Not (curX = 1 OrElse maze.doneWithCell(curX - 1, curY))
        End Function
        Private Function canGoRight() As Boolean
            Return Not (curX = maze.getWidth() OrElse maze.doneWithCell(curX + 1, curY))
        End Function

        Public Function isThereAnExit() As Boolean
            Return madeExit
        End Function

        Private Sub findNextUndoneCell()
            ' find the next undone spot in the maze
            Do
                If curX = maze.getWidth() Then
                    curX = 1
                    If curY = maze.getHeight() Then
                        curY = 1
                    Else
                        curY += 1
                    End If
                Else
                    curX += 1
                End If
            Loop While Not maze.doneWithCell(curX, curY)
        End Sub

        Private Const LEFT As Integer = 1
        Private Const RIGHT As Integer = 2
        Private Const UP As Integer = 4
        Private Const DOWN As Integer = 8

        Private Sub takeStep()
            Dim direction As Integer = (If(canGoLeft(), LEFT, 0)) Or (If(canGoRight(), RIGHT, 0)) Or (If(canGoUp(), UP, 0))

            If direction = 0 Then
                punt()
                Return
            End If

            If direction <> (LEFT Or RIGHT Or UP) Then
                If curY = maze.getHeight() Then
                    If Not madeExit Then
                        makingExit = True
                        direction = direction Or DOWN
                    End If
                Else
                    If canGoDown() Then
                        direction = direction Or DOWN
                    End If
                End If
            End If

            goInRandomDirection(direction)
        End Sub

        Private Function getRandomDirection() As Integer
            Select Case rnd(4)
                Case 1
                    Return LEFT
                Case 2
                    Return RIGHT
                Case 3
                    Return UP
                Case Else
                    Return DOWN
            End Select
        End Function

        Private Sub goInRandomDirection(direction As Integer)
            Dim randomDirection As Integer
            Do
                randomDirection = getRandomDirection()
                If (direction And randomDirection) > 0 Then
                    Select Case randomDirection
                        Case LEFT
                            goLeft()
                            Exit Select
                        Case RIGHT
                            goRight()
                            Exit Select
                        Case UP
                            goUp()
                            Exit Select
                        Case DOWN
                            goDown()
                            Exit Select
                    End Select
                End If
            Loop While (direction And randomDirection) = 0
        End Sub

        Private Sub punt()
            If curY = maze.getHeight() Then
                If Not madeExit Then
                    makingExit = True
                    goDown()
                    Return
                End If
            Else
                If canGoDown() Then
                    goDown()
                    Return
                End If
            End If
            findNextUndoneCell()
        End Sub

        Private Sub goLeft()
            curX -= 1
            maze.markCellDone(curX, curY)
            maze.breakDownRightWall(curX, curY)
            makingExit = False
        End Sub

        Private Sub goUp()
            curY -= 1
            maze.markCellDone(curX, curY)
            maze.breakDownBottomWall(curX, curY)
            makingExit = False
        End Sub

        Private Sub goRight()
            maze.breakDownRightWall(curX, curY)
            curX += 1
            maze.markCellDone(curX, curY)
        End Sub

        Private Sub goDown()
            maze.breakDownBottomWall(curX, curY)

            If Not makingExit Then
                curY += 1
                maze.markCellDone(curX, curY)
            Else
                madeExit = True
                makingExit = False
                findNextUndoneCell()
            End If
        End Sub

        Public Function rnd(limit As Integer) As Integer

            Return CInt(random.[Next](limit)) + 1
        End Function

        Public Shared Sub Main(args As [String]())
            Dim a As New Amazing()
            Console.WriteLine(a.generateMaze(23, 23))
            Console.ReadKey()
        End Sub
    End Class



    Public Class Maze
        Private Const CLOSED As Integer = 0
        Private Const RIGHT_WALL As Integer = 1
        Private Const BOTTOM_WALL As Integer = 2
        Private Const OPEN As Integer = 3

        Private maze As Integer(,)
        Private width As Integer, height As Integer
        Private entranceX As Integer
        Private cellsDone As Integer
        Private done As Boolean(,)

        Public Sub New(width As Integer, height As Integer)
            Me.width = width
            Me.height = height
            maze = New Integer(width - 1, height - 1) {}

            cellsDone = 0
            done = New Boolean(width - 1, height - 1) {}
        End Sub

        Public Function getWidth() As Integer
            Return width
        End Function

        Public Function getHeight() As Integer
            Return height
        End Function

        Public Sub setEntrance(x As Integer)
            entranceX = x
        End Sub

        '----------------------------------------------------------

        Public Sub markCellDone(x As Integer, y As Integer)
            done(x - 1, y - 1) = True
            cellsDone += 1
        End Sub

        Public Function doneWithCell(x As Integer, y As Integer) As Boolean
            Return done(x - 1, y - 1)
        End Function

        Public Function doneWithMaze() As Boolean
            Return (cellsDone >= width * height)
        End Function

        '----------------------------------------------------------

        Private Function keepWall(wallState As Integer, wallToKeep As Integer) As Integer
            If wallState = CLOSED OrElse wallState = wallToKeep Then
                Return wallToKeep
            End If

            Return OPEN
        End Function

        Public Sub breakDownRightWall(x As Integer, y As Integer)
            maze(x - 1, y - 1) = keepWall(maze(x - 1, y - 1), BOTTOM_WALL)
        End Sub

        Public Sub breakDownBottomWall(x As Integer, y As Integer)
            maze(x - 1, y - 1) = keepWall(maze(x - 1, y - 1), RIGHT_WALL)
        End Sub

        '----------------------------------------------------------

        Public Overrides Function ToString() As [String]
            Dim output As [String] = ""

            For i As Integer = 1 To width
                If i = entranceX Then
                    output += ":  "
                Else
                    output += ":--"
                End If
            Next
            output += ":" & vbLf

            For j As Integer = 1 To height
                output += "I"
                For i As Integer = 1 To width
                    Select Case maze(i - 1, j - 1)
                        Case CLOSED, RIGHT_WALL
                            output += "  I"
                            Exit Select
                        Case BOTTOM_WALL, OPEN
                            output += "   "
                            Exit Select
                    End Select
                Next

                output += vbLf

                For i As Integer = 1 To width
                    Select Case maze(i - 1, j - 1)
                        Case CLOSED, BOTTOM_WALL
                            output += ":--"
                            Exit Select
                        Case RIGHT_WALL, OPEN
                            output += ":  "
                            Exit Select
                    End Select
                Next
                output += ":" & vbLf
            Next
            Return output
        End Function
    End Class


End Namespace

'=======================================================
'Service provided by Telerik (www.telerik.com)
'Conversion powered by NRefactory.
'Twitter: @telerik
'Facebook: facebook.com/telerik
'=======================================================
