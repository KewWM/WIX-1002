package l2q3;
import java.util.Random;
public class L2Q3 {

    public static void main(String[] args) {
        Random gen = new Random();
        int mrange = 10, hrange = 50;
        int random_int1 = (int)Math.floor(Math.random()*(hrange-mrange+1)+mrange);
        int random_int2 = (int)Math.floor(Math.random()*(hrange-mrange+1)+mrange);
        int random_int3 = (int)Math.floor(Math.random()*(hrange-mrange+1)+mrange);
        System.out.println("First generated number: " + random_int1);
        System.out.println("Seciong generated number: " + random_int2);
        System.out.println("Third generated number: " + random_int3);
        
        int sum = random_int1 + random_int2 + random_int3;
        float ave = sum/3;
        System.out.println("Sum of three numbers is: " + sum);
        System.out.println("Average: " + String.format("%.2f",ave)); 
    }
    
}
