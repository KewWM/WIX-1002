
package F_2016;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q4_2016F 
{
    public static void main(String[] args) 
    {
        try
        {
            int q, y, m;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/Extra WIX1002/src/F_2016/Q4.dat"));
            try
            {
                while(true)
                {
                    q = in.readInt();
                    m = in.readInt();
                    y = in.readInt();
                    DayOfTheWeek dow = new DayOfTheWeek(q, m, y);
                    System.out.println(dow.toString());
                }
            }
            catch (EOFException e)
            {
                
            }
            in.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File was not found.");
        }
        catch (IOException e)
        {
            System.out.println("Problem with file input");
        }
    }   
}
