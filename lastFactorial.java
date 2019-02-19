/*
 * Kattis Programming Challange: Last Factorial
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class lastFactorial {

	public static int fac(int n) { 
		if (n == 0 ) { return 1; }
		return n*fac(n-1);
	}
	
	private static int lastfac(int fac_n) { 
		return Math.abs(fac_n)%10;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ins = bf.readLine().split(" ");
		int t = Integer.parseInt(ins[0]); // no. of test cases
		
		int N = -1;
		for (int i = 0; i < t; i++) {
			ins = bf.readLine().split(" ");
			N = Integer.parseInt(ins[0]); 
			
			System.out.println(lastfac(fac(N)));
		}
		
	}
}
