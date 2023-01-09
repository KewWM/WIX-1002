package org.example;

public class Money
{
    private double ttlAmount;
    private int rm100, rm50, rm10, rm5, rm1, cent50, cent20, cent10, cent5;
    public Money(double  ttlAmount)
    {
        this.ttlAmount = ttlAmount;
    }

    public void roundUp()
    {
        int temp = (int)(this.ttlAmount*100);

        if(temp % 10 == 9 || temp % 10 == 4)
            this.ttlAmount += 0.01;
        else if(temp % 10 == 8 || temp % 10 == 3)
            this.ttlAmount += 0.02;
        else if(temp % 10 == 7 || temp % 10 == 2)
            this.ttlAmount -= 0.02;
        else if(temp % 10 == 6 || temp % 10 == 1)
            this.ttlAmount -= 0.01;
        this.ttlAmount = Math.round(this.ttlAmount * 100)/100.0;
    }
    public void calculate()
    {
        double temp = this.ttlAmount;

        rm100 += temp/100;
        temp -= rm100 * 100;
        temp = Math.round(temp * 100)/100.0;

        rm50 += temp/50;
        temp -= rm50 * 50;
        temp = Math.round(temp * 100)/100.0;

        rm10 += temp/10;
        temp -= rm10 * 10;
        temp = Math.round(temp * 100)/100.0;

        rm5 += temp/5;
        temp -= rm5 * 5;
        temp = Math.round(temp * 100)/100.0;

        rm1 += temp/1;
        temp -= rm1 * 1;
        temp = Math.round(temp * 100)/100.0;

        cent50 += temp/0.5;
        temp -= cent50 * 0.5;
        temp = Math.round(temp * 100)/100.0;

        cent20 += temp/0.2;
        temp -= cent20 * 0.2;
        temp = Math.round(temp * 100)/100.0;

        cent10 += temp/0.1;
        temp -= cent10 * 0.1;
        temp = Math.round(temp * 100)/100.0;

        cent5 += temp/0.05;
    }

    public static Money addition(Money a,Money b)
    {
        System.out.println("For addition:");
        Money c = new Money(a.ttlAmount+b.ttlAmount);
        return c;
    }

    public static Money subtraction(Money a, Money b)
    {
        System.out.println("For subtraction:");
        Money c = new Money(a.ttlAmount-b.ttlAmount);
        return c;
    }

    public void display()
    {
        System.out.printf("The total amount of money is RM%.2f\n",this.ttlAmount);
        System.out.println("The number of RM100 is "+rm100);
        System.out.println("The number of RM50 is "+rm50);
        System.out.println("The number of RM10 is "+rm10);
        System.out.println("The number of RM5 is "+rm5);
        System.out.println("The number of RM1 is "+rm1);
        System.out.println("The number of 50 sen is "+cent50);
        System.out.println("The number of 20 sen is "+cent20);
        System.out.println("The number of 10 sen is "+cent10);
        System.out.println("The number of 5 sen is "+cent5+"\n");
    }
}