
package S1_2018;

public class Watermelon extends Fruit
{
    private final double weight;

    public Watermelon(double weight, String name, String type)
    {
        super(name, type);
        this.weight = weight;
    }
    
    public double totalPrice()
    {
        double price = 0;
        if (type.equals("Local"))
        {
            if (weight > 5)
                price = weight * 1.65;
            else if (weight >= 2)
                price = weight * 1.95;
            else
                price = weight * 2.25;
        }
        else if (type.equals("Imported"))
        {
            if (weight > 5)
                price = weight * 3.15;
            else if (weight >= 2)
                price = weight * 3.45;
            else
                price = weight * 3.75;
        }
        else
            price = 0;
        return price;
    }

    @Override
    public String toString() 
    {
        String s;
        s = type + " Watermelon - " + weight + "kg = RM " + totalPrice();
        return s;
    }
    
}
