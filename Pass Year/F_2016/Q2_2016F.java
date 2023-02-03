
package F_2016;

import java.util.Scanner;

public class Q2_2016F 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter number of teans: ");
        int N = ya.nextInt();
        String name[] = new String[N];
        int score[] = new int[N];
        int sort[] = new int[N];
        
        for(int i = 0; i < N; i++)
        {
            System.out.print("Enter team " + (i+1) + " name: ");
            name[i] = ya.next();
            System.out.print("Enter team " + (i+1) + " score: ");
            score[i] = ya.nextInt();
            sort[i] = i;
        }
        
        System.out.println("List of team with the highest team score first");
        //Bubble sort
        for (int pass = 1; pass < N; pass++)
        {
            for (int i = 0; i < N-1; i++)
            {
                if (score[i] < score[i+1])
                {
                    int temp1 = score[i];
                    score[i] = score[i+1];
                    score[i+1] = temp1;
                    String temp2 = name[i];
                    name[i] = name[i+1];
                    name[i+1] = temp2;
                }
            }
        }
        
        //Display
        for(int i = 0; i < N; i++)
        {
            System.out.print(name[i] + "(" + score[i] + ") | ");
        }
        System.out.println("");
    }
}
