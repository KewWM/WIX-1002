
package S1_2018;

import java.util.Scanner;
import java.util.Random;

public class Q2_2018S1 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner (System.in);
        Random ok = new Random ();
        System.out.print("Enter N number: ");
        int N = ya.nextInt();
        int num[] = new int[N];
        int AAA = 0, AA = 0, A = 0;
        
        System.out.print("The random numbers are: ");
        for (int i = 0; i < N; i++)
        {
            num[i] = ok.nextInt(100) + 50;
            System.out.print(num[i] + " ");
            if (i == N-1)
                System.out.println("");
        }
        
        for (int i = 0; i < N; i++)
        {
            if (num[i] % 10 == 0 | num[i] % 10 == 1 | num[i] % 10 == 2 | num[i] % 10 == 3)
                AAA++;
            else if (num[i] % 10 == 4 |num[i] % 10 == 5 |num[i] % 10 == 6)
                AA++;
            else
                A++;
        }
        
        System.out.println("Group AAA: " + AAA);
        System.out.println("Group AA: " + AA);
        System.out.println("Group A: " + A);
    }
}
