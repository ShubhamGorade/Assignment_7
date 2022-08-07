
package assignment7;
/**
 *Write a JAVA program find the total difference between two times (formatted with a colon and am or pm).   
 * @author SHUBHAM
 */
public class Program50{
static int removeColon(String s)
{
    if (s.length() == 4)
        s = s.substring(0,1) + s.substring(2);
     
    if (s.length() == 5)
        s = s.substring(0,2) + s.substring(3);
     
    return Integer.valueOf(s);
}
 
// Main function which finds difference
static String diff(String s1, String s2)
{
 
    // change string (eg. 2:21 --> 221, 00:23 --> 23)
    int time1 = removeColon(s1);
    int time2 = removeColon(s2);
 
    // difference between hours
    int hourDiff = time2 / 100 - time1 / 100 - 1;
 
    // difference between minutes
    int minDiff = time2 % 100 + (60 - time1 % 100);
 
    if (minDiff >= 60) {
        hourDiff++;
        minDiff = minDiff - 60;
    }
 
    // convert answer again in string with ':'
 
    String res = String.valueOf(hourDiff) + ':' + String.valueOf(minDiff);
    return res;
}
   
// Driver Code
public static void main(String args[])
{
    String s1 = "14:00";
    String s2 = "22:50";
    System.out.println(diff(s1, s2));
}
}
 