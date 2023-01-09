package org.example;
import java.util.Random;
public class Game
{
    private Random ya = new Random();
    private String name;
    private int dice;
    private int score;
    public Game(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public int getDice()
    {
        return dice;
    }

    public int getScore()
    {
        return score;
    }

    public void rollDice()
    { //avoid 0
        score += dice = ya.nextInt(6) + 1;
    }

}