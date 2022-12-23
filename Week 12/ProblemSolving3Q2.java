import java.util.Scanner;

public class ProblemSolving3Q2 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        
        System.out.print("Enter number of teams: ");
        int N = ya.nextInt();
        int score[] = new int[N];
        String[] teamName = new String[N];
        
        for(int i = 0; i < N; i++)
        {
            System.out.print("Enter team " + (i + 1) + " name: ");
            teamName[i] = ya.next();
            System.out.print("Enter team " + (i + 1) + " score: ");
            score[i] = ya.nextInt(); 
        }
        
        //Bubble sort
        int holdI = 0; String holdN = "";
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N - 1; j++)
            {
                if (score[j] < score[j + 1])
                {
                    holdI = score[j]; holdN = teamName[j];
                    score[j] = score[j + 1]; teamName[j] = teamName[j + 1];
                    score[j + 1] = holdI; teamName[j + 1] = holdN;
                }
            }
        }
        
        //Display
        System.out.println("List of team with the highest team score first");
        for (int i = 0; i < N; i++)
        {
            System.out.print(teamName[i] + " (" + score[i] + ") | ");
        }
        System.out.println();
    }
}
