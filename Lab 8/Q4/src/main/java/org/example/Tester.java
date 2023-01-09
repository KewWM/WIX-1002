package org.example;

public class Tester
{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(840, 40);
        System.out.println(f1.getNumerator());
        System.out.println(f1.getDenominator());
        f1.displayLowestTerms();

        Fraction f2 = new Fraction();
        f2.setNumerator(60);
        f2.setDenominator(800);
        f2.displayLowestTerms();
    }

}
