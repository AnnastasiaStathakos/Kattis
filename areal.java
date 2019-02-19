/*
 * Kattis Programming Challenge: A Real Challenge
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
import java.lang.Math;

public class areal { 

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		double area = Double.parseDouble(bf.readLine()); 
		double side = Math.sqrt(area);
		double perimeter = side*4;
		 
		System.out.println(perimeter);
		
	}
}
