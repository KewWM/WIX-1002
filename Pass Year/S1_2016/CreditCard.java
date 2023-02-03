
package S1_2016;

public class CreditCard
{
    private final String name;
    private final String cardNum;
    protected String type;
    private double reward;

    public CreditCard(String name, String cardNum) 
    {
        this.name = name;
        this.cardNum = cardNum;
    }

    public double getReward() 
    {
        return reward;
    }

    public void setReward(double reward)
    {
        this.reward = reward;
    }

    @Override
    public String toString() 
    {
        String display;
        display = "CreditCard : " + name +
                " (" + cardNum + ")\nCard Type : " +
                type;    
        display +=  String.format("\nTotal Cash Reward: %.4f" ,reward);
        return display;
    }
    
    
}
