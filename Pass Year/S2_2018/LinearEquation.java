
package S2_2018;

public class LinearEquation 
{
    private final int a, b, c, d, e, f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public boolean isSolvable()
    {
        if (a * d - b * c != 0)
            return true;
        else
            return false;
    }
    
    public int computeX()
    {
        int x = ((e*d - b*f)/(a*d - b*c));
        return x;
    }
    
    public int computeY()
    {
        int y = ((a*f - e*c)/(a*d - b*c));
        return y;
    }
    
    
    @Override
    public String toString() 
    {
        return "The equation : \n" + a + 
                "x + " + b + "y = " + e + "\n" +
                c + "x + " + d + "y = " + f;      
    }
}
