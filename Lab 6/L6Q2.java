
public class L6Q2 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 6; i++)
        {
            multiPrint(6 - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        System.out.println();
        
        for (int i = 1; i <= 6; i++)
        {
            multiPrint(Math.min(i, 6 + 1 - i), '*');
            System.out.println();
        }
        System.out.println();
        
        //Hardcore Method Triangle
        multiPrint(5, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(4, ' ');
        multiPrint(3, '*');
        System.out.println();
        multiPrint(3, ' ');
        multiPrint(5, '*');
        System.out.println();
        multiPrint(2, ' ');
        multiPrint(7, '*');
        System.out.println();
        multiPrint(1, ' ');
        multiPrint(9, '*');
        System.out.println();
        multiPrint(11, '*');
        System.out.println();
        System.out.println();
        
        //Hardcore Method Diamond
        multiPrint(3, ' ');
        multiPrint(3, '*');
        System.out.println();
        multiPrint(1, ' ');
        multiPrint(1, '*');
        multiPrint(5, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(1, '*');
        multiPrint(7, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(1, ' ');
        multiPrint(1, '*');
        multiPrint(5, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(2, ' ');
        multiPrint(1, '*');
        multiPrint(3, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(3, ' ');
        multiPrint(1, '*');
        multiPrint(1, ' ');
        multiPrint(1, '*');
        System.out.println();
        multiPrint(4, ' ');
        multiPrint(1, '*');
        System.out.println();
        
    }
    public static void multiPrint(int n, char c)
    {
        for(int i=0 ; i<n ; i++)
            System.out.print(c);
    }
} 