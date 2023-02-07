
package S1_2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3_2019S1 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        
        boolean genome = true;
        while (genome)
        {
            System.out.print("Enter genome string [quit to stop] : ");
            String s = ya.next();
            Pattern pattern = Pattern.compile("(.*)ATG(.*)(ATG|TAG|TAA|TGA)");
            Matcher matcher = pattern.matcher(s);
            System.out.println(matcher.group(2));
            
            if (s.equals("quit"))
            {
                genome = false;
            }
        }
        
    }
}
