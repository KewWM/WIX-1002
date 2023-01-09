package org.example;

public class BankAccount
{
    private String name;
    private String ICP;
    private double bal;

    public BankAccount (String name, String ICP, double depo)
    {
        this.name = name;
        this.ICP = ICP;
        bal = depo;
    }

    public void deposit(double amount)
    {
        bal += amount;
    }

    public void withdraw(double amount) {
        bal -= Math.min(bal, amount);
    }

    public void displayBalance()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ICP);
        System.out.printf("Balance: %.2f\n", bal);
    }

}