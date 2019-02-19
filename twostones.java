/*
 * Kattis Programming Challenge: Take Two Stones
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class twostones {

	private static Boolean isEven(double x) { return ((x%2) == 0) ? true : false; }
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double N = Double.parseDouble(bf.readLine());
		
		if (!isEven(N)) { System.out.println("Alice"); }
		else { System.out.println("Bob"); }
		
	}
}
