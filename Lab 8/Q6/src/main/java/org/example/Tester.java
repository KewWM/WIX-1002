package org.example;

public class Tester
{
    public static void main(String[] args)
    {
        Burger s1 = new Burger("W1001",140);
        Burger s2 = new Burger("W1002",400);

        printBurgerSold(s1);
        printBurgerSold(s2);
        System.out.println("Total Burger Sold: " + Burger.getTtlBurgerSold());
        System.out.println();

        Burger s3 = new Burger("Fourth", 0);
        s3.sold(520);
        printBurgerSold(s3);
        System.out.println("Total Burger Sold: " + Burger.getTtlBurgerSold());
    }

    public static void printBurgerSold(Burger stall)
    {
        System.out.printf("Burger Stall (%s) Sold: %d\n", stall.getID(), stall.getBurgerSold());
    }

}
