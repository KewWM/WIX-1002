
package l3q5;
import java.util.Scanner;
public class L3Q5 {

    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.print("Enter a: ");
        a = ya.nextDouble();
        System.out.print("Enter b: ");
        b = ya.nextDouble();
        System.out.print("Enter c: ");
        c = ya.nextDouble();
        System.out.print("Enter d: ");
        d = ya.nextDouble();
        System.out.print("Enter e: ");
        e = ya.nextDouble();
        System.out.print("Enter f: ");
        f = ya.nextDouble();
        
        x = ((e * d)-(b * f))/((a * d)-(b * c));
        y = ((a * f)-(e * c))/((a * d)-(b * c));
        
        if ((a * d)-(b * c) == 0){
            System.out.println("The equation has no solution");
            System.exit(0);
        }
        
        System.out.println("Result of x is: " + x);
        System.out.println("Result of y is: " + y);
    }
    
}
