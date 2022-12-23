import java.util.Scanner;
import java.util.Random;

public class ProblemSolving3Q3
{
    public static void main(String[] args) 
    {
        Scanner oi = new Scanner (System.in);
        Random ya = new Random();
        
        System.out.print("Enter the numver of random integer: ");
        int N = oi.nextInt();
        
        //Gen Random integer first
        int num[] = new int[N];
        for (int i = 0; i < N; i++)
        {
            num[i] = ya.nextInt(Math.abs(10001));
        }
        
        //Display 1
        System.out.print("The random integer : ");
        displayNum(N, num);
        System.out.println();
        
        //Display 2
        System.out.print("Minimum Number : ");
        findMin(N, num);
        System.out.println();
        
        //Display 3
        System.out.print("The approximation of the integer to the nearest hundred : ");
        approTo100(N, num);
        System.out.println();
        
        //Display 4
        System.out.print("The random integer in reverse order : ");
        intReverse(N, num);
        System.out.println();
    }
    
    //Display integers in array
    public static void displayNum(int N, int num[])
    {
        for (int i = 0; i < N; i++)
        {
            System.out.print(num[i] + " ");
        }  
    }
    
    //Find Min Number
    public static void findMin(int N, int num[])
    {
        int min = 100000;
        for (int i = 0; i < N; i++)
        {
            if (num[i] < min)
                min = num[i];   
        }  
        System.out.print(min);
    }
    
    //Display approximation to nearest hundred
    public static void approTo100(int N, int num[])
    {
        for (int i = 0; i < N; i++)
        {
            if (num[i] % 100 <= 49)
                System.out.print((num[i] - (num[i] % 100)) + " ");
            else
                System.out.print(num[i] + (100 - (num[i] % 100)) + " ");
        }
    }
    //Alternative: System.out.print(Math.round((num[i] / 100) * 100) + " ");
    
    //Display Reverse Order
    public static void intReverse(int N, int num[])
    {
        for (int i = 0; i < N; i++)
        {
           int reverse = 0;
           for (int a = num[i]; a > 0; a /= 10)
                reverse = (10 * reverse) + (a % 10);
           num[i] = reverse; 
            System.out.print(num[i] + " ");
        }  
    }
}
