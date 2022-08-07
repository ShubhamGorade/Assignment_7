
package assignment7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Write a program in JAVA to find the area of Scalene Triangle and equilateral Triangle..
 * @author SHUBHAM
 */
public class Program17 {
  public static void main(String args[]) throws IOException

{

InputStreamReader read = new InputStreamReader(System.in);

BufferedReader in = new BufferedReader(read);

int c;

float a,s,p,q,r,b;

double area;

System.out.println("1.Area of equilateral triangle");

System.out.println("2.Area of isosceles triangle");

c=Integer.parseInt(in.readLine());

switch(c)

{

case 1:

System.out.println("Enter side of an equilateral triangle");

s=Float.parseFloat(in.readLine());

area=Math.sqrt(3*s*s)/4;

System.out.println("Area="+area);

break;

case 2:

System.out.println("Enter the side and base of isosceles triangle");

a=Float.parseFloat(in.readLine());

b=Float.parseFloat(in.readLine());

area=b/4*(Math.sqrt(4*a*a-b*b));

System.out.println("Area="+area);

break;

default:

System.out.println("Wrong choice ");

}

}
}

    

