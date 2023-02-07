
package Viva3;

import java.util.Random;

public class Pokemon
{
    protected String ID, name, elementType;
    protected int hp, att, def, spd, special, lvl;

    public Pokemon(String ID, String name, String elementType) 
    {
        this.ID = ID;
        this.name = name;
        this.elementType = elementType;
    }
    
    public void generateValue()
    {
        Random ya = new Random();
        this.lvl = 1;
        this.hp = ya.nextInt(11)+15;
        this.att = ya.nextInt(8)+10;
        this.def = ya.nextInt(8)+10;
        this.spd = ya.nextInt(11)+5;
        this.special = ya.nextInt(6)+5;
        String out = "\nLevel: " + lvl + "\nHP: " + hp + "\nAttack: " + att + "\nDefence: " + def + "\nSpeed: " + spd + "\nSpecial: " + special + "\n";
        System.out.print(out);
    }
    
    public void levelUp()
    {
        Random oi = new Random();
        for(int i = 0; i < 3; i++)
        {
            this.hp += oi.nextInt(4)+2;
            this.att += oi.nextInt(3)+1;
            this.def += oi.nextInt(3)+1;
            this.spd += oi.nextInt(3)+1;
            this.special += oi.nextInt(3)+1;
            this.lvl++;
            String out = "\nLevel Up!!!\nlevel: " + lvl + "\nHP: " + hp + "\nAttack: " + att + "\nDefence: " + def + "\nSpeed: " + spd + "\nSpecial: " + special + "\n";
            System.out.println(out);
        }
    }
    
    public void initial()
    {
        System.out.print(ID + ": " + name + "\nElement: " + elementType);
        this.generateValue();
    }

    
}
