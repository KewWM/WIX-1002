
package l1q4.v2;

public class L1Q4V2 {

    public static void main(String[] args) {
        String[] month = {"January", "February", "March", "April", "May", "June"};
        int[] amount = {2500, 1600, 2000, 2700, 3200, 800};

        System.out.print(month[0] + "\t:");
        for(int i = 0; i < (amount[0] / 100); i++) {
            System.out.print("*"); // * = 100
        }
        System.out.println();

        System.out.print(month[1] + ":");
        for(int i = 0; i < (amount[1] / 100); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print(month[2] + "\t:");
        for(int i = 0; i < (amount[2] / 100); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print(month[3] + "\t:");
        for(int i = 0; i < (amount[3] / 100); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print(month[4] + "\t:");
        for(int i = 0; i < (amount[4] / 100); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print(month[5] + "\t:");
        for(int i = 0; i < (amount[5]  / 100); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("* = 100 in amount");
    }
    
}
