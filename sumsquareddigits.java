/*
 * Kattis Programming Challenges: Sum Squared Digits
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class sumsquareddigits {

	private static int SSD(int b, int n) {
		int sum = 0, r;
		while (n > 0) {
			r = ((n%b)+b)%b;
			sum += r*r;
			n = n/b;
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int P = Integer.parseInt(bf.readLine()); // no. of data sets 
		
		for (int i = 0; i < P; i++) {
			String[] data = bf.readLine().split(" ");
			int base = Integer.parseInt(data[1]);
			int n 	 = Integer.parseInt(data[2]);
			 
			int sqdsum = SSD(base, n);	
			System.out.println(data[0] + " " + sqdsum);
		}
		
	}
}
