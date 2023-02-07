
package S2_2019;

import java.util.Scanner;

public class Q2_2019S2 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int num = ya.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        int weight = ya.nextInt();
        System.out.println("");
        
        double total = weight * num * 5.99;
        double totalTax = total + total * 0.0725;
        //Display
        System.out.println("Price per kilogram:  $5.99");
        System.out.println("Sales tax:            7.25%");
        System.out.printf("Total price:         $%.2f", totalTax);
    }
}
