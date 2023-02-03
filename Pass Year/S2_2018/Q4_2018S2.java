
package S2_2018;

import java.util.Scanner;

public class Q4_2018S2 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the values for a, b, c, d, e and f : ");
        int a = ya.nextInt();
        int b = ya.nextInt();
        int c = ya.nextInt();
        int d = ya.nextInt();
        int e = ya.nextInt();
        int f = ya.nextInt();
        System.out.println("");
        
        LinearEquation le = new LinearEquation(a, b, c, d, e, f);
        System.out.println(le + "\n");
        System.out.println("x = " + le.computeX() + " ; y = " + le.computeY());
    }
}
