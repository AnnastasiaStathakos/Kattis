/*
 * Kattis Programming Challenge: 3D printer
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class threedprinter {

	private static int N = 0; 
	private static int printcount = 1;
 
	private static int min_days() { 
		int daycount = 0;
		int n = 0;
		
		if (N < 4) { return daycount = N; } 
		else {
			while (n < N) {
				if ( (N-n) > printcount) { 	//if there are more statues to print than printers, print a print
					printcount+=printcount; //otherwise print a statue with then no. of printers already made
				} else { n+=printcount;	}
				daycount+=1;
			} }
		
		return daycount;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(bf.readLine());
		
		System.out.println(min_days());
		
	}
}
