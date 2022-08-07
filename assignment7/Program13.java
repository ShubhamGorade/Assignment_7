
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to convert temperature in Fahrenheit to Celsius..
 * @author SHUBHAM
 */
public class Program13 {
     public static void main (String args[])  
    { float Fahrenheit, Celsius;
        System.out.println("Enter Temperature in Fahrenheit : ");
        Scanner sc = new Scanner(System.in);
          Fahrenheit = sc.nextInt(); 
          Celsius  = ((Fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  
    }}  

