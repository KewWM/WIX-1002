
package l4q8v2;
import java.util.Random;
public class L4Q8v2 {

    public static void main(String[] args) {
        Random ya = new Random();
        int num = ya.nextInt(101);
        System.out.println("The random number generated: " + num);
        System.out.print("Prime number: ");
        //find all prime numbers in the given range
        for(int n=2; n<=num; n++) {
            //check if this number is prime
            if(isPrime(n))
                System.out.print(n + ", ");
        }
        System.out.println(" ");
    }
     //method
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    
}
