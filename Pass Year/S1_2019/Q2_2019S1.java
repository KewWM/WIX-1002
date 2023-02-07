
package S1_2019;

import java.util.Scanner;
import java.util.Random;

public class Q2_2019S1 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = ya.nextInt();
        
        Random walao = new Random();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        
        //Generate num in matrix
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                A[i][j] = walao.nextInt(10);
                B[i][j] = walao.nextInt(10);
            }
        }
        
        System.out.println("Matrix A");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                display(N, A[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Matrix B");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                display(N, B[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Matrix A + B");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(addM(N, A[i][j], B[i][j]) + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Matrix A X B");
        multiplyM(N, A, B);
        System.out.println("");
        
    }
    
   
    
    public static void display(int N, int A)
    {
        System.out.print(A + " ");
    }
    
    public static int addM(int N, int A, int B)
    {
        int add = A + B;
        return add;
    }
    
    
    public static void multiplyM(int N, int[][] A, int[][] B)
    {
        int a = 0, b = 0, c = 0, d = 0;
        a = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        b = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        c = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        d = A[1][0] * B[0][1] + A[1][1] * B[1][1];
        System.out.print(a + " " + b + "\n" + c + " " + d);
    }
    
     public static int[][] mulMat (int[][] mat1, int[][] mat2, int n)
    {
        int[][] multi = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    multi[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return multi;
    }
}


