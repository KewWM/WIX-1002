import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class L7Q6 
{
    public static void main(String[] args)
    {
        String fileOrder = "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/order.txt";
        String fileProd = "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/product.txt";
        //Print header
        System.out.printf("%6s %17s %14s %15s %10s\n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
        
        //Sample of product.txt: SK020,Enfagrow A+,36,79
        //                         [0]  [1]        [2][3]
        //Sample of order.txt: ORD001,SK079,20
        //                       [0]  [1]   [2]
        try
        {
            //Extract from order.txt
            Scanner orderDer = new Scanner (new FileInputStream(fileOrder));
            
             while (orderDer.hasNextLine()) 
             {
                String order = orderDer.nextLine();
                String[] infoOrder = order.split(","); //Info separated by , and will have 3 items
                
                //Output that need to show later
                String prodID = infoOrder[1];
                String prodName = " ";
                int orderQty = Integer.parseInt(infoOrder[2]);
                double pricePerUnit = 0;
                double ttlPrice = 0;
                
                //Extract from prodcut.txt
                Scanner productDer = new Scanner (new FileInputStream(fileProd));
                
                while (productDer.hasNextLine()) 
                {
                    String product = productDer.nextLine();
                    String[] infoProduct = product.split(","); //Info separated by , and will have 4 items
                    
                    //Since both txt file got ProductID - to identify:
                    if (prodID.equals(infoProduct[0])) 
                    {
                        prodName = infoProduct[1];
                        pricePerUnit = Double.parseDouble(infoProduct[2]);
                        ttlPrice = pricePerUnit * orderQty;

                        productDer.close();
                        break;
                    }
                }
                 //Print output
                System.out.printf("%-8s %-22s %5d %18.2f %12.2f\n", prodID, prodName, orderQty, pricePerUnit, ttlPrice);
             }
        }
         
        catch (FileNotFoundException e) 
        {
            System.out.println("File was not found.");
        }

    }
}
