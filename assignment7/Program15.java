
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA that converts kilometers per hour to miles per hour..
 * @author SHUBHAM
 */
public class Program15 {
    public static void main(String[] args) {

		double kilometers;

		System.out.println("Please enter kilometers:");

		Scanner in = new Scanner(System.in);
		kilometers = in.nextDouble();

		double miles = kilometers / 1.6;

		System.out.println(miles + " Miles");

	}
}
