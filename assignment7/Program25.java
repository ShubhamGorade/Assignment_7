
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to enter length in centimeter and convert it into meter and kilometer..
 * @author SHUBHAM
 */
public class Program25 {
   public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the length in centimeter::\n");

        float c = in.nextFloat();
        float m;
        float k;

        // c = centimeter
	    // m = meter
	    // k = kilometer

        /* Convert centimeter into meter and kilometer */
	    m = (float)(c / 100);
	    k = (float)(c / 100000);

        // Output
        System.out.print("\n");
        System.out.println("Length in Meter      = " + m + " meter");
        System.out.println("Length in Kilometer  = " + k + " kilometer");
    }
}