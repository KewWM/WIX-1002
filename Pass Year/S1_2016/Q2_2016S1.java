package S1_2016;

import java.util.Scanner;
import java.util.Random;

public class Q2_2016S1
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        Random oi = new Random();
        //Counter to win(3)
        int cPlayer = 0, cComp = 0;
        while (cPlayer != 3 && cComp != 3)
        {
            //Both Player and Computer input
            int compt = oi.nextInt(3) + 1;
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int player = ya.nextInt();
            System.out.print("Player : ");
            switch (player)
            {
                case 1 -> System.out.print("Paper");
                case 2 -> System.out.print("Scissor");
                case 3 -> System.out.print("Rock");
            }
            System.out.print(" ---- Computer : ");
            switch (compt)
            {
                case 1 -> System.out.println("Paper");
                case 2 -> System.out.println("Scissor");
                case 3 -> System.out.println("Rock");
            }

            //Determine who win the round
            if (player == compt)//Draw
                System.out.println("Draw!");
            else if (player == 1)
            {
                if (compt == 2)
                {
                    cComp++;
                    System.out.println("Computer win " + cComp + " time(s)");
                }
                else
                {
                    cPlayer++;
                    System.out.println("Player win " + cPlayer + " time(s)");
                }
            }
            else if (player == 2)
            {
                if (compt == 1)
                {
                    cPlayer++;
                    System.out.println("Player win " + cPlayer + " time(s)");
                }
                else
                {
                    cComp++;
                    System.out.println("Computer win " + cComp + " time(s)");
                }
            }
            else if (player == 3)
            {
                if (compt == 1)
                {
                    cComp++;
                    System.out.println("Computer win " + cComp + " time(s)");
                }
                else
                {
                    cPlayer++;
                    System.out.println("Player win " + cPlayer + " time(s)");
                }
            }
            
        }
        if (cPlayer == 3)
            System.out.println("PLayer wins the game.");
        else
            System.out.println("Computer wins the game.");
    }
}
