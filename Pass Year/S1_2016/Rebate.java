
package S1_2016;

public class Rebate extends CreditCard
{

    public Rebate(String name, String cardNum) 
    {
        super(name, cardNum);
        type = "Card Rebate";
    }
    
    public void getReward (String type, double price)
    {
        switch (type)
        {
            case "Fuel" ->
                setReward(getReward() + price * 0.08);
            case "Utility" ->
                setReward(getReward() + price * 0.05);
            case "Grocery" -> 
                setReward(getReward() + price * 0.02);
            case "Other" ->
                setReward(getReward() + price * 0.002);
        }
    }
}
