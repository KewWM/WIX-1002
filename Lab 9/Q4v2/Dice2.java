
package Lab9.Q4v2;

public class Dice2 extends Dice
{
    public Dice2()
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
        int roll = this.rollDice();
        System.out.println("Roll: " + roll);
        if (roll == 6) 
        {
            System.out.println("LUCKY! Player gets to roll againn!");
            roll = this.rollDice();
            System.out.println("Roll: " + roll);
            if (roll == 6) 
            {
                System.out.println("Sorry! Player get ZERO for this round!");
                return 0;
            } 
            else
                return 6 + roll;
        } 
        else
            return roll;
    }
}