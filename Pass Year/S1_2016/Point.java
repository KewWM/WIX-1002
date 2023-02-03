
package S1_2016;

public class Point extends CreditCard
{

    public Point(String name, String cardNum) 
    {
        super(name, cardNum);
        type = "Point Reward";
    }
    
    public void getReward(String day, double price)
    {
        switch (day)
        {
            case "Friday" -> 
                setReward(getReward() + (Math.floor(price) * 2) / 100);
            case "Saturday" -> 
                setReward(getReward() + (Math.floor(price) * 3) / 100);
            case "Sunday" -> 
                setReward(getReward() + (Math.floor(price) * 4) / 100);
            default ->
                setReward(getReward() + (Math.floor(price) / 100));
        }
    }
}
