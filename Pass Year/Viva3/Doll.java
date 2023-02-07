
package Viva3;

import java.util.Random;

public class Doll 
{
    protected String name;
    protected String hairColour;
    protected String wearing;
    protected String hair;
    protected String[] cHairColour = {"Red", "Green", "Blue"};
    protected String[] cWearing = {"Shirt", "Dress", "Jacket"};
    protected String[] cHair = {"Long", "Short"};

    public Doll(String name) 
    {
        this.name = name;
        Random ya = new Random();
        this.hairColour = cHairColour[ya.nextInt(3)];
        this.wearing = cWearing[ya.nextInt(3)];
        this.hair = cHair[ya.nextInt(2)];
    }
    
    public String changeHairColour()
    {
        if (hairColour.equals("Red"))
            this.hairColour = "Green";
        else if (hairColour.equals("Green"))
            this.hairColour = "Blue";
        else if (hairColour.equals("Blue"))
            this.hairColour = "Red";
        return this.hairColour;
    }
    
    public String cutHair()
    {
        if (hair.equals("Long"))
            this.hair = "Short";
        return this.hair;
    }

    @Override
    public String toString() 
    {
        String s = "Doll generated successfully!!!\nName: " + name +
                "\nHair Colour: " + hairColour +
                "\nWearing: " + wearing +
                "\nHair: " + hair;
        s += "\n\nAfter reforming!!!\nHair Colour: " + changeHairColour() +
                "\nWearing: " + wearing +
                "\nHair: " + cutHair();
        return s;
    }
    
    
}
