import java.util.Scanner;

public class Q1_2016S2
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        float pound = ya.nextFloat();
        double kilo = pound * 0.454;
        System.out.print(pound + " pounds is ");
        System.out.printf("%.3f kilograms \n", kilo); 
    }
}
