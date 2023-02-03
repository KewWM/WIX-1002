package S1_2017;

import java.util.Scanner;

public class Q1_2017S1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;
        int inputNumber; //number entered by user
        int value = 0; //number of stars to print
        int counter = 1; //counter for current number
        
        while (counter <= 5)
        {
            System.out.print("Enter number: ");
            inputNumber = input.nextInt();
            //define appropriate num if input is between 1-30
            if (inputNumber >= 1 && inputNumber <= 30)
            {
                switch (counter)
                {
                    case 1 -> number1 = inputNumber;
                    case 2 -> number2 = inputNumber;
                    case 3 -> number3 = inputNumber;
                    case 4 -> number4 = inputNumber;
                    case 5 -> number5 = inputNumber;
                }
            }//end if
            else
                System.out.println("Invalid Input\nNumber should be between 1 and 30");
            counter++;
        } //end while
        
        //print histograms
        
        for (counter = 1; counter <= 5; counter++)
        {
            switch (counter)
            {
                case 1 -> value = number1;
                case 2 -> value = number2;
                case 3 -> value = number3;
                case 4 -> value = number4;
                case 5 -> value = number5;
            } //switch
            for (int j = 1; j <= value; j++)
                System.out.print("*");
            System.out.println();
        } //end for loop
    } //end main
} //end class Graphs
