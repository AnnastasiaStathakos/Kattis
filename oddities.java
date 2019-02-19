/*
 * Kattis Programming Challenge: Oddities
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class oddities {

	private static Boolean isEven(int x) { 
		return ((x % 2) == 0) ? true : false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ins = bf.readLine().split(" ");
		int n = Integer.parseInt(ins[0]); // no. of test cases.
			
		for (int i = 0; i < n; i++) {
			ins = bf.readLine().split(" ");
			int X = Integer.parseInt(ins[0]);
			
			if (isEven(Math.abs(X))) {
				System.out.println(X + " is even");
			} else {
				System.out.println(X + " is odd");
			}
			
		}  
	}
	
}
