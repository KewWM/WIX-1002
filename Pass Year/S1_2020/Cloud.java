
package S1_2020;

public class Cloud 
{
    protected String cloudPackage;
    protected double total;

    public Cloud(String cloudPackage) 
    {
        this.cloudPackage = cloudPackage;
    }

    public double getTotalCost() 
    {
        return total;
    }
    
    @Override
    public String toString()
    {
        return String.format("Cloud Package: %s Total Cost = %.2f\n", cloudPackage, total);
    }
    
    
}
