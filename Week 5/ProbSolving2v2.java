import java.util.Scanner;

public class ProbSolving2v2
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner (System.in);
        int num, factor, correct = 0, NOQ = 0;
        
        while(true)
        {
            System.out.print("Enter a number (-1 to quit) : ");
            num = ya.nextInt();
            if (num == -1)
                break;
            System.out.print("Enter a factor : ");
            factor = ya.nextInt();
            boolean isFactor = num % factor == 0;
            System.out.printf("%d is a factor of %d? (true/false): %b\n", factor, num, isFactor);
            if (isFactor)
            {
                System.out.println("Your answer is correct.");
                correct++;
            }
            else
                System.out.println("Your answer is incorrect.");
            NOQ++;
        }

        System.out.printf("The final score is %d/%d\n", correct, NOQ);
    }
}
