
package l3q2;
import java.util.Random;
public class L3Q2 {

    public static void main(String[] args) {
        Random gen = new Random();
        int num = gen.nextInt(6);
        String name = " ";
        if (num == 0)
            name = "zero.";
        else if (num == 1)
            name = "one.";
        else if (num == 2)
            name = "two.";
        else if (num == 3)
            name = "three.";
        else if (num == 4)
            name = "four.";
        else if (num == 5)
            name = "five.";
        
        System.out.println(num + " is " + name);
        
    }
    
}
