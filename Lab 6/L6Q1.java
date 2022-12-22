
public class L6Q1 
{

    public static void main(String[] args) 
    {
        System.out.println("First 20 triangular number: ");
        int n = 20;
        for (int i = 1; i <= n; i++)
            System.out.print(getNum(i) + ", ");
    }
    public static int getNum (int num)
    {
        int tnum = 0;
        for (int a = 1; a <= num; a++)
            tnum += a;
        return tnum;
    }
    
}
