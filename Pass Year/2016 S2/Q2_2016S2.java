import java.util.Scanner;

public class Q2_2016S2
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner (System.in);
        int num, sum = 0;
        System.out.print("Enter a number between 0 and 1000: ");
        num = ya.nextInt();
        
        while (num > 0)
        {
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        
        System.out.println("The sum of the digit is " + sum);
    }
}
