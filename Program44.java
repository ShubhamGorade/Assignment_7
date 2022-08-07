
package assignment7;

import java.util.Scanner;

/**
 *Write a JAVA program to display all the leap years between two given years..
 * @author SHUBHAM
 */
public class Program44 {
    public static void main(String[] args) {
 
        int startYear, endYear, i;
 
        //create a scanner object to get the input
        Scanner in = new Scanner(System.in);
 
        //get the start year from user
        System.out.print("Enter the Start Year:");
        startYear = in.nextInt();
 
        //get the end year from user
        System.out.print("Enter the End Year:");
        endYear = in.nextInt();
 
        //print the leap years
        System.out.println("Leap years:");
 
	//loop through between start and end year
        for (i = startYear; i <= endYear; i++) {
 
            //find the year is leap year or not,  if yes print it
            if ( (0 == i % 4) && (0 != i % 100) || (0 == i % 400) ){
               System.out.println(i);
            }
        }
    } 
}
