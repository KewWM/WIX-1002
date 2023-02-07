
package S1_2020;

public class CloudPackage extends Cloud
{
    private int core;
    private int memory;
    private double price;

    public CloudPackage(String cloudPackage, int core, int memory, double price)
    {
        super.cloudPackage = cloudPackage;
        this.core = core;
        this.memory = memory;
        this.price = price;
    }

}
