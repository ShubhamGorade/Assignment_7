
package assignment7;

import java.util.Scanner;

/**
 *Write a JAVA program to compute the sum of the of Prime numbers upto specified digit..   
 * @author SHUBHAM
 */
public class Program41 {
     public static void main(String[] args)
 {
    int sum = 1;
	 int ctr = 0; 
	 int m = 0;
         int n;
    	System.out.println("Enter the prime number upto which you want addition of prime numbers ?");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        
		while (ctr < n) {
			m++; 
			if (m % 2 != 0) { 
			// check if the number is even
				if (is_Prime(m)) {
					sum += m; 					
				}
			}
                    ctr++; 	
		}
		System.out.println("\nSum of the first "+n+ " prime numbers till : "+sum); 	
	 }
	
   	public static boolean is_Prime(int m) {
		for (int i = 3; i * i <= m; i+= 2) {
			if (m % i == 0) {
				return false; 
			}
		}
		return true;
	}
}

