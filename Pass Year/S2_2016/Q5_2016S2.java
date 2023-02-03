
package S2_2016;

import java.util.Random;

public class Q5_2016S2 
{
    public static void main(String[] args)
    {
        Random ya = new Random();
        int[][] binary = new int[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                binary[i][j] = ya.nextInt(2);
                System.out.print(binary[i][j]);
            }
            System.out.println("");
        }
        
        //Counting site
        //Row
        if (binary[0][0] == 0 && binary[0][1] == 0 && binary[0][2] == 0)
            System.out.println("All 0s in row 0");
        if (binary[1][0] == 0 && binary[1][1] == 0 && binary[1][2] == 0)
            System.out.println("All 0s in row 1");
        if (binary[2][0] == 0 && binary[2][1] == 0 && binary[2][2] == 0)
            System.out.println("All 0s in row 2");
        if (binary[0][0] == 1 && binary[0][1] == 1 && binary[0][2] == 1)
            System.out.println("All 1s in row 0");
        if (binary[1][0] == 1 && binary[1][1] == 1 && binary[1][2] == 1)
            System.out.println("All 1s in row 1");
        if (binary[2][0] == 1 && binary[2][1] == 1 && binary[2][2] == 1)
            System.out.println("All 1s in row 2");
        
        //Column
        if (binary[0][0] == 0 && binary[1][0] == 0 && binary[2][0] == 0)
            System.out.println("All 0s in column 0");
        if (binary[0][1] == 0 && binary[1][1] == 0 && binary[2][1] == 0)
            System.out.println("All 0s in column 1");
        if (binary[0][2] == 0 && binary[1][2] == 0 && binary[2][2] == 0)
            System.out.println("All 0s in column 1");
        if (binary[0][0] == 1 && binary[1][0] == 1 && binary[2][0] == 1)
            System.out.println("All 1s in column 0");
        if (binary[0][1] == 1 && binary[1][1] == 1 && binary[2][1] == 1)
            System.out.println("All 1s in column 1");
        if (binary[0][2] == 1 && binary[1][2] == 1 && binary[2][2] == 1)
            System.out.println("All 1s in column 1");
        
        //Diagonal
        if (binary[0][0] == 0 && binary[1][1] == 0 && binary[2][2] == 0)
            System.out.println("All 0s in diagonal \\");
         if (binary[0][2] == 0 && binary[1][1] == 0 && binary[2][0] == 0)
            System.out.println("All 0s in diagonal /");      
         if (binary[0][0] == 1 && binary[1][1] == 1 && binary[2][2] == 1)
            System.out.println("All 1s in diagonal \\");
         if (binary[0][2] == 1 && binary[1][1] == 1 && binary[2][0] == 1)
            System.out.println("All 1s in diagonal /");  
    }
}
