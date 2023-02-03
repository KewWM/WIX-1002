
package S2_2018;

import java.util.Scanner;

public class Q2_2018S2
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int num = ya.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        int weight = ya.nextInt();
        
        double total = num * weight * 5.99;
        double totalTax = total + total * 0.0725;
        System.out.println("Price per kilogram:\t   $5.99\nSales tax: \t\t   7.25%");
        System.out.println("Total price after tax:    $" + totalTax);
    }
}
