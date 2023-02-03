
package S1_2016;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4_2016S1 
{
    public static void main(String[] args)
    {
        try
        {
            Scanner ya = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/Extra WIX1002/src/S1_2016/Q4.txt"));
            while (ya.hasNextLine())
            {
                String pw = ya.next();
                boolean upCase = false;
                boolean lowCase = false;
                boolean digit = false;
                boolean nonAlphanumeric = false;
                for (int i = 0; i < pw.length(); i++)
                {
                    if(Character.isUpperCase(pw.charAt(i)))
                        upCase = true;
                    if(Character.isLowerCase(pw.charAt(i)))
                        lowCase = true;
                    if(Character.isDigit(pw.charAt(i)))
                        digit = true;
                    if(!Character.isSpaceChar(pw.charAt(i)) && !Character.isLetterOrDigit(pw.charAt(i)))
                        nonAlphanumeric = true;
                }
                if(pw.length() > 8 && upCase &&lowCase && digit && nonAlphanumeric)
                    System.out.println("Strong password.");
                else
                    System.out.println("Not a strong password.");
            }
            ya.close();
        }
        
        catch (FileNotFoundException e)
        {
            System.out.println("File was not found.");
        }
    }
}
