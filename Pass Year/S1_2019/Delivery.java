
package S1_2019;

public class Delivery
{
    protected String sender;
    protected String recipent;
    protected double weight;

    public Delivery(String sender, String recipent, double weight) 
    {
        this.sender = sender;
        this.recipent = recipent;
        this.weight = weight;
    }
    
    public double totalCost()
    {
        double cost = 0;
        if (weight > 50)
            cost = 14.00 + 78.00 + 210.00 + ((weight - 50) * 8.60);
        else if (weight > 20)
            cost = 14.00 + 78.00 + ((weight - 20) * 7.00);
        else if (weight > 5)
            cost = 14.00 + (weight - 5) * 5.20;
        else
            cost = weight * 2.80;
        return cost;
    }

    @Override
    public String toString() {
        return "From : " + sender + " To: " + recipent +
                "\nWeight of Package : " + weight + " kg" +
                "\nShipping cost : RM" + totalCost() + "\n";
    }
    
    
}
