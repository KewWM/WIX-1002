
import java.util.Scanner;
public class MidRev2
{

    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        String type;
        float sale, tsale = 0;
        
        type = "";
        int i = 1;
        do
        {
            System.out.print("Enter the type of durian [Quit] to terminate : " );
            type = ya.next();
            
            if (type == "Quit")
                break;
            
            if (Check(type))
            {
                System.out.print("Enter the sales in kg : ");
                sale = ya.nextFloat();
                if (type == "MK")
                    tsale = tsale + (25 * sale);
                else if (type == "HL")
                    tsale = tsale + (22 * sale);
                else if (type == "D24")
                    tsale = tsale + (20 * sale);
                else if (type == "UM")
                    tsale = tsale + (18 * sale);
            }
            i++;
        } while (false);
    }   
    public static boolean Check(String type)
    {
            boolean ans = false;
            if (type != "Quit")
                ans = true;
            return ans;
     }
}
 
        