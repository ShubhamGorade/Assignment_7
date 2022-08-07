
package assignment7;

import java.util.Scanner;

/**
 *Write a program in JAVA to check whether a number is positive, negative or zero..
 * @author SHUBHAM
 */
public class Program18 {
    public static void main(String[] args)   
{  
int num;  
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reading a number from the user  
num = sc.nextInt();  
//checks the number is greater than 0 or not  
if(num>0)  
{  
System.out.println("The number is positive.");  
}  
//checks the number is less than 0 or not  
else if(num<0)  
{  
System.out.println("The number is negative.");  
}  
//executes when the above two conditions return false  
else  
{  
System.out.println("The number is zero.");  
}  
}  
}
