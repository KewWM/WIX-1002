package org.example;

public class Tester
{
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("Najib Razik", "1214520-99-1520", 260000000);
        myAcc.displayBalance();
        System.out.println();

        myAcc.deposit(700000);
        myAcc.displayBalance();
        System.out.println();

        myAcc.withdraw(520520);
        myAcc.displayBalance();
        System.out.println();

        myAcc.withdraw(260000000);
        myAcc.displayBalance();
    }

}
