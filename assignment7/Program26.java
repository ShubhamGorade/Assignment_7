
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to enter P, T, R and calculate Simple Interest..
 * @author SHUBHAM
 */
public class Program26 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal (amount), time, and rate::\n");

        float p = in.nextFloat(); // value of the principal
        float t = in.nextFloat(); // value of the time
        float r = in.nextFloat(); // value of the rate

        CalculateSimpleInterest(p, t, r);
    }

    // This method will calculate the simple interest
    public static void CalculateSimpleInterest(float x, float y, float z) {
        float SI; // Value of the simple interest

        // It will calculate the simple interest
        SI = (x * y * z) / 100;

        // It will produce the final output
        System.out.println("\nSimple Interest = " + SI);
    }
}
