
package assignment7;

/**
 *Write a program in JAVA to print a mystery series from 1 to 50..
 * @author SHUBHAM
 */
public class Program21 {
    public static void main(String [] args){
        System.out.println(" Print a mystery series:");
	System.out.println("---------------------------------------");
	System.out.println(" The series are: ");	
    int nm1 = 1;
   while (true) 
   {
      ++nm1;
      if ((nm1 % 3) == 0) 
      continue;
       if (nm1 == 50) 
      break;
       if ((nm1 % 2) == 0) 
      {
         nm1 += 3;
      } 
      else 
      {
         nm1 -= 3;
      }
     System.out.println(nm1+" ");
    }
   System.out.println();
  }
}