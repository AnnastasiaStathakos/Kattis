/*
 * Kattis Programming Challenge: Alphabet Spam
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  
import java.lang.String;

public class alphabetspam {
	
	private static double[] countspace(String S) {
		int w = 0, up = 0, lo = 0, sym = 0;
		double[] counts = new double[4]; 
		
		for (int i = 0; i < S.length(); i++) {
			if ( S.charAt(i) == '_') { w++; }
			else if ( Character.toString(S.charAt(i)).matches("[A-Z]") ) { up++; }
			else if ( Character.toString(S.charAt(i)).matches("[a-z]") ) { lo++; } 
			else { sym++; }
		}
		counts[0] = w; 	counts[1] = lo;
		counts[2] = up; counts[3] = sym; 
		
		return counts;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		String spam = bf.readLine();
		double[] cs = countspace(spam); 
		for (int i = 0; i < cs.length;i++) {
			System.out.println(String.format("%.015f", cs[i]/spam.length()));
		} 
	}
}
