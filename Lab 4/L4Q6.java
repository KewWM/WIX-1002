
package l4q6;
import java.util.Random;
public class L4Q6 {

    public static void main(String[] args) {
        Random ya = new Random();
        int digit = 1; //start with 1 as num divides by 10 will less 1 digit in Loop
        int num = Math.abs(ya.nextInt()); //Math.abs --> absolute value
        System.out.println("The integer generated: " + num);
        while ((num /= 10) != 0)
            digit ++;
        System.out.println("Number of digits in the integer: " + digit);
    }
    
}
