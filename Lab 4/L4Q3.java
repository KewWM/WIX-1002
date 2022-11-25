
import java.util.Scanner;
public class L4Q3 {

    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in);
        int min = 10000, max = 0, sum = 0, time = 0, score2 = 0;
        
        System.out.print("Enter a score [negative score to quit]: ");
        int score = ya.nextInt();
        
        while (score >= 0){
            sum += score;
            if (score > max)
                max = score;
            else
                min = score;
            time++;
            score2 += Math.pow(score,2);
            System.out.print("Enter a score [negative score to quit]: ");
            score = ya.nextInt();
        }
        float ave = sum / time;
        double var = (score2 - (Math.pow(sum,2)/time))/(time - 1), sdev = Math.sqrt(var);
        
        System.out.println(Math.floor(var)); //display output(double) with one decimal only
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.println("Average Score: " + String.format("%.2f",ave));
        System.out.println("Standard Deviation: " + String.format("%.2f",sdev));
    }
    
}
