/*
 * Kattis Programming Challenges: Modulo
 * Solved by: Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class modulo {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		int x = 0;
		int[] r = new int[10];
		for (int i = 0; i < 10; i++) { 
			x = Integer.parseInt(bf.readLine());
			r[i] = x%42;
		}
		Arrays.sort(r);
		
		int count = 1;
		for (int i = 1; i < 10; i++) {
			if (r[i] != r[i-1]) { count++; }
		}
		
		System.out.println(count);
		
	}

}
