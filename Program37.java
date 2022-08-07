
package assignment7;

/**
 *Write a JAVA program to replace all the lower-case letters of a given string with the corresponding capital letters..
 * @author SHUBHAM
 */
public class Program37 {
    public static void main(String[] args) {    
            
        String str1="Great Power";    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
           
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
    
}
