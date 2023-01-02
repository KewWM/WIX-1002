
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q3 
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner ya =  new Scanner (new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Q3.txt"));
            PrintWriter yeah = new PrintWriter(new FileOutputStream("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/reverse.txt"));
            
            while (ya.hasNextLine()) 
            {
                String line = ya.nextLine();
                String reverse = " ";

                for(int i = line.length() - 1; i >= 0; i--)
                {
                    reverse += line.charAt(i);
                }
                yeah.println(reverse);
            }
            ya.close();
            yeah.close();

        }
        catch (IOException e)
        {
            System.out.println("Error occurred when reading");   
        }
    }
}
