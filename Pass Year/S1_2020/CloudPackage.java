
package S1_2020;

public class CloudPackage extends Cloud
{
    protected final int core;
    protected final int memory;
    protected final double price;

    public CloudPackage(String cloudPackage, int core, int memory, double price)
    {
        super(cloudPackage);
        this.core = core;
        this.memory = memory;
        this.price = price;
    }
    
    public boolean check(Job j)
    {
        return (j.getMemory() <= memory);
    }
    
    public void totalCost(Job j)
    {
        int numHour = (int)Math.ceil((double)j.getTask() / core);
        total = numHour * price;
    }
}
