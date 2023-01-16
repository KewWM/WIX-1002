
package Lab9.Q3;

import Lab9.Q2.PersonProfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lecturer extends PersonProfile
{
    private String[] courseName, courseCode;
    private int[] semester, session, creditHour, studentRegistered;
    
    public Lecturer (String name, String gender, String date)
    {
        super(name, gender, date);
    
    try 
    {
        Scanner inputStream = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab9/File/lecturer.txt"));
        int lines = 0;
        while (inputStream.hasNextLine()) 
        {
            inputStream.nextLine();
            lines++;
        }
        inputStream.close();
        
        int numberOfCourses = lines / 6;
        courseName = new String[numberOfCourses];
        courseCode = new String[numberOfCourses];
        semester = new int[numberOfCourses];
        session = new int[numberOfCourses];
        creditHour = new int[numberOfCourses];
        studentRegistered = new int[numberOfCourses];
        
        inputStream = new Scanner(new FileInputStream("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab9/File/lecturer.txt"));
        for (int i = 0; inputStream.hasNextLine(); i++) 
        {
            courseCode[i] = inputStream.nextLine();
            courseName[i] = inputStream.nextLine();
            semester[i] = inputStream.nextInt();
            session[i] = inputStream.nextInt();
            creditHour[i] = inputStream.nextInt();
            studentRegistered[i] = inputStream.nextInt();
            if (inputStream.hasNextLine()) 
                inputStream.nextLine();
        }
        inputStream.close();
        computeCreditHour();
    } 
    
    catch (FileNotFoundException e) 
    {
        e.printStackTrace();
    }
}
    
    private void computeCreditHour() 
    {
        for (int i = 0; i < creditHour.length; i++) 
        {
            int numOfStudents = studentRegistered[i];

            if (numOfStudents >= 150) 
                creditHour[i] *= 3;
            else if (numOfStudents >= 100) 
                creditHour[i] *= 2;
            else if (numOfStudents >= 50) 
                creditHour[i] *= 1.5;
            else 
                creditHour[i] *= 1;
        }
    }
    
    @Override
    public String toString() 
    {
        String s = super.toString() + "\n";
        for (int i = 0; i < courseCode.length; i++) 
        {
            s += "\nCourse name: " + courseName[i] +
                    "\nCourse code: " + courseCode[i] +
                    "\nSemester: " + semester[i] +
                    "\nSession: " + session[i] +
                    "\nCredit hour: " + creditHour[i] +
                    "\nRegistered students: " + studentRegistered[i] + "\n";
        }
        return s.substring(0, s.length() - 1);
    }
 }
