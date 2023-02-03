
package S1_2017;

public class Complex 
{
    private double a, c;    //Real part
    private double b, d;   //Imaginary part


    public Complex() {}

    public Complex(double a, double b) 
    {
        this.a = a;
        this.b = b;
    }

    public Complex(double a, double c, double b, double d) 
    {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public static void addComplexNum (double a, double c, double b, double d)
    {
        double real = a + c;
        double imag = b + d;
        System.out.println("Addition of the two complex numbers: (" + real + " + " + imag + "i)");
    }
    
    public static void subtractComplexNum (double a, double c, double b, double d)
    {
        double real = a - c;
        double imag = b - d;
        System.out.println("Addition of the two complex numbers: (" + real + " + " + imag + "i)");
    }

    @Override
    public String toString() 
    {
        return ("(" + a + " + " + b + "i)");
    }
    
    
}
