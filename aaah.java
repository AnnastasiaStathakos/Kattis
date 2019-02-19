/*
 * Kattis Programming Challenge: Aaah!
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class aaah {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String jon = bf.readLine();
		String doc = bf.readLine();
		
		if (jon.length() >= doc.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		} 
	}
	

}
