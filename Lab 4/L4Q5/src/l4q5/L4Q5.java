
package l4q5;
import java.util.Random;
public class L4Q5 {

    public static void main(String[] args) {
        Random ya =new Random();
        int min = 1, max= 6, sum1 = 0, sum2 = 0, p1, p2;
        p1 = ya.nextInt(max+min);
        p2 = ya.nextInt(max+min);
        sum1 += p1;
        sum2 += p2;
        
        while(sum1 < 100 && sum2 < 100){
            
            if (p1 == 6){
                p1 = ya.nextInt(max+min);
                sum1 += p1;
            }
            if (p2 == 6){
                p2 = ya.nextInt(max+min);
                sum2 += p2;
            }
            p1 = ya.nextInt(max+min);
            p2 = ya.nextInt(max+min);
            sum1 += p1;
            sum2 += p2;
        }
        
        System.out.println("Total point Player 1: " + sum1);
        System.out.println("Total point Player 2: " + sum2);
        
        if (sum1 > sum2)
            System.out.println("Player 1 WINS!");
        else if (sum2 > sum1)
            System.out.println("Player 2 WINS!");
        else
            System.out.println("Its DRAW");
    }
    
}
