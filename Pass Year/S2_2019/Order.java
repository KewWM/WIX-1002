
package S2_2019;

public class Order
{
    protected String name;
    protected String ID;
    protected int qty;
    protected double price;

    public Order() 
    {
        
    }

    public Order(String name, String ID, int qty, double price) 
    {
        this.name = name;
        this.ID = ID;
        this.qty = qty;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getID() 
    {
        return ID;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public double computeTotalPrice()
    {
        return qty * price;
    }

    @Override
    public String toString() 
    {
        String s = "\nOrder Record\nCustomer Name : " + name +
                "\nCustomer ID : " + ID +
                "\nQuantity Ordered : " + qty +
                "\nUnit Price : " + price +
                "\nTotal Price : " + computeTotalPrice();
        return s;
    }
    
    
}
