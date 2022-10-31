
import java.util.Scanner;

public class l2q2 {
    
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        
        System.out.print("Enter the price of the car: RM");
        float P = ok.nextFloat();
        System.out.print("Enter the down payment: RM");
        float D = ok.nextFloat();
        System.out.print("Enter the interest rate(%): ");
        float R = ok.nextFloat();
        System.out.print("Enter the loan duration in year: ");
        int Y = ok.nextInt();

        float M = (P-D)*(1+(R*Y)/100)/(Y*12);
        System.out.println("The monthly payment is : RM" + String.format("%.2f", M));
    }
    
}
