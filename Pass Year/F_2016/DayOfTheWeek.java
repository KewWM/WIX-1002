
package F_2016;

public class DayOfTheWeek
{
    private final int q, m, y;
    private double h, J, K;

    public DayOfTheWeek(int q, int m, int y) 
    {
        this.q = q;
        this.m = m;
        this.y = y;
    }
    
    public double getValidFeb ()
    {
        h = (q + Math.floor((13*m + 13)/5) + K + Math.floor(K/4) + Math.floor(J/4) + (5 * J)) % 7;
        return h;
    }
    
    public void determine ()
    {
        J = y / 100;
        K = y % 100;
        if (getValidYear() == true)
        {
            
        }
        else
        {
            
        }
    }
    
    public boolean getValidYear ()
    {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString()
    {
        return q + "/" + m + "/" + y + " is " + 
                getValidYear() + h;
    }
    
    
}
