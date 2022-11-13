
package l6q3;
import java.util.Scanner;
public class L6Q3
{

    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        int num[] = new int[10];
        System.out.print("Enter 10 numbers: ");
        
        //Input
        for (int i = 0; i < num.length; i++)
            num[i] = ya.nextInt();   
        
        //Original arrangement
        System.out.print("Original: ");
        for (int i = 0; i < num.length; i++)
            System.out.print(num[i] + " ");
         System.out.println("");
         
        //call Reverse
        System.out.print("Reversed: ");
        Reverse(num);
        
    }
    public static void Reverse(int[] num)
    {
        for (int i = num.length - 1; i >= 0; i--)
        {
            System.out.print(num[i] + " ");
        }
    }
}
