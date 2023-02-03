
package Lab10.Q1;

public class TemporaryStaff extends Employee
{
    protected double hour;

    public TemporaryStaff(String name, double hour){
        super(name, "Temporary");
        this.hour = hour;
    }
    
    @Override
    public double calSalaty()
    {
        totalSalary = (hour * 15.0);
        return totalSalary;
    }
    
}
