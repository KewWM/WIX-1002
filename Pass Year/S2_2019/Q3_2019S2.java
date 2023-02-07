
package S2_2019;

import java.util.Scanner;
import java.util.Random;

public class Q3_2019S2 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        Random ok = new Random();
        
        char play;
        do
        {
            int n1 = ok.nextInt(10);
            int n2 = ok.nextInt(10);
            System.out.print("What is " + n1 + " + " + n2 + " ? ");
            int ans = ya.nextInt();
            
            int correctAns = n1 + n2;
            if (correctAns == ans)
            {
                System.out.println(n1 + " + " + n2 + " = " + ans + " is true");
            }
            else
                System.out.println(n1 + " + " + n2 + " = " + ans + " is false");
            
            System.out.print("Do you want to try another question (y/n) ? ");
            play = ya.next().charAt(0);
        } while(play == 'y');
        
        System.out.println("Program ends");
    }
}
