
package S1_2018;

public class Q5_2018S1 
{
    public static void main(String[] args) 
    {
        Fruit a1 = new Apple(8, "Apple", "Red");
        Fruit a2 = new Apple(11, "Apple", "Green");
        Fruit w1 = new Watermelon(7.6, "Watermelon", "Local");
        Fruit w2 = new Watermelon(4, "Watermelon", "Imported");
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println("The cheapest item is");
        
        if (a1.totalPrice() < a2.totalPrice() && a1.totalPrice() < w1.totalPrice() && a1.totalPrice() < w2.totalPrice())
            System.out.println(a1);
        else if (a2.totalPrice() < a1.totalPrice() && a2.totalPrice() < w1.totalPrice() && a2.totalPrice() < w2.totalPrice())
            System.out.println(a2);
        else if (w1.totalPrice() < a1.totalPrice() && w1.totalPrice() < a2.totalPrice() && w1.totalPrice() < w2.totalPrice())
            System.out.println(w1);
        else
            System.out.println(w2);
    }
}
