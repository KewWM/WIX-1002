
import java.util.Scanner;
import java.util.Random;
public class L5Q5 
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random ya = new Random();
        int[] num = new int[20];
        
        System.out.println("A list of 20 random integer within 0 to 100");
        int i = 0; //input num
        do
        {
            num[i] = ya.nextInt(101);
            System.out.print(num[i]);
            if (i == 19) //no , is print at i = 19
                break;
            System.out.print(", ");
            i++;
        } while (i < num.length);
        System.out.println("\nArray in descending order");
        
        //Bubble sort
        for (int pass = 1; pass < num.length; pass++) 
        {
            for (i = 0; i < (num.length - 1); i++ ) 
            {
                if (num[i] < num[i+1])  
                {
                    int hold = num[i];
                    num[i] = num[i+1];
                    num[i+1] = hold; 
                }  
            }
        }
        
        //output sorted num
        i = 0;
        do
        {
            System.out.print(num[i]);
            if (i == 19)
                break;
            System.out.print(", ");
            i++; 
        }while (i < (num.length));
        
        boolean found = false;
        System.out.print("\nEnter a number to search: ");
        int key = sc.nextInt();
        //Linear search
        for (int ls = 0; ls < num.length; ls++ )
        {
            if (num[ls] == key)
            {
                System.out.println(key + " found");
                System.out.println("Linear Search - " + ls + " loop(s)");
                found = true;
            }  
        }
        if (found == false)
        {
            System.out.println("NOT found");
            System.out.println("Linear Search - NO result"); 
        }
        
        //binary search
        int max = (num.length - 1), min = 0, mid, count = 0;
        boolean found2 = false;
        while (min <= max)
        {
            mid = (max + min) / 2;
            if (key == num[mid])
            {
                System.out.println(key + " found");
                System.out.println("Binary Search - " + count + " loop(s)");
                found2 = true;
                break;
            }
            else if (key >= num[mid])
                max = mid - 1;
            else
                min = mid + 1;
            count++;
        }
        if (found2 == false)
        {
            System.out.println("NOT found");
            System.out.println("Binary Search - NO result");
        }
    }
}
