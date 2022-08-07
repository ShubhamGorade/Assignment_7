
package assignment7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Write a JAVA program to read seven numbers and sorts them in descending order..
 * @author SHUBHAM
 */
public class Program36 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input six integers:");
        String[] input = br.readLine().split(" ", 7);
        int[] data = new int[7];
 
        for (int i = 0; i < 7; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
 
        for (int j = 0; j < 6; j++) {
            for (int i = 6; i > j; i--) {
                if (data[i - 1] < data[i]) {
                    int swp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = swp;
                }
            }
        }
        StringBuilder sb = new StringBuilder(); 
        for (int i : data) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println("After sorting the integers are:");
        System.out.println(sb.substring(0 , sb.length()-1));
    }
}
    

