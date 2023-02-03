
package S1_2017;

import java.util.Scanner;

public class Q5Main 
{
    public static void main(String[] args) 
    {
        Scanner ya = new Scanner (System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int g = ya.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int s = ya.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int l = ya.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int c = ya.nextInt();
        System.out.println("");
        
        Essay es = new Essay(g, s, l, c);
        System.out.println(es);
    }
}
