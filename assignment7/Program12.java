
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to convert temperature in Celsius to Fahrenheit..
 * @author SHUBHAM
 */
public class Program12 {
     public static void main (String args[])  
    {    
        float Fahrenheit, Celsius;
        System.out.println("Enter Temperature in celcius :");
         Scanner sc=new Scanner(System.in);
          Celsius= sc.nextInt();  
          Fahrenheit =((Celsius*9)/5)+32;  
          System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }
}  
