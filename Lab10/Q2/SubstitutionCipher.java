
package Lab10.Q2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder
{
    protected String inputFileName, outputFileName;
    protected int N;

    public SubstitutionCipher(String inputFileName, String outputFileName, int N) 
    {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }
    
    public String encode(String plainText)
    {
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
            cipherText += (char) ((plainText.charAt(i) + N) % 256);
        return cipherText;
    }
    public String decode(String cipherText)
    {
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
            plainText += (char) ((cipherText.charAt(i) - N) % 256);
        return plainText;
    }
    
    public void encodeFile()
    {
        try
        {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine())
                outputStream.println(encode(inputStream.nextLine()));

            inputStream.close();
            outputStream.close();

        } 
        catch (IOException e) 
            {
                e.printStackTrace();
            }
    }
    public void decodeFile()
    {
        try
        {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine())
                outputStream.println(decode(inputStream.nextLine()));

            inputStream.close();
            outputStream.close();

        } 
        catch (IOException e) 
            {
                e.printStackTrace();
            }
    }
}
