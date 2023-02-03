
package F_2016;

public class PermanentStaff extends Staff
{
    private String grade;

    public PermanentStaff(String name, String IC, String grade) 
    {
        super(name, IC);
        this.grade = grade;
    }
    
    public int getSalary ()
    {
        if ("EM01".equals(grade))
            return 7000;
        else if ("EM02".equals(grade))
            return 5000;
        else if ("EM03".equals(grade))
            return 3000;
        else if ("EM04".equals(grade))
            return 1000;
        else
            return 0;
    }
    
    public String toString()
    {
        String s;
        s = super.toString() + "Grade: " + grade + "\nSalary: RM " + getSalary() + "\n";
        return s;
    }
    
}
