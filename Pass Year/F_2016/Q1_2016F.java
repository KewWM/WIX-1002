
package F_2016;

import java.util.Scanner;

// Filename: Q1.java
public class Q1_2016F 
{
    public static void main(String[] args)
    {
        int N;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        
        for(int i = 0 ; i < N; i++)
        {
            System.out.print(getTriangular(i) + " ");
            System.out.println();
        }
    }

    public static int getTriangular (int n) 
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}