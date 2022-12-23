import java.util.Scanner;

public class Q4_2016S2
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = ya.nextInt( );
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double s = ya.nextDouble();
        System.out.printf("The area is: %.2f squared meters.\n", area(n, s));
    }
    
    public static double area(int n, double s)
    {
        return (n * s *s) / (4 * Math.tan(Math.toRadians(180/n)));
    }
}
