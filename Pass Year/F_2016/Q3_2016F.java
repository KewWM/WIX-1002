
package F_2016;

import java.util.Scanner;
import java.util.Random;

public class Q3_2016F 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        Random ok = new Random();
        
        System.out.print("Enter the number of random integer: ");
        int n = ya.nextInt();
        int[] num = new int[n];
        
        System.out.print("The random integer : ");
        for (int i = 0; i < n; i++)
        {
            num[i] = ok.nextInt(10000);
            System.out.print(num[i] + " ");
        }
        
        //Min
        int min = num[0];
        for (int i = 1; i < n; i++)
        {
            if (num[i] < min)
                min = num[i];
        }
        System.out.println("\nMinimum Number : " + min);
        
        //Approximation to 100
        int[] numTo100 = new int[n];
        System.out.print("The approximation of the integer to the nearest hundred : ");
        for (int i = 0; i < n; i++)
        { 
            if (num[i] % 100 <= 49)
                numTo100[i] = (num[i] - (num[i] % 100));
            else
                numTo100[i] = num[i] + (100 - (num[i] % 100));
            System.out.print(numTo100[i] + " ");
        }
        
        //Reverse
        System.out.print("\nThe random integer in reverse order: ");
        for(int i = 0; i < n; i++)
        {
            String charN = Integer.toString(num[i]);
            for(int j = charN.length() - 1; j >= 0; j--)
            {
                System.out.print(charN.charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
