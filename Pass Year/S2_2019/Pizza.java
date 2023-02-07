
package S2_2019;

public class Pizza 
{
    protected String size;
    protected int numOfCheese;
    protected int numOfBeefTopping;
    protected int numOfChickenTopping;

    public Pizza(String size, int numOfCheese, int numOfBeefTopping, int numOfChickenTopping) 
    {
        this.size = size;
        this.numOfCheese = numOfCheese;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public int getNumOfCheese()
    {
        return numOfCheese;
    }

    public void setNumOfCheese(int numOfCheese) {
        this.numOfCheese = numOfCheese;
    }

    public int getNumOfBeefTopping()
    {
        return numOfBeefTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping)
    {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public int getNumOfChickenTopping()
    {
        return numOfChickenTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping)
    {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost()
    {
        return switch (size) 
        {
            case "Small" -> 10.00 + 2 * (numOfChickenTopping + numOfCheese + numOfBeefTopping);
            case "Medium" -> 12.00 + 2 * (numOfChickenTopping + numOfCheese + numOfBeefTopping);
            case "Large" -> 14.00 + 2 * (numOfChickenTopping + numOfCheese + numOfBeefTopping);
            default -> 0.00;
        };
    }
    
    public void display()
    {
        String s = size + " pizza with topping(s): RM" + computeCost() + "\nCheese: " + numOfCheese
                + "\nBeef: " + numOfBeefTopping + "\nChicken: " + numOfChickenTopping;
        System.out.println(s + "\n");
    }
}
