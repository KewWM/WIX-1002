
import java.util.Scanner;

public class L2Q4 {

    public static void main(String[] args) {
        Scanner yo = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = yo.nextInt();
        int hour = sec/60/60;
        int min = (sec-(hour*3600))/60;
        int fsec = sec%60;
        System.out.println(sec + " seconds is " + hour + 
        " hours, " + min + " minutes and " + fsec + " seconds");
    }
}