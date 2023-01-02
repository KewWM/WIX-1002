import java.util.Scanner;
import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class L7Q1 
{
    public static void main (String [] args)
    {
        String hi = "C:/Users/User/Documents/NetBeansProjects/Lab 7 file/coursename.dat";
        try
        {
            ObjectOutputStream walaoIn = new ObjectOutputStream(new FileOutputStream(hi));
            
            String[] courseCode = new String[4];
            courseCode[0] = "WXES1116";
            courseCode[1] = "WXES1115";
            courseCode[2] = "WXES1110";
            courseCode[3] = "WXES1112";
            
            String[] courseName = new String[4];
            courseName[0] = "Programming I";
            courseName[1] = "Data Structure";
            courseName[2] = "Operating System";
            courseName[3] = "Computing Mathematics I";
            
            for(int i = 0; i < courseCode.length; i++)
            {
                walaoIn.writeUTF(courseCode[i]);
                walaoIn.writeChar(':');
                walaoIn.writeUTF(courseName[i]);
                walaoIn.writeChar(',');
            }
            
            walaoIn.close();
        }
        catch (IOException e)
        {
            System.out.println("File output error");
        }
        
        //Input and Find
         try
         {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("coursename.dat"));
            Scanner s = new Scanner(System.in);
            
            System.out.print("Enter a course code: ");
            String cCode = s.next();
            while(true)
            {
                String stuff = in.readUTF();
                in.readChar();
                
                if(stuff.equalsIgnoreCase(cCode))
                {
                    System.out.println(in.readUTF());
                    in.close();
                }
            }
        } 
        catch (EOFException e)
            {

            }   
        catch(FileNotFoundException e)
            {
                System.out.println("File not found");
            } 
        catch (IOException e)
            {
                System.out.println("Error reading file");
            }
    }
}
