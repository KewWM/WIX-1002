
package l1q4;
public class L1Q4 {

    public static void main(String[] args) {
        int c = 0;
        System.out.println("Month\t\t\tAmount");
        System.out.println("________________________________");
        String[] month = {"January 2016","February 2016",
        "March 2016","April 2016","May 2016","June 2016"};        
        int[] amount = {2500,1600,2000,2700,3200,800};
        
        while (c<=5){
            System.out.println(month[c] + "\t\t" + amount[c]);
            c++;
        }
    }
    
}
