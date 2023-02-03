
package S1_2017;

import java.util.Scanner;

public class Q4
{
    
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        int a1 = ya.nextInt();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        int b1 = ya.nextInt();
        System.out.print("Second complex number. Enter a number for the real part: ");
        int a2 = ya.nextInt();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        int b2 = ya.nextInt();
        System.out.println("");
        
        Complex ok = new Complex();
        Complex ok1 = new Complex(a1, b1);
        System.out.println("First complex number: " + ok1.toString());
        Complex ok2 = new Complex(a2, b2);
        System.out.println("Second complex number: " + ok2.toString());
        ok.addComplexNum(a1, a2, b1, b2);
        ok.subtractComplexNum(a1, a2, b1, b2);
    }
}
