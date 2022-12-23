import java.util.Random;
import java.util.Scanner;

public class Q3_2016S1 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        Random oi = new Random();
        
        System.out.print("Enter the number of random integer: ");
        int n = ya.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = oi.nextInt(1001);
        
        //Display 1
        System.out.print("The random integer : ");
        displayInt(n, num);
        System.out.println();
        
        //Display 2
        System.out.print("Maximum number : " + getMax(n, num));
        System.out.println();
        
        //Display 3
        System.out.print("The approximation of the integer to the nearest tenth : ");
        getTen(n, num);
        System.out.println();
        
        //Display 4
        System.out.print("The random integer in reverse order : ");
        getReverse(n, num);
        System.out.println();
    }
    
    //Display integer
    public static void displayInt(int N, int[] a)
    {
        for (int i = 0; i < N; i++)
            System.out.print(a[i] + " ");
    }
    
    //Max
    public static int getMax(int N, int[] a)
    {
        int max = 0;
        for (int i = 0; i < N; i++)
        {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    
    //Approximation to tenth
    public static void getTen(int N, int[] a)
    {
        for (int i = 0; i < N; i++)
        {
            if (a[i] % 10 <= 4)
                System.out.print((a[i] - (a[i] % 10)) + " ");
            else
                System.out.print(a[i] + (10 - (a[i] % 10)) + " ");
        }
    }
    
    //Reverse
    public static void getReverse(int N, int[] a)
    {
        for(int i = 0; i < N; i++)
        {
            String charN = Integer.toString(a[i]);
            for(int j = charN.length() - 1; j >= 0; j--)
            {
                System.out.print(charN.charAt(j));
            }
            System.out.print(" ");
        }
    }
    
}
