
package l4q8;
import java.util.Random;
public class L4Q8 {

    public static void main(String[] args)
    {
        Random ya = new Random();
        int num = ya.nextInt(101); int prime = 0;
        System.out.println("The random number generated: " + num);
        System.out.print("Prime number: ");
        
        if (num >= 7)
            System.out.print("2, 3, 5, 7, ");
        else if (num >= 5)
            System.out.print("2, 3, 5, ");
        else if (num >= 3)
            System.out.print("2, 3, ");
        else if (num >= 2)
            System.out.print("2, ");
        
        for(int n = 2; n <= num; n++)
        {
            for(int i = 2; i < n; ++i)
            {
                if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
                {
                    prime = 0;
                }
                else
                    prime = 1;
            }
            if (prime == 1)
                System.out.print(n +", ");
        }
        System.out.print("\n");
    }
    
}
