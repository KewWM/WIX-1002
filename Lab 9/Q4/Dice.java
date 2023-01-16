
package Lab9.Q4;

public class Dice 
{
    public void start() 
    {
        int totalScore1 = 0;
        int totalScore2 = 0;

        while (true) 
        {
            totalScore1 = rollDice("Player 1 -> ", totalScore1);
            if (totalScore1 >= 100) 
                break;
            
            totalScore2 = rollDice("Player 2 -> ", totalScore2);
            if (totalScore2 >= 100)
                break;
            System.out.println();
        }
        System.out.println((totalScore1 >= 100 ? "Player 1" : "Player 2") + " is the winner!");
    }

    //Method returns total score after the player rolls the dice.
    protected int rollDice(String playerName, int totalScore) 
    {
        return 0;
    }
}


