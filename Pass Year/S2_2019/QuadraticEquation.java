
package S2_2019;

public class QuadraticEquation 
{
    private int a, b, c;

    public QuadraticEquation(int a, int b, int c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() 
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB() 
    {
        return b;
    }

    public void setB(int b) 
    {
        this.b = b;
    }

    public int getC() 
    {
        return c;
    }

    public void setC(int c) 
    {
        this.c = c;
    }
    
    public double Discriminant()
    {
        double temp;
        temp = Math.pow(b,2) - (4 * a * c);
        return temp;
    }
    
    public double calcRoot1()
    {
        double r1 = ((0 - b) + Math.sqrt(Discriminant())) / (2 * a);
        return r1;
    }
    
    public double calcRoot2()
    {
        double r2 = ((0 - b) - Math.sqrt(Discriminant())) / (2 * a);
        return r2;
    }
}
