/*
 * Kattis Programming Challenge: Autori
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class autori {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		String[] names = bf.readLine().split("-"); 
		
		String abv = "";
		for (int i = 0; i<names.length;i++) {
			abv = abv+names[i].charAt(0);
		}
		
		System.out.println(abv);
	}
}
