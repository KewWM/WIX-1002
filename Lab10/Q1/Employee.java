
package Lab10.Q1;

abstract class Employee 
{
    String name;
    String type;
    double totalSalary;

    public Employee(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    public abstract double calSalaty();

    public String getName() 
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public double getTotalSalary() 
    {
        return totalSalary;
    }
}
