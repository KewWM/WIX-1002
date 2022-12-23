
import java.util.Scanner;
public class L4Q4 {

    public static void main(String[] args) {
        Scanner ya = new Scanner(System.in); 
        System.out.print("Enter the year: ");
        int year = ya.nextInt();
        System.out.print("Enter the first day of the year: ");
        int fdoy = ya.nextInt();
        String monthDisplay = "" ;
        int dayMonth = 0;
        for (int month = 1; month <= 12; month++)
        {
            dayMonth = 0;
            monthDisplay = ya.next();
            switch (month)
            {
                case 1:
                    monthDisplay = "January";
                    dayMonth = 31;
                    break;
                case 2:
                    monthDisplay = "February";
                    for (int leapYear = 0; leapYear > -1; ) 
                    {
                        leapYear += 4;
                        if (year == leapYear)
                        {
                            dayMonth = 29;
                            break;
                        } else
                            dayMonth = 28;
                    }
                        break;

                case 3:
                    monthDisplay = "March";
                    dayMonth = 31;
                    break;

                case 4:
                    monthDisplay = "April";
                    dayMonth = 30;
                    break;

                case 5:
                    monthDisplay = "May";
                    dayMonth = 31;
                    break;

                case 6:
                    monthDisplay = "June";
                    dayMonth = 30;
                    break;

                case 7:
                    monthDisplay = "July";
                    dayMonth = 31;
                    break;

                case 8:
                    monthDisplay = "August";
                    dayMonth = 30;
                    break;

                case 9:
                    monthDisplay = "September";
                    dayMonth = 31;
                    break;

                case 10:
                    monthDisplay = "October";
                    dayMonth = 30;
                    break;

                case 11:
                    monthDisplay = "November";
                    dayMonth = 31;
                    break;

                case 12:
                    monthDisplay = "December";
                    dayMonth = 30;
                    break;

                default:
                    System.out.println("Invalid: Your month is not in the list. Please try again later.");
                    System.exit(0);
            }
        System.out.println("     " + monthDisplay + " " + year);
        System.out.println("________________________");
        System.out.println("  S  M  T  W  T  F  S");

        int firstDayEachMonth = (dayMonth + fdoy)%7;
        for(int space = 1; space <= firstDayEachMonth; space++)
            System.out.println("");

        for(int daysDisplay = 1; daysDisplay <= dayMonth; daysDisplay++)
        {
            if(fdoy%7 == 0)
                System.out.println();
            System.out.printf("%3d",daysDisplay);
            fdoy += 1;
        }
        
        System.out.println();
        }
    }
}