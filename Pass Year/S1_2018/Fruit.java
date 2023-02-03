
package S1_2018;

public abstract class Fruit 
{
    protected String name;
    protected String type;

    public Fruit(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    public abstract double totalPrice();

    @Override
    public String toString()
    {
        String s;
        s = type + " " + name + " - ";
        return s;
    }

}
