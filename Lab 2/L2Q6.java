package l2q6;
import java.util.Scanner;

public class L2Q6 {

    public static void main(String[] args) {
        Scanner walao = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        int mass = walao.nextInt(); float M = mass/1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        float iTemp = walao.nextFloat();
        double iCel = (iTemp-32.0)*0.555555556;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        float fTemp = walao.nextFloat();
        double fCel = (fTemp-32.0)*0.555555556;
        double Q = M * (fCel - iCel) * 4184;
        System.out.println("The energy needed is " + String.format("%.6e%n",Q));
        
    }
    
}
