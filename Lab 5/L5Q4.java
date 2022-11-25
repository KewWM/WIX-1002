
public class L5Q4
{

    public static void main(String[] args)
    {
        int[][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "  "); 
            }
            System.out.print("\n");
        }//Original matrix showcase
        
        System.out.println("After rotates 90 degrees clockwise");
        int temp = matrix[0][0];
        matrix[0][0] = matrix[2][0];
        matrix[2][0] = matrix[2][2];
        matrix[2][2] = matrix[0][2];
        matrix[0][2] = temp;
        
        int tempp = matrix[0][1];
        matrix[0][1] = matrix[1][0];
        matrix[1][0] = matrix[2][1];
        matrix[2][1] = matrix[1][2];
        matrix[1][2] = tempp;
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "  "); 
            }
            System.out.print("\n");
        }
    }
    
}
