
import java.util.Scanner;
public class L4Q1 {

    public static void main(String[] args) {
        Scanner ya = new Scanner (System.in);
        System.out.print("Enter an Integer: ");
        int num = ya.nextInt();
        System.out.print("The factors are: ");
        int i = 1;
        while (i < num){
            if ((num % i) == 0)
                System.out.print(i + ", ");
            i++;
        }
        System.out.print((i == num) ? i : i + "\n");
        System.out.println("");
        // variable = (condition) ? [true] : [false]
        
        //Method 2
        //for (int i = 1; i <= num /2; i++)
        //{
        //    if (num % i == 0)
        //        System.out.print(i + ", ");
        //    System.out.println(num);
        //)
    }
    
}
