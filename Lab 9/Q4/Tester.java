
package Lab9.Q4;

public class Tester 
{
    public static void main(String[] args) 
    {
        FirstGame firstDiceGame = new FirstGame();
        System.out.println("First Dice Game");
        firstDiceGame.start();
        System.out.println();

        SecondGame secondDiceGame = new SecondGame();
        System.out.println("Second Dice Game");
        secondDiceGame.start();
    }
}

