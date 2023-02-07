
package S1_2020;

import java.util.Scanner;

public class Q2_2020S1 
{
    public static void main(String[] args)
    {
        Scanner ya = new Scanner(System.in);
        System.out.print("Enter Location 1\nEnter Direction: [N, S, E, W]: ");
        char dir1a = ya.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second: ");
        int degree1a = ya.nextInt();
        int min1a = ya.nextInt();
        int sec1a = ya.nextInt();
        System.out.print("Enter Direction: [N, S, E, W]: ");
        char dir1b = ya.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second: ");
        int degree1b = ya.nextInt();
        int min1b = ya.nextInt();
        int sec1b = ya.nextInt();
        System.out.print("Enter Location 2\nEnter Direction: [N, S, E, W]: ");
        char dir2a = ya.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second: ");
        int degree2a = ya.nextInt();
        int min2a = ya.nextInt();
        int sec2a = ya.nextInt();
        System.out.print("Enter Direction: [N, S, E, W]: ");
        char dir2b = ya.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second: ");
        int degree2b = ya.nextInt();
        int min2b = ya.nextInt();
        int sec2b = ya.nextInt();
        
        double lat1 = 0, long1 = 0, lat2 = 0, long2 = 0;
        switch (dir1a) 
        {
            case 'N' ->                 {
                    lat1 = degree1a + (min1a * 60.000000 + sec1a) / 3600;
                }
            case 'S' ->                 {
                    lat1 = -((min1a * 60.000000 + sec1a) / 3600 + degree1a);
                }
            case 'E' ->                 {
                    lat1 = degree1a + (min1a * 60.000000 + sec1a) / 3600;
                }
            case 'W' ->                 {
                    lat1 = -((min1a * 60.000000 + sec1a) / 3600 + degree1a);
                }
            default -> {
            }
        }
        switch (dir1b) 
        {
            case 'N' ->                 {
                    long1 = degree1b + (min1b * 60.000000 + sec1b) / 3600;
                }
            case 'S' ->                 {
                    long1 = -((min1b * 60.000000 + sec1b) / 3600 + degree1b);
                }
            case 'E' ->                 {
                    long1 = degree1b + (min1b * 60.000000 + sec1b) / 3600;
                }
            case 'W' ->                 {
                    long1 = -((min1b * 60.000000 + sec1b) / 3600 + degree1b);
                }
            default -> {
            }
        }
        switch (dir2a) 
        {
            case 'N' ->                 {
                    lat2 = degree2a + (min2a * 60.000000 + sec2a) / 3600;
                }
            case 'S' ->                 {
                    lat2 = -((min2a * 60.000000 + sec2a) / 3600 + degree2a);
                }
            case 'E' ->                 {
                    lat2 = degree2a + (min2a * 60.000000 + sec2a) / 3600;
                }
            case 'W' ->                 {
                    lat2 = -((min2a * 60.000000 + sec2a) / 3600 + degree2a);
                }
            default -> {
            }
        }
        switch (dir2b) 
        {
            case 'N' ->                 {
                    long2 = degree2b + (min2b * 60.000000 + sec2b) / 3600;
                }
            case 'S' ->                 {
                    long2 = -((min2b * 60.000000 + sec2b) / 3600 + degree2b);
                }
            case 'E' ->                 {
                    long2 = degree2b + (min2b * 60.000000 + sec2b) / 3600;
                }
            case 'W' ->                 {
                    long2 = -((min2b * 60.000000 + sec2b) / 3600 + degree2b);
                }
            default -> {
            }
        }
        double distance = haversine(lat1, long1, lat2, long2);
        System.out.printf("Location 1: %.6f Latitude , %.6f Longitude\n", lat1, long1);
        System.out.printf("Location 2: %.6f Latitude , %.6f Longitude\n", lat2, long2);
        System.out.printf("Distance: %.2f KM", distance);
    }
    
    public static double haversine(double lat1, double lon1, double lat2, double lon2)
    {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
 
        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                   Math.pow(Math.sin(dLon / 2), 2) *
                   Math.cos(lat1) *
                   Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }
            
}
