
package l2q5;

import java.util.Random;
public class L2Q5 {

    public static void main(String[] args) {
        Random sc = new Random();
        int random_num = sc.nextInt(10001);
        System.out.println("Number generated: " + random_num);
        int sum = 0, dnum;
        
        while (random_num > 0){
            dnum = random_num%10;
            sum = sum + dnum;
            random_num = random_num/10; 
        }

        System.out.println("Sum of all the digits in the number: " + sum);
    }
    
}
