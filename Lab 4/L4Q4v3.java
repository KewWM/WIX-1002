import java.util.Scanner;

public class L4Q4v3 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = ya.nextInt();
        System.out.print("Enter the first day of year: ");
        int day = ya.nextInt();
        
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0)
            day++;
        day = (day + 120) % 7;
        
        System.out.println();
        System.out.println("May");
        System.out.println("  S  M  T  W  T  F  S");
        System.out.print(" ".repeat(3 * day));
        for (int d = 1; d <= 31; day++, d++)
        {
            System.out.printf("%3d", d);
            if (day % 7 == 6)
                System.out.println();
        }
        System.out.println();
        
        day = (day + 61) % 7;
        System.out.println();
        System.out.println("August");
        System.out.println("  S  M  T  W  T  F  S");
        System.out.print(" ".repeat(3 * day));
        for (int d = 1; d <= 31; day++, d++)
        {
            System.out.printf("%3d", d);
            if (day % 7 == 6)
                System.out.println();
        }
        System.out.println();
    }
}
