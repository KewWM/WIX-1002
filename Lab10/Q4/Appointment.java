
package Lab10.Q4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class Appointment implements Searchable
{
    protected int day, month, year, startTime, endTime;

    public Appointment(int day, int month, int year, int startTime, int endTime) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    
    public boolean search (String dataStartTime, String dateEndTime)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Searchable.txt"));
            String line;
            while((line=br.readLine())!= null)
            {
                String[] startDate = dataStartTime.split(" ");
                String[] endDate = dateEndTime.split(" ");
                int startDay = Integer.parseInt(startDate[0]);
                int startMonth = Integer.parseInt(startDate[1]);
                int startYear = Integer.parseInt(startDate[2]);
                int startTime = Integer.parseInt(startDate[3]);
                int endDay = Integer.parseInt(endDate[0]);
                int endMonth = Integer.parseInt(endDate[1]);
                int endYear = Integer.parseInt(endDate[2]);
                int endTime = Integer.parseInt(endDate[3]);
                if (startYear == year && endYear == year) 
                {
                    if (startMonth == month && endMonth == month) 
                    {
                        if (startDay == day && endDay == day)
                        {
                            if (startTime >= this.startTime && endTime <= this.endTime) 
                            {
                                br.close();
                                return false;
                            }
                        }
                    }
                }
            }
            br.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return true;
    }
    
    public void saveAppointment()
    {
        try 
        {
            String dateStartTime = String.format("%d,%d,%d,%d", day, month, year, startTime);
            String dateEndTime = String.format("%d,%d,%d,%d", day, month, year, endTime);
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("src/lab10/Q4/appointment.txt", true));
            if (search(dateStartTime, dateEndTime)) 
            {
                outputStream.printf("%d,%d,%d,%d,%d\n", day, month, year, startTime, endTime);
                System.out.println(this + " is saved.");
            }
            else
            {
                System.out.println(this + " is not available.");
            }
            outputStream.close();
        } 
        
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Appointment on:\n" + 
                "Day = " + day + 
                "\nMonth = " + month + 
                "\nYear = " + year +
                "\nStartTime = " + startTime + 
                "\nEndTime=" + endTime;
    }
    
    
}
