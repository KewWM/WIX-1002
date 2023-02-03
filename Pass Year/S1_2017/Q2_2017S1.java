package S1_2017;

import java.util.Scanner;

public class Q2_2017S1 
{
    public static void main(String[] args) 
    {
        Scanner ya =new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        int iFee = ya.nextInt();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        float rate = ya.nextFloat();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = ya.nextInt();
        
        System.out.println("Computed tuition fee for year " + year + " is: RM" + String.format("%.2f", computeFee(iFee, rate, year)));
    }
    
    public static double computeFee(int a, float b, int c)
    {
        double fFee = a;
        for (int i = 1; i < c; i++)
        {
            fFee += (fFee * (b / 100));
        }
        return fFee;
    }
            
}
