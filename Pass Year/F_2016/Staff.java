
package F_2016;

public class Staff 
{
    private String name;
    private String IC;

    public Staff(String name, String IC)
    {
        this.name = name;
        this.IC = IC;
    }

    @Override
    public String toString() 
    {
        String s;
        s = "Full Name: " + name + "\nIC: " + IC + "\n";
        return s;
    }
    
}
