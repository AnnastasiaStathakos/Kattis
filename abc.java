/*
 * Kattis Programming Challenge: abc
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class abc {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in_abc = bf.readLine().split(" ");
		int[] abc = new int[3];
		abc[0] = Integer.parseInt(in_abc[0]);
		abc[1] = Integer.parseInt(in_abc[1]);
		abc[2] = Integer.parseInt(in_abc[2]);
		Arrays.sort(abc);
		
		int[] order_abc = new int[3];
		String order = bf.readLine();
		for (int i = 0; i < order.length(); i++) {
			if ( order.charAt(i) == 'A') { order_abc[i] = abc[0];}
			else if (order.charAt(i) == 'B') { order_abc[i] = abc[1]; }
			else {
				order_abc[i] = abc[2];
			}
			System.out.print(order_abc[i] + " ");
		}  
	}
}
