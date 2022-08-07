
package assignment7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *Write a JAVA program to display the current date and time..
 * @author SHUBHAM
 */
public class Program19 {
    public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }    
}
