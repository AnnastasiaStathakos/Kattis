/*
 * Kattis Programming Challenges: Eating Out
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class eatingout {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] x = bf.readLine().split(" ");
		int m = Integer.parseInt(x[0]); // No. of items on menu
		
		int a = Integer.parseInt(x[1]);
		int b = Integer.parseInt(x[2]);
		int c = Integer.parseInt(x[3]);
		 
		if ((a+b+c) <= 2*m) {
			System.out.println("possible");
		} else {
			System.out.println("impossible");
		}
		
	}
}
