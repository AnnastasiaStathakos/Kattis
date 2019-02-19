/* 
 * Kattis Programming Challenge: Hissing Microphones
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.String;

public class hissingmic {
	
	public static void main(String[] args) throws IOException { 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String word = bf.readLine(); 
		
		if (word.contains("ss") ) { System.out.println("hiss"); } 
		else { System.out.println("no hiss"); }
		
	}

}
