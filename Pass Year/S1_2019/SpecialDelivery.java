
package S1_2019;

public class SpecialDelivery extends Delivery
{
    private boolean weekend;
    private boolean nighttime;

    public SpecialDelivery(String sender, String recipent, double weight, boolean weekend, boolean nighttime) 
    {
        super(sender, recipent, weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }
    
    @Override
    public double totalCost()
    {
        double cost = super.totalCost();
        if (weekend)
        {
            cost += 50.00;
        }
        if (nighttime)
        {
            cost = cost * 1.20;
        }
        return cost;
    }

    @Override
    public String toString() 
    {
        String s = super.toString();
        if (weekend)
            s += "Weekend Delivery\n";
        if (nighttime)
            s += "Night Time Delivery\n";
        return s;
    }
    
    
}
