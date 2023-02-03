
package S1_2016;

public class Q5_2016S1 
{
    
    public static void main(String[] args) 
    {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");
        String[] type = {"Grocery", "Other", "Fuel", "Utility", "Other"};
        String[] day = {"Saturday", "Firday", "Sunday", "Friday", "Tuesday"};
        double[] price = {124.80, 64.60, 95.40, 100.00, 220.00};
        
        for (int i = 0; i < type.length; i++)
        {
            r.getReward(type[i], price[i]);
            p.getReward(day[i], price[i]);
        }
        
        System.out.println(r.toString());
        System.out.println(p.toString());
        
        if (r.getReward() > p.getReward())
            System.out.println("Cash Rebate Card is better than Point Reward Cardlah");
        else
            System.out.println("Point Reward Card is better than Caash Rebate Cardlah");
    }
}
