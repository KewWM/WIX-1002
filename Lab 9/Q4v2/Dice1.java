
package Lab9.Q4v2;

public class Dice1 extends Dice
{
    public Dice1()
    {
        super();
        startGame();
    }
    
    public void startGame()
    {
        while(true)
        {
            //Player 1
            System.out.println("Player 1's turn:");
            this.scoreP1 += playTurn();
            System.out.println("Player 1's score now: " + scoreP1 + "\n");
            if (this.checkPoint())
                break;
            //Player 2
            System.out.println("Player 2's turn:");
            this.scoreP2 += playTurn();
            System.out.println("Player 2's score now: " + scoreP2 + "\n");
            if (this.checkPoint())
                break;
        }
    }
    
    public int playTurn()
    {
        int score = 0;
        return play(score);
    }
    
     public int play(int score)
     {
        int roll1 = this.rollDice();
        System.out.println("Roll 1: " + roll1);
        int roll2 = this.rollDice();
        System.out.println("Roll 2: " + roll2);
        int sum = roll1 + roll2;
        score += sum;
        if (roll1 == roll2)
        {
            System.out.println("Player gets to roll again!");
            return play(score);
        }
        else
            return score;
    }
}
