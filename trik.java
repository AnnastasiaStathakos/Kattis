/*
 * Kattis Programming Challenge
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.io.IOException;

public class trik { 
	private static int start_position = 1;
	private static Queue<Character> moves = new LinkedList<>(); 
	
	private static int swap(char m, int p) { 
		int new_p = p;
		
		if (m == 'A') { 
			if (p == 3) { return p; } else { new_p = (p == 1) ? 2 : 1; } } 
		else if (m == 'B') {
			if (p == 1) { return p; } else { new_p = (p == 2) ? 3 : 2; } }
		else if (m == 'C') { 
			if (p == 2) { return p; } else { new_p = (p == 3) ? 1 : 3; } }
		else { return p; }
		
		return new_p;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int fin_p = start_position;
		char move = 'Z';
		
		String abc = bf.readLine(); 
		for (int i = 0; i < abc.length(); i++) {
			moves.add(abc.charAt(i));
		} 
		moves.add('Z');   
		
		while ((move = moves.remove()) != 'Z') {  
			fin_p = swap(move, fin_p); 
		}
	 
		System.out.println(fin_p);
		
	}
}
