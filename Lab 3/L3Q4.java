
import java.util.Random;
public class L3Q4 {

    public static void main(String[] args) {
        Random sc = new Random();
        int max = 6, min = 1;
        System.out.println("This is a dice competition.\n___________________________");
        int p1d1 = sc.nextInt(max-min+1)+min;
        int p1d2 = sc.nextInt(max-min+1)+min;
        int p2d1 = sc.nextInt(max-min+1)+min;
        int p2d2 = sc.nextInt(max-min+1)+min;
        
        int sum1 = p1d1 + p1d2;
        int sum2 = p2d1 + p2d2;
        char winP = 'N'; int dmark = 0;
        
        if (sum1 > sum2){
            winP = '1';
            dmark = sum1;
        }
        else{
            winP = '2';
            dmark = sum2;
        }
        System.out.println("Player 1 first dice: " + p1d1);
        System.out.println("Player 1 second dice: " + p1d2);
        System.out.println("Player 2 first dice: " + p2d1);
        System.out.println("Player 2 second dice: " + p2d2);
        System.out.println("Player with HIGHEST score is Player " + winP + " with mark: " + dmark);
    }
    
}
