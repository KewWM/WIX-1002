
package Lab9.Q4v2;

import java.util.Random;

public class Dice 
{
    protected int scoreP1 = 0;
    protected int scoreP2 = 0;
 
    public int rollDice()
    {
        return new Random().nextInt(6) + 1;
    }
    
    public boolean checkPoint()
    {
        if (this.scoreP1 >= 100)
        {
            System.out.println("Player 1 wins!");
            return true;
        }
        else if (this.scoreP2 >= 100)
        {
            System.out.println("Player 2 wins!");
            return true;
        }
        else
            return false;
    }
}
