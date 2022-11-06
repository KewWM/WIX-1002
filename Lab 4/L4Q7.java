
package l4q7;
import java.util.Scanner;
public class L4Q7 {

    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        
        //input & initialising
        double M, Cn, Ln, Rn, Tinterest = 0;
        System.out.print("Enter principal amount: ");
        double P = ya.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = ya.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double N = ya.nextDouble();
        double M1,M2;
        //Header
        System.out.println("Month\t\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\t\tTotal Interest");
        //calculation & output
        for (int cc = 1; cc <= N; cc++){
            int n = cc;
            M1 = (P * (i / 1200));
            M2 = (1 + (i / 1200));
            M = M1 /(1 - Math.pow(M2, -N));
            Cn = M * Math.pow((1 + (i / 1200)), -(1 + N - n));
            Ln = M - Cn;
            Rn = (Ln / (i / 1200)) - Cn;
            Tinterest += Ln;
            System.out.println(n + "\t\t" + String.format("%.2f",M) + "\t\t\t" + String.format("%.2f",Cn) +
            "\t\t" + String.format("%.2f", Ln) + "\t\t" + String.format("%.2f",Rn) + "\t\t\t" + String.format("%.2f", Tinterest));
        }
        
       
    }
    
}
