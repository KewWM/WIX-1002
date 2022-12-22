import java.util.Scanner;
import java.util.Random;

public class ProbSolving1
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        Random oi = new Random();
        int ID, Cond1, Cond2, workN = 0;
        
        System.out.print("Enter the number of staff [N] : ");
        int numS = ya.nextInt();
        
        for (int i = 0; i < numS; i++)
        {
            ID = oi.nextInt(99999)+10000;
            System.out.println("Stuff ID : " + ID);
            System.out.print("Weekend ");
            Cond1 = ID / 1000;      //ID / 1000 % 10;
            Cond2 = ID / 10;        //ID / 10 % 10;
            if ((Cond1 % 2 == 1) && (Cond2 % 2 == 0))
            {
                System.out.println("Duty");
                workN++;
            }
            else
                System.out.println("Off");
        }
        System.out.println("The number of staffs work during weekend is " + workN);
    }
}
