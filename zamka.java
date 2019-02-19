/*
 * Kattis Programming Challenges: Zamka
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class zamka {
	
	private static int sum_digits(int n) {
		int sum = 0; 
		
		while (n != 0) {  
			sum = sum + n%10; 
			n = n/10;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String in = bf.readLine();
		int L = Integer.parseInt(in);
		in = bf.readLine();
		int D = Integer.parseInt(in);
		in = bf.readLine();
		int X = Integer.parseInt(in);
	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = L; i <= D; i++) {
			if (sum_digits(i) == X) {
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
		}
		
		System.out.println(min); 
		System.out.println(max);
		
	}
	
}
