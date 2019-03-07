/*
 * Kattis Programming Challenges: Alien Numbers
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;

public class aliennumbers {
	
	private static String convert(String a, String S, String T) {
		int src_base = S.length(), trg_base = T.length(), n = 0;
		String R = ""; 
		
		for (int i = 0; i < a.length(); i++) { n = n*src_base + S.indexOf(a.charAt(i)); }
		
		while (n > 0) {
			R += T.charAt(n%trg_base);
			n = n/trg_base;
		}
		
		return R;
	}
	
	private static String reverse(String muck) {
		String kcum = "";
		for (int i = muck.length()-1; i >= 0; i--) { kcum += muck.charAt(i); }
		return kcum; 
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine()); // no. of test cases;
		
		for (int i = 0; i < T; i++) {
			String[] case_line = bf.readLine().split(" ");
			
			String alien = case_line[0];
			String source = case_line[1];
			String target = case_line[2]; 
			 
			System.out.println("Case #" + (i+1) + ": " + reverse(convert(alien,source,target)));
		}
		
	}
}
