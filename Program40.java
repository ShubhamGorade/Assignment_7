
package assignment7;

import java.util.Scanner;

/**
 *Write a JAVA program that accepts various numbers and compute the difference between the highest number and the lowest number.
 * All input numbers should be real numbers between 0 and 1,000,000. The output (real number) may include an error of 0.01 or less
 * @author SHUBHAM
 */
public class Program40 {
      public static void main(String args[]){
                int highest, lowest, num, diff;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter a number:");
                highest = lowest = scan.nextInt();
                for(int i=1; i<10; i++){
                       num = scan.nextInt();
                       if (num > highest){
                           highest = num;
                       }
                       if(num < lowest){
                           lowest = num;
                    }
                }
                    System.out.println("Highest number is: " + highest);
                    System.out.println("Lowest number is: " + lowest);
                    
                    diff = highest - lowest;
                    System.out.println("Difference between two numbers is :"+diff);
               }
}
