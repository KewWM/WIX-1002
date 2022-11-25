
import java.util.Scanner;
public class L5Q6 {

    public static void main(String[] args) {
        Scanner ya = new Scanner (System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = ya.nextInt( );
        int[][] mat = new int[n][n];
        System.out.println("The Pascal Triangle with " + n + " row(s)");
        
        for(int i = 0;i < mat.length; i++)
        {
            for(int j = 0; j< mat.length; j++)
            {
                if(j > i)
                    mat[i][j]=0;
                else if(j == 0 || j == i)
                    mat[i][j] = 1; //first column
                else
                    mat[i][j]= mat[i - 1][j - 1] + mat[i - 1][j];
                    /*|a b|
                      |c d| case where d = a + b
                    */
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");//next row
        }
                
    }
    
}
