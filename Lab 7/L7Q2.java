import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class L7Q2 
{
    public static void main(String[] args) 
    {
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter outputStream = new PrintWriter(new FileOutputStream("C:/Users/User/Documents/NetBeansProjects/Lab 7 file/index.htm"));
            while (in.hasNextLine())
                outputStream.println(in.nextLine());
            in.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }

}
