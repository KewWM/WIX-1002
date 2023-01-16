
package Lab9.Q2;

public class PersonProfile 
{
    protected String name;
    protected String gender;
    protected String date;
    
    public PersonProfile (String name, String gender, String date)
    {
        this.date = date;
        this.gender = gender;
        this.name = name;
    }
    
    @Override
    public String toString() 
    {
        return "Name: " + name +
               "\nGender: " + gender +
               "\nDate of birth: " + date;
    }
}
