package org.example;

public class Fraction
{
    private int nume;
    private int denomi;
    public Fraction()
    {

    }
    public Fraction(int nume, int denomi)
    {
        this.nume = nume;
        this.denomi = denomi;
    }

    public void setNumerator(int nume)
    {
        this.nume = nume;
    }
    public void setDenominator(int denomi)
    {
        this.denomi = denomi;
    }
    public int getNumerator()
    {
        return nume;
    }
    public int getDenominator()
    {
        return denomi;
    }

    public void displayLowestTerms()
    {
        int gcd = gcd(nume, denomi);
        System.out.printf("Fraction reduced to lowest terms: %d/%d\n", nume / gcd, denomi / gcd);
    }

    private int gcd(int a, int b)
    {
        while (b > 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}