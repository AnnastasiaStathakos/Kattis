/*
 * Kattis Programming Challenge: Anthony and Diablo
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class anthanddiab {

	private static boolean canBuild(double a, double n) {  
		return ( n == 0 ) ? false : ( a <= n*n/(4*Math.PI) ) ? true : false;	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String[] num = bf.readLine().split(" ");
		double A = Double.parseDouble(num[0]), N = Double.parseDouble(num[1]);
		
		if (canBuild(A, N)) { System.out.println("Diablo is happy!"); } 
		else { System.out.println("Need more materials!"); }
		
	}
}
