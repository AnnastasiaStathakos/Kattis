/*
 * Kattis Programming Challenges: Bijele
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Bijele {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = bf.readLine().split(" ");
		
		int[] piece_set = {1,1,2,2,2,8};
		int[] inventory = new int[in.length];
		for (int i = 0; i < inventory.length; i++) {
			inventory[i] = Integer.parseInt(in[i]);
		}
		
		int[] replace = new int[piece_set.length];
		for(int i = 0; i < inventory.length; i++) {
			replace[i] = piece_set[i]-inventory[i];
			System.out.print(replace[i] + " ");
		}
		
	}
}
