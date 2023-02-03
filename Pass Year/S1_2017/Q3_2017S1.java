
package S1_2017;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class Q3_2017S1
{
    public static void main(String[] args) 
    {
        try
        {
            PrintWriter out = new PrintWriter(new FileOutputStream("C:/Users/User/Documents/NetBeansProjects/Extra WIX1002/src/S1_2017/data.txt"));
            String character = generate();
            System.out.println("The String generated is: " + character);
            out.println(character);
            out.close();
            
            Scanner in = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/Extra WIX1002/src/S1_2017/data.txt"));
            while (in.hasNextLine())
            {
                character = in.nextLine();
                char [] characterArray = new char[character.length()];
                for(int i = 0; i < character.length(); i++)
                {
                    characterArray[i] = character.charAt(i);
                }
                System.out.println("String stored in ascending order: " + sort(characterArray, '>'));
                System.out.println("String stored in descending order: " + sort(characterArray, '<'));
                System.out.println("Original string from file: " + character);
            }
            in.close();
        }
        
        catch (IOException e)
        {
            System.out.println("File was not found.");
        }
    }
    
    //Method: Generate String
    public static String generate ()
    {
        Random ya = new Random();
        StringBuilder letters = new StringBuilder();
        int upOrLow;
        for (int i = 0; i < 6; i++)
        {
            upOrLow = ya.nextInt(2);
            if (upOrLow == 0)
            {
                letters.append((char) (ya.nextInt(26) + 65));
            }
            else
            {
                letters.append((char) (ya.nextInt(26) + 97));
            }
        }
        return letters.toString();
    }
    
    //Sort using bubble sort
    public static String sort(char[] c, char mode)
    {
        StringBuilder orderedCharacter = new StringBuilder();
        if (mode == '>')
        {
            for (int pass = 0; pass < c.length; pass ++)
            {
                for (int i = 0; i < (c.length - 1); i++)
                {
                    if (c[i] > c[i+1])
                    {
                        char hold = c[i];
                        c[i] = c[i+1];
                        c[i+1] = hold;
                    }
                }
            }
        }
        else if (mode == '<')
        {
            for (int pass = 0; pass < c.length; pass ++)
            {
                for (int i = 0; i < (c.length - 1); i++)
                {
                    if (c[i] < c[i+1])
                    {
                        char hold = c[i];
                        c[i] = c[i+1];
                        c[i+1] = hold;
                    }
                }
            }
        }
        else
            return "Invalid command";
        
        for (char done : c)
        {
            orderedCharacter.append(done);
        }
        return orderedCharacter.toString();
    }
    
}
