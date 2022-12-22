import java.util.Scanner;

public class MidRev2
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        String type = "";
        double sale, tsale = 0;
        
        while(!type.equals("Quit"))
        {
            System.out.print("Enter the typr of durian [Quit] to terminate: ");
            type = ya.nextLine();
            if (type.equals("Quit")) break;
            System.out.print("Enter the sales in kg : ");
            sale = ya.nextDouble();
            ya.nextLine();
            
            int price = switch (type)
            {
                case "MK" -> 25;//tsale = tsale + (25 * sale);
                case "HL" -> 22;//tsale = tsale + (22 * sale);
                case "D24" -> 20;//tsale = tsale + (20 * sale);
                case "UM" -> 18;//tsale = tsale + (18 * sale);
                default -> -1;
            };
            tsale += (price * sale);
        }
        System.out.printf("Total Sales : %.2f", tsale);
        System.out.println("");
     }
}

//while(True)
//        {
//           System.out.print("Enter the typr of durian [Quit] to terminate: ");
//           type = ya.nextLine();
//           if (type.equals("Quit")) break;
//           System.out.print("Enter the sales in kg : ");
//           sale = ya.nextDouble();
//        }