
package l3q1;
import java.util.Scanner;
public class L3Q1 {
    
    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int a = ya.nextInt();
        int b = ya.nextInt();
        System.out.print("Enter the operand: ");
        String symbol = ya.next();
        char operand = symbol.charAt(0);
        
        if (operand == '+')
            System.out.println(a + " + "+ b + " = " + (a+b) );
        else if (operand == '-')
            System.out.println(a + " - "+ b + " = " + (a-b) );
        else if (operand == '*')
            System.out.println(a + " * "+ b + " = " + (a*b) );
        else if (operand == '/')
            System.out.println(a + " / "+ b + " = " + (a/b) );
        else if (operand == '%')
            System.out.println(a + " % "+ b + " = " + (a%b) );
        else
            System.out.println("There is no this type of operation.");
        
    }
    
}
