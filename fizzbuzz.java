/*
 * Kattis Programming Challenge: FizzBuzz
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class fizzbuzz {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split(" ");
		int X = Integer.parseInt(input[0]);
		int Y = Integer.parseInt(input[1]);
		int N = Integer.parseInt(input[2]); 
		
		for (int i = 1; i <= N; i++) {
			if ((i%X == 0) && (i%Y == 0)) { System.out.println("FizzBuzz"); }
			else if ( i%X == 0 ) { System.out.println("Fizz"); }
			else if (i%Y == 0) { System.out.println("Buzz");}
			else { System.out.println(i); } 
		}
		
	}
}
