
import java.util.Scanner;
public class L3Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sale; double commission = 0;
        System.out.print("Enter sales volume: ");
        sale = sc.nextInt();
        
        if (sale <= 100)
            commission = sale * 0.05;
        else if (sale > 100 && sale <= 500)
            commission = sale * 0.075;
        else if (sale > 500 && sale <= 1000)
            commission = sale * 0.1;
        else if (sale > 1000)
            commission = sale * 0.125;
        System.out.println("The commission is: RM" + String.format("%.2f",commission));
    }
    
}
