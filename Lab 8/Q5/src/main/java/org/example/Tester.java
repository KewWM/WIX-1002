package org.example;

public class Tester
{
    public static void main(String[] args)
    {
        Game p1 = new Game("Naqib");
        Game p2 = new Game("Rosma");

        while (true)
        {
            if (pRollDice(p1))
                break;
            if (pRollDice(p2))
                break;
        }
    }

    public static boolean pRollDice(Game player)
    {
        player.rollDice();
        System.out.println(player.getName() + " Dice: " + player.getDice());
        System.out.println(player.getName() + " Total: " + player.getScore());

        //Winning condition
        if (player.getScore() >= 100)
        {
            System.out.println(player.getName() + " wins!");
            return true;
        }
        System.out.println();
        return false;
    }
}

