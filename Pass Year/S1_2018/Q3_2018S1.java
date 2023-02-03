
package S1_2018;

import java.util.Scanner;

public class Q3_2018S1 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size = ya.nextInt();
        System.out.print("Enter font type: ");
        char type = ya.next().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = ya.nextInt();
        
        if (format == 1)
        {
            //Head
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);

            System.out.println("");
            for (int l = 0; l < size; l++)
            {
               multiPrint(type);
                for (int i = 0; i < size; i++)
                {
                    System.out.print(" ");
                }
                multiPrint(type); 
                System.out.println("");
            }

            //Mid
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);

            System.out.println("");
            for (int l = 0; l < size; l++)
            {
               multiPrint(type);
                for (int i = 0; i < size; i++)
                {
                    System.out.print(" ");
                }
                multiPrint(type); 
                System.out.println("");
            }

            //End
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);
            System.out.println("");
        }
        
        else
        {
            //Head
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);
            
            System.out.println("");
            for (int l = 0; l < size; l++)
            {
               multiPrint(type);
                for (int i = 0; i < size; i++)
                {
                    System.out.print(" ");
                }
                multiPrint(type); 
                for (int i = 0; i < size; i++)
                {
                    System.out.print(" ");
                }
                multiPrint(type); 
                System.out.println("");
            }
            
            //End
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);
            for (int i = 0; i < size; i++)
            {
                multiPrint(type);
            }
            multiPrint(type);
            System.out.println("");
        }
    }
    
    public static void multiPrint(char type)
    {
        System.out.print(type);
    }    
}
