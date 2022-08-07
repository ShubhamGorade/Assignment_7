
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to calculate the volume of a sphere..
 * @author SHUBHAM
 */
public class Program6 {
      public static void main(String args[])  
    {  
    int radius; 
    System.out.println("Enter Radius of Sphere : ");
    Scanner sc = new Scanner(System.in);
    radius = sc.nextInt();
    double pie=3.14;  
    double volume=(4.0/3.0)*pie*(radius*radius*radius);  
    System.out.println("Volume of the sphere="+volume);  
     }  
}  
    
    
