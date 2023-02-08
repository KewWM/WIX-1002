
package S1_2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3_2019S1_Regex 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        
        System.out.print("Enter genome string [quit to stop] : ");
        String s = ya.next();
        while (!s.equalsIgnoreCase("quit"))
        {       
            Pattern pattern = Pattern.compile("^(\\W+?)ATG(\\W+?)(TAG|TAA|TGA)");
            Matcher matcher = pattern.matcher(s);
            int count = 0;
            while(matcher.find())
            {
                String gene = matcher.group(1);
                System.out.println(gene);
                Pattern pattern1 = Pattern.compile("ATG(\\w+)");
                Matcher matcher1 = pattern1.matcher(gene);
                while(matcher1.find())
                {
                    gene=matcher1.group(1);                       
                }
                if(gene.length()%3 == 0 && !gene.contains("ATG") && !gene.contains("TAG") && !gene.contains("TAA") && !gene.contains("TGA"))
                {
                    System.out.println(gene);
                    count += 1;
                }    
            }
            if(count == 0)
            {
                System.out.println("No gene is found"); 
            }
                System.out.print("Enter genome string [quit to stop] : ");
                s = ya.next();
        }
    }
}
