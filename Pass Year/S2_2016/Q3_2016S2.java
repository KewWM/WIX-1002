package S2_2016;

import java.util.Scanner;

public class Q3_2016S2 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = ya.nextInt();
        
        for (int row = 0; row < line; row++)
        {
            for (int column = 0; column < line*2 -1; column++)
            {
                if(column >= (line - 1 - row) && column <= (line - 1 + row))
                {
                    if(column <= line - 1)
                        System.out.print(line - column);
                    else
                        System.out.print(column - line + 2);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}


