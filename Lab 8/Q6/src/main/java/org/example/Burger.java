package org.example;

public class Burger
{
    private String ID;
    private int numB;
    private static int ttlB;
    public Burger(String ID, int numB)
    {
        this.ID = ID;
        sold(numB);
    }
    public String getID()
    {
        return ID;
    }

    public int getBurgerSold()
    {
        return numB;
    }

    public static int getTtlBurgerSold()
    {
        return ttlB;
    }

    public void sold(int amount)
    {
        numB += amount;
        ttlB += amount;
    }

}