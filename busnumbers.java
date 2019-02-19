/*
 * Kattis Programming Challenges: Bus Numbers
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;
import java.util.*;

public class busnumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());  
		String[] input = bf.readLine().split(" ");
		
		int[] bus = new int[N];
		for (int i = 0; i < N; i++) { bus[i] = Integer.parseInt(input[i]); }
		Arrays.sort(bus);
		 
		String bs = bus[0] + "";
		for (int i = 1; i < N; i++) {   
			if (bus[i-1]+1 == bus[i]) { 
				if ( (i+1) < N && bus[i+1] == bus[i]+1)  {
					bs += "-";
					int count = 1; 
					while ((i+count)<N && bus[i-1+count]+1 == bus[i+count]) { count++; }  
					bs += bus[i+count-1];  
					i = i+count-1;
				} else { bs += " " + bus[i]; }
			} else {
				bs += " " + bus[i];
			} } 
		
		System.out.print(bs);  
		
	}
}
