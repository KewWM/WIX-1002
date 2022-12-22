import java.util.Scanner;

public class ProbSolving2
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner (System.in);
        int factor, Calc;
        
        System.out.println("Enter a number (-1 to quit) : ");
        int num = ya.nextInt();
        
        for (int i = 0; i != num; i++)
        {
            System.out.print("Enter a factor : ");
            factor = ya.nextInt();
            Calc = num / factor;
            System.out.println(factor + " is a factor of " + num + "? (true/false): ");
        }
    }
}
