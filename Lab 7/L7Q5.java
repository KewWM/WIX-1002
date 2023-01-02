
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class L7Q5 
{
    public static void main(String[] args)
    {
        String fileOri = "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/person.dat";
        
        try
        {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileOri));
            int N = inputStream.readInt();
            
            //Arrays to store 3 things
            String[] name = new String[N];
            int[] age = new int[N];
            char[] gender = new char[N];
            
            for (int i = 0; i < N; i++) //Read from file and into arrays
            {
                name[i] = inputStream.readUTF();
                age[i] = inputStream.readInt();
                gender[i] = inputStream.readChar();
            }
            
            //Before Sorting
             for (int i = 0; i < N; i++)
                System.out.printf("%s %d %c\n", name[i], age[i], gender[i]);
             System.out.println("__________________________");
            
            for (int pass = 1; pass < N; pass++)//Sort in ascending order
            {
                for (int i = 0; i < N - pass; i++) 
                {
                    if (name[i].compareTo(name[i + 1]) > 0) //Bubble sort Condition
                    {
                        String nameTem = name[i];
                        name[i] = name[i + 1];
                        name[i + 1] = nameTem;

                        int ageTem = age[i];
                        age[i] = age[i + 1];
                        age[i + 1] = ageTem;

                        char genderTem = gender[i];
                        gender[i] = gender[i + 1];
                        gender[i + 1] = genderTem;
                    }
                }
            }
            
            //After sorting
            for (int i = 0; i < N; i++)
                System.out.printf("%s %d %c\n", name[i], age[i], gender[i]);

        }
        
        catch (FileNotFoundException e) 
        {
            System.out.println("File was not found :(");
        }
        catch (IOException e) 
        {
            System.out.println("Error in reading file :(");
        }

    }
}
