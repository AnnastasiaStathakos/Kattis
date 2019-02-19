/*
 * Kattis Programming Challenge: Apaxiaaaaaans!
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  

public class apaxiaans {

	private static String matchletter(String s) {  
		s += " "; 
		String new_s = " ";
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i-1) != s.charAt(i)) {
				new_s += s.charAt(i-1);
			} }
		return new_s;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String name = bf.readLine(); // input
		
		String newnew = matchletter(name);
		System.out.println(newnew);
		
	}
}
