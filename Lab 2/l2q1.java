
import java.util.Scanner;


public class l2q1 {

    
    public static void main(String[] args) {
        Scanner walao = new Scanner(System.in);
        System.out.print("Please enter temperature in degree Fehrenheit: ");
        int Feh = walao.nextInt();
        double Cel = (Feh-32)/1.8;
        System.out.println("Temperature: " + String.format("%.2f",Cel) + " degree Celsius");
    }
    
}
