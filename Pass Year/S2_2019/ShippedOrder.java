
package S2_2019;

public class ShippedOrder extends Order
{

    public ShippedOrder(String name, String ID, int qty, double price) 
    {
        super(name, ID, qty, price);
    }
    
    @Override
    public double computeTotalPrice()
    {
        return super.computeTotalPrice() + 4.00;
    }

    @Override
    public String toString()
    {
        return "\nShipped" + super.toString();
    }
    
    
}
