
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q4 
{
    public static void main(String[] args)
    {
        try
        {
            Scanner ya = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/displayWord.txt"));
            int numLine = 0, numWords = 0, numChar = 0;
            while(ya.hasNextLine())
            {
                while(ya.hasNextLine())
                {
                    String sentence = ya.nextLine();
                    numLine++;
                    String[] words = sentence.split(" ");
                    numWords += words.length;
                    for(int i = 0; i < words.length; i++)
                    {
                        numChar += words[i].length();
                    }
                }
            }
            System.out.println("The number of lines are " + numLine);
            System.out.println("The number of words are " + numWords);
            System.out.println("The number of characters excluding space are " + numChar);
            ya.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File was not found");   
        }
    }
}
