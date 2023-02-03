
package S1_2018;

public class Apple extends Fruit
{
    private final int qty;

    public Apple(int qty, String name, String type) 
    {
        super(name, type);
        this.qty = qty;
    }
    
    public double totalPrice()
    {
        double price = 0;
        if (type.equals("Red"))
            price = qty * 1.80;
        else if (type.equals("Green"))
            price = qty * 1.20;
        else
            price = 0;
        return price;
    }

    @Override
    public String toString() 
    {
        String s;
        s = type + " Apple - " + qty + " = RM " + totalPrice();
        return s;
    }
    
    
    
}
