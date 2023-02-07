
package S1_2019;

public class Q5_2019S1
{
    public static void main(String[] args) 
    {
        double total = 0;
        
        Delivery a = new Delivery("Ali", "Ahmad", 4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah", 63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew", 19.0, true, true);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        total += a.totalCost();
        total += b.totalCost();
        total += c.totalCost();
        total += d.totalCost();
        System.out.println("The total shipping cost is RM " + total);
    }
}
