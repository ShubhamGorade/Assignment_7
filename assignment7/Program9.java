
package assignment7;

import java.util.Scanner;

/**
 *
 * @author SHUBHAM
 */
public class Program9 {
      public static void main (String args[])  
    {      
        float length,breadth, perimeter,area;  
        System.out.println("Enter length and Radius of a Rectamgle Respectively :");
        Scanner sc=new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        
        perimeter  = 2*(length+breadth);
        area = length*breadth;
            System.out.println("Perimeter of Rectangle is: "+perimeter);
            System.out.println("Area of Rectangle is: "+area);
    
}
}      
