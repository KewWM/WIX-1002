
public class L6Q1 
{

    public static void main(String[] args) 
    {
        System.out.println("First 20 triangular number: ");
        int n = 20;
        for (int i = 0; i < n; i++)
            System.out.print(getNum(i) + ", ");
    }
    public static int getNum (int num)
    {
        int tnum = 1;
        for (int a = 0; a < num; a++)
            tnum += 1;
        return tnum;
    }
    
}
