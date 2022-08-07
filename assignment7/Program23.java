
package assignment7;

import java.util.Scanner;

/**
 *Write a language program in JAVA which accepts the user's first and last name and prints length of Strings and their initial Letters..
 * @author SHUBHAM
 */
public class Program23 {
 public static void main(String[] args) {
        
        String input;     // The input line entered by the user.
        int space;        // The location of the space in the input.
        String firstName; // The first name, extracted from the input.
        String lastName;  // The last name, extracted from the input.
         Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter your first name and last name, separated by a space.");
        System.out.print("? ");
        input = sc.nextLine();
        
        space = input.indexOf(' ');
        firstName = input.substring(0, space);
        lastName = input.substring(space+1);
        
        System.out.println("Your first name is " + firstName + ", which has "
                                  + firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + ", which has "
                                  + lastName.length() + " characters.");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
        
    }   
}
