
package Lab10.Q1;

public class Tester 
{
    public static void main(String[] args) 
    {
        Employee e1 = new PermanentEmployee("Nazib", 'B');
        e1.calSalaty();
        System.out.println("Name: " + e1.getName() + "\nType: " + e1.getType() + "\nSalary: " + e1.getTotalSalary() + "\n");

        Employee e2 = new ContractStaff("Anuar Gor", 8000.0);
        e2.calSalaty();
        System.out.println("Name: " + e2.getName() + "\nType: " + e2.getType() + "\nSalary: " + e2.getTotalSalary() + "\n");

        Employee e3 = new TemporaryStaff("Zahid BB", 200);
        e3.calSalaty();
        System.out.println("Name: " + e3.getName() + "\nType: " + e3.getType() + "\nSalary: " + e3.getTotalSalary() + "\n");

    }
}
