
package S2_2019;

import java.util.Scanner;

public class Q6_2019S2
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String name = ya.next();
        System.out.print("Enter customer id : ");
        String id = ya.next();
        System.out.print("Enter quantity ordered : ");
        int qty = ya.nextInt();
        System.out.print("Enter price per unit : ");
        double price = ya.nextDouble();
        
        
        Order c1 = new Order(name, id, qty, price);
        System.out.println(c1);
        Order c2 = new ShippedOrder("joe", "123", 10, 5.0);
        System.out.println(c2);
    }
}
