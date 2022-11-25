
import java.util.Scanner;
public class L3Q6 {

    public static void main(String[] args) {
        Scanner ya = new Scanner (System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = ya.nextInt();
        System.out.print("Enter the coordinate point (x,y):");
        double x = ya.nextDouble();
        double y = ya.nextDouble();
        
        double distance = Math.sqrt((Math.pow(y,2)+Math.pow(x,2)));
        System.out.println("Distance of the point from center of circle: " + String.format("%.2f",distance));
        
        if (distance > radius)
            System.out.println("The point is outside the circle");
        else
            System.out.println("The point is inside the circle");
    }
    
    
}
