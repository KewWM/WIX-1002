
package S1_2019;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4_2019S1
{
    public static void main(String[] args) 
    {
        int numSentence = 0, numWord = 0;
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int[] numAl = new int[26];
        try
        {
            Scanner in = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/Extra WIX1002/src/S1_2019/myAmbition.txt"));
            
            while (in.hasNextLine())
            {
                String display = in.nextLine();
                System.out.println(display);
                String s = display.toUpperCase();
                for (int round = 0; round < 26; round++)
                {
                    for (int i = 0; i < s.length(); i++)
                    {
                        if (s.charAt(i) == alphabet[round])
                            numAl[round]++;
                    }
                }
                char ch[]= new char[s.length()];     
                for(int i=0; i < s.length(); i++)  
                {  
                    if (s.charAt(i) == '.')
                        numSentence++;
                    ch[i]= s.charAt(i);  
                    if (s.charAt(i) == ' ' || s.charAt(i) == '\n'|| s.charAt(i) == '\t')  
                        numWord++;  
                }  
            }
            System.out.println("");
            in.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!");
        }
        
        //Display
        System.out.println("Number of sentence: " + numSentence);
        System.out.println("Number of words: " + numWord);
        for (int i = 0; i < 26; i++)
        {
            System.out.print(alphabet[i] + " : " + numAl[i] + " ");
            if (i == 7 | i == 15 | i == 23)
                System.out.println("");
        }
        System.out.println("");
    }
}
