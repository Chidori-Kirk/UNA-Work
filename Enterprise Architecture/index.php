<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        $foo = 0;
        $bar = 0;
        $foobar = 0;
        
        for($i = 1; $i<=100; $i++) {
            if ($i % 3 == 0 && $i % 5 == 0) {
                echo "<br>" . $i . " " . "Foobar";
                $foobar++;
            }
            else if($i % 5 == 0) {
                echo "<br>" . $i . " " . "bar";
                $bar++;
            }
            else if($i % 3 == 0) {
                echo "<br>" . $i . " " . "foo";
                $foo++;
            }
            else {
                if($i == 1) {
                    echo $i;
                }
                else {
                    echo "<br>" . $i;
                }
            }
        }
        ?>
    </body>
</html>
