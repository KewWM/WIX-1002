
import java.util.Scanner;
import java.util.Random;
public class L5Q1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random ya = new Random();
        int max = 0, min = 100, sum = 0;
        double ave = 0;
        
        System.out.print("Enter the number of student: ");
        int n = sc.nextInt();
        int[] score = new int[n];
        
        //generate score for n student
        for (int i = 0; i < n; i++)
        {
            score[i] = ya.nextInt(101);
            System.out.println("Student " + i + "'s score: " + score[i]);
            sum += score[i];
        }
        
        ave = sum / n;
        //find max n min
        for (int i = 0; i < n; i++)
        {
            if (score[i] > max)
                max = score[i];
            if (score[i] < min)
                min = score[i];
        }
        
        //output
        System.out.printf("The average score: %.2f",ave);
        System.out.println("\nThe highest score: " + max);
        System.out.println("The lowest score: " + min);
    }
    
}
