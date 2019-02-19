/*
 * Kattis Programming Challenge: Stuck in a Time Loop
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class timeloop {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		
		for ( int i = 1; i <= num; i++) {
			System.out.println(i + " Abracadabra");
		}
		
	}
}
