import java.util.Scanner;
public class L6Q3v2
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
         
        reverse(num);
        
        //After Reverse
        System.out.print("After Reverse: ");
        for (int i : num)
            System.out.printf("%3d ", i);
        System.out.println();
    }
    
    public static void reverse(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int reverse = 0;
            for (int num = a[i]; num > 0; num /= 10)
                reverse = (10 * reverse) + (num % 10);
            a[i] = reverse;
        }
    }
}
