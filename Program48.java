
package assignment7;

import java.util.Scanner;

/**
 *Write a JAVA program to convert a given number into hours and minutes. Separate the number of hours and minutes with a colon..
 * @author SHUBHAM
 */
public class Program48 {
    public static void main(String[] args) {
     int t;  
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter time in minutes :");
     t = sc.nextInt();
     int hours = t / 60; //since both are ints, you get an int
     int minutes = t % 60;
     System.out.printf("%d:%02d", hours, minutes);
}
}