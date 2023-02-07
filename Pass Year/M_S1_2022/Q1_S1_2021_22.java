
import java.util.Random;

public class Q1_S1_2021_22 
{
    public static void main(String[] args) 
    {
        Random ya = new Random();
        
        System.out.print("3 random price values : ");
        for (int i = 0; i < 3; i++)
        {
            double price = 100.00 + (200.00 *  ya.nextDouble());
            System.out.printf("%.2f ", price);
        }
        System.out.println("");
        
        System.out.print("5 random even-numbered years : ");
        for (int i = 0; i < 5; i++)
        {
            int even = ya.nextInt(41)+1990;
            while (even%2 != 0)
                even = ya.nextInt(41)+1990;
            System.out.print(even + " ");
        }
        System.out.println("");
        char c = 'Z';
        System.out.print("Car Plate Number : ");
        for(int i = 0; i < 5; i++)
        {
            int no = ya.nextInt(10);
            System.out.print(no);
        }
        for(int i = 0; i < 2; i++)
        {
            c = (char)(ya.nextInt('Z' - 'A') + 'A');
            System.out.print(c);
        }
        System.out.println("");
        
        System.out.print("Random Word : ");
        for(int i = 0; i < 8; i++)
        {
            int upLow = ya.nextInt(2);
            if (upLow == 0) //UpperCase
            {
                c = (char)(ya.nextInt('Z' - 'A') + 'A');
                System.out.print(c);
            }
            else
            {
                c = (char)(ya.nextInt('z' - 'a') + 'a');
                System.out.print(c);
            }
        }
        System.out.println("");
    }
}
