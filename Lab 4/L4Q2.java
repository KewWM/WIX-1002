
import java.util.Scanner;
public class L4Q2 {

    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter an integer, n: ");
        int n = ya.nextInt();
        int sum = 0, temp = 0;
        for (int i = 1; i <= n; i++){
            temp = temp + 1;
            sum = sum + temp;
            System.out.print(temp + "+");
        }
        System.out.println("\nSum: " + sum);
        
        //System.out.println("Sum: " + n + (n + 1));????
    }
    
}
