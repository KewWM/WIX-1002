
import java.util.Random;
import java.util.Scanner;
public class L5Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ya = new Random();
        int[] day = new int[7];
        int total, N, i = 0;;
        
        //No.of Emplayee
        System.out.print("Emter number of emplyee: ");
        N = sc.nextInt();
        System.out.println("_____________________________");
        
        for (int c = 0; c < N; c++)
        {
            total = 0;
            System.out.println("Employee " + (c+1));
            do
            {
                System.out.print("Day " + (i+1));
                day[i] = ya.nextInt(8)+1;
                System.out.println(": " + day[i]);
                total += day[i];
                i++;
            } while (i < day.length);
            i = 0;
            System.out.println("Total hours: " + total + "\n");
        }
            
    }
    
}
