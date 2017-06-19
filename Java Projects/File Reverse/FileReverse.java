import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
 
public class FileReverse {
    public static void main (String [] args) {
        
    	try (Scanner input = new Scanner(new File("input.txt"));
        PrintWriter output = new PrintWriter(new File("output.txt"));) {
             
    		while(input.hasNextLine()) {
                String s = input.nextLine();
                StringBuffer buffer = new StringBuffer(s);
                buffer = buffer.reverse();
                System.out.println(buffer.toString());
                output.println(buffer.toString());
            }
            System.out.println("The file was copied successfully.");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }  
}