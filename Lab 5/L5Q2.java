
package l5q2;
import java.util.Random;
public class L5Q2
{

    public static void main(String[] args)
    {
        Random ya = new Random();
        int[] num = new int[10];
        int i = 0;
        boolean dup = false;
        
        
        do
        {   //similar with for (int c = 0; c < num.length; c++)
            do
            {
                //generate number
                num[i] = ya.nextInt(21);
                //chech duplicate?
                for (int c = i-1; c >= 0; c--)//check from highest index to index-0
                {
                    if (num[i] == num[c])
                    {
                        dup = true;
                        break;
                    }
                    else
                        dup = false;
                }
            } while (dup); //repeat if duplicate
            i++;
        } while (i < num.length);
        
        for (int pri : num)
        System.out.println(pri);
    }
    
}
