/*
 * Kattis Programming Challenge: Faktor
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class faktor { 
	
	private static double min_bribes(int impact, int arts) { 
		double bribes = impact*arts;
		
		while (Math.ceil(bribes/arts) == impact) {
			bribes=bribes-1;
		} 
		return bribes+1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ints = bf.readLine().split(" ");
		int A = Integer.parseInt(ints[0]);
		int I = Integer.parseInt(ints[1]);
		
		double bs = min_bribes(I, A);
		
		System.out.println((int)bs);
		
	}
}
