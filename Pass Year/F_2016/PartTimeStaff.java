
package F_2016;

public class PartTimeStaff extends Staff
{
    private int hour;

    public PartTimeStaff(String name, String IC, int hour) {
        super(name, IC);
        this.hour = hour;
    }
    
    public int getSalary()
    {
        return  40 * hour;
    }

    public String toString() 
    {
        String s;
        s = super.toString() + "Number of working hours: " + hour;
        s += "\nSalary: RM " + getSalary();
        return s;
    }
    
}
