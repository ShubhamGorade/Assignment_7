
package assignment7;
import java.lang.Math;
/**
 *Write a program in JAVA to print the area of a hexagon by knowing its diagonal..  
 * @author SHUBHAM
 */
public class Program28 {

	// Function to calculate area
	public static float hexagonArea(float d)
	{
		// Formula to find area
		return (float)((3 * Math.sqrt(3) * d * d) / 8);
	}

	public static void main(String []args) {
		float diagonal = 10;
		System.out.println("Area of hexagon: " + hexagonArea(diagonal));
	}
}
