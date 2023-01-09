package org.example;

public class Tester
{
    public static void main(String[] args) {
        Money money1 = new Money(520);
        money1.roundUp();
        money1.calculate();
        money1.display();

        Money money2 = new Money(87.1);
        money2.roundUp();
        money2.calculate();
        money2.display();

        Money substractMoney = Money.addition(money1,money2);
        substractMoney.calculate();
        substractMoney.display();

        Money addMoney = Money.subtraction(money1,money2);
        addMoney.calculate();
        addMoney.display();
    }
}
