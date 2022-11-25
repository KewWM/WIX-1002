
import java.util.Scanner;
import java.util.Random;
public class L6Q5
{

    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        Random nono = new Random();
        int score = 0;
        do
        {
            int para1 = nono.nextInt(13);
            int para2 = nono.nextInt(13);
            System.out.println("Enter negative number to quit.");
            System.out.print(para1 + " x " + para2 + " = ");
            int guess = ya.nextInt();
            
            //When negative number entered, end
            if (guess < 0)
                break;
            
            //If correct
            if (Check(para1, para2, guess))
                score++;
        } while (true);
        System.out.println("Your Score is " + score);
    }
    
    //Method - Check answer correct?
    public static boolean Check(int a, int b, int c)
    {
        boolean ans = false;
        if (c == (a * b))
            ans = true;
        return ans;
    }
}
