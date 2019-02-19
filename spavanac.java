/*
 * Kattis Programming Challenge: Spavanac
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class spavanac {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] time = bf.readLine().split(" ");
			
		int H = Integer.parseInt(time[0]);
		int M = Integer.parseInt(time[1]);
		
		// minutes
		if (M >= 45) {
			M = M - 45;
		} else {
			H = (((H - 1 )%24) + 24 ) % 24; 
			M = (((M - 45)%60) + 60 ) % 60; 
		}
		
		System.out.println(H + " " + M);
	}
}
