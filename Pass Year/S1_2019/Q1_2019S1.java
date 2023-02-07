
package S1_2019;

import java.util.Random;

public class Q1_2019S1 
{
    public static void main(String[] args)
    {
        System.out.println("This program shows the number of odd and even number"
         + " from 10 random numbers. The random numbers must be from 0 - 100");
        int num[] = new int[10];
        int odd = 0, even = 0;
        Random r = new Random();
        
        for (int i = 0; i < 10; i++)
        {
            num[i] = r.nextInt(101);
            System.out.print(num[i] + " ");
            if (isEven(num[i]))
            {
                ++odd;
            }
            else
            {
                ++even;
            }
        }
        
        System.out.print("\nNumber of odd number: " + odd);
        System.out.println("\nNumber of even number: " + even);
    }
    
    public static boolean isEven(int a)
    {
        if(a%2 == 0)
            return true;
        else
            return false;
    }
}
