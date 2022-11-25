
import java.util.Scanner;
public class MidRev1 
{

    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        int x = ya.nextInt();
        int y = ya.nextInt();
        System.out.print("Enter the move: ");
        String move = ya.next();
        System.out.println("Initial Coordinate (" + x + "," + y + ")");
        char[] comd = move.toCharArray();
        System.out.print(comd[0]);
        for (int i = 0; i < comd.length; i++)
        {
            if (comd[i] == 'L')
            {
                x -= 1;
            }
            else if (comd[i] == 'R')
            {
                x += 1;
            }
            else if (comd[i] == 'U')
            {
                y += 1;
            }
            else if (comd[i] == 'D')
            {
                y -= 1;
            }
        }
        System.out.println("Final Coordinate (" + x + "," + y + ")");
    }
    
}
