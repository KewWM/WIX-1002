
package S2_2016;

public class Q5 
{
    public static void main(String[] args) 
    {
        FinancialRecord fr1 = new FinancialRecord(1234, 10000.0, 7.77);
        System.out.println("The information about financial record A is as follows: ");
        fr1.displayRecordInfo();
        System.out.println();
        
        FinancialRecord fr2 = new FinancialRecord(1235, 20000.0, 8.0);
        System.out.println("The information about financial record B is as follows: ");
        fr2.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + fr2.getMonthlyInterestRate());
        fr2.deposit(1500);
        fr2.withdraw(500);
    }
}
