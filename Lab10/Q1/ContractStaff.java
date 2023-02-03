
package Lab10.Q1;

public class ContractStaff extends Employee
{
    protected double sale;

    public ContractStaff(String name, double sale) {
        super(name, "Contract");
        this.sale = sale;
    }
    
    @Override
    public double calSalaty()
    {
        totalSalary = (500 + (sale * 0.5));
        return totalSalary;
    }
}
