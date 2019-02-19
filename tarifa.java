/*
 * Kattis Programming Challenge: Tarifa
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarifa {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String p = ""; int i = 0;
		
		int X = Integer.parseInt(bf.readLine()); // limit per month
		int N = Integer.parseInt(bf.readLine()); // no. of months
		double[] usage = new double[N]; 
		double P = X; // usage per month 
		
		int n = N; 
		while (n != 0) {
			p = bf.readLine();
			usage[i] = Double.parseDouble(p);
			i++; n--;
		} 
		
		// compute next months available limit
		for (i = 0; i < N; i++) {
			P = P + (X-usage[i]);
		}
		
		System.out.println((int)P);
	}

}
