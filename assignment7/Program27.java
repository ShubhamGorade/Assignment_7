
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to enter P, T, R and calculate Compound Interest..
 * @author SHUBHAM
 */
public class Program27 {
       public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal (amount), time, and rate::\n");

        float p = in.nextFloat();
        float t = in.nextFloat();
        float r = in.nextFloat();
        float CI;
        // p = principal
        // t = time
        // r = rate
        // CI = compound interest

        // Calculate compound interest
        CI = (float)(p * (Math.pow((1 + r / 100), t)));

        // Output
        System.out.println("\nCompound Interest = " + CI);
    }
    
}
