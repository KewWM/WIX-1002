
package Lab10.Q1;

class PermanentEmployee extends Employee
{
    protected char category;

    public PermanentEmployee(String name, char category) 
    {
        super(name, "Permanent");
        this.category = category;
    }
    
    @Override
    public double calSalaty()
    {
        if (category == 'A')
            totalSalary = 4000;
        else if (category == 'B')
            totalSalary = 3000;
        else if (category == 'C')
            totalSalary = 2000;
        return totalSalary;
    }
}
