
package S2_2019;

import java.util.Scanner;

public class Q5_2019S2 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter values for a, b and c : ");
        int a = ya.nextInt();
        int b = ya.nextInt();
        int c = ya.nextInt();
        
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.printf("The equation is : %dx(^2) + (%d)x + (%d)", a, b, c);
        System.out.println("\nDiscriminant: " + qe.Discriminant());
        if (qe.calcRoot1() == qe.calcRoot2())
            System.out.println("Same roots: " + qe.calcRoot1());
        else if (qe.Discriminant() < 0)
            System.out.println("The equation has no roots");
        else
            System.out.printf("The roots : %.1f and %.1f", qe.calcRoot1(), qe.calcRoot2());
        System.out.println("");
    }
}
