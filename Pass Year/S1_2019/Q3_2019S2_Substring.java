
package S1_2019;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3_2019S2_Substring 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        String line, pattern;

        do 
        {
            System.out.print("Enter genome string [quit to stop] : ");
            line = ya.next();

            if (line.equals("quit")) 
            { 
                break; 
            }
            
            ArrayList<String> result = new ArrayList<>();
            boolean started = false;
            int i = 0, start = 0, end = 0;

            while (i < line.length() - 2) 
            {
                if (line.substring(i, i+3).equals("ATG")) 
                {
                    start = i + 3;
                    i += 2;
                    started = true;
                }

                if (started && (line.substring(i, i+3).equals("TAA") || line.substring(i, i+3).equals("TAG") || line.substring(i, i+3).equals("TGA"))) 
                {
                    end = i;
                    i += 2;
                    started = false;
                    pattern = line.substring(start, end);
                    if (pattern.length() > 0 && pattern.length() % 3 == 0) { result.add(pattern); }
                }
                i++;
            }

            if (result.size() > 0) 
            { 
                result.forEach(gene -> System.out.println(gene)); 
            }
            else 
            { 
                System.out.println("No gene is found"); 
            }

        }   while (true);

        ya.close();
    }
}
