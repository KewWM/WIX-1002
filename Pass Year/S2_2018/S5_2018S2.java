
package S2_2018;

import java.util.Scanner;

public class S5_2018S2 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = ya.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = ya.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = ya.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = ya.nextInt();
        System.out.println("");
        
        Essay e = new Essay(grammar, spelling, length, content);
        System.out.println(e);
    }
}
