/*
 * Kattis Progamming Challenges: Amalgamated Artichokes
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.util.*;

public class artichokes {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] numbers = bf.readLine().split(" ");
		int n = Integer.parseInt(numbers[5]); // sequence of n stock prices 
		 
		double[] cnst = new double[5]; 
		Double[] prices = new Double[n+1];
		for (int i = 0; i < 5; i++) { 
			cnst[i] = Double.parseDouble(numbers[i]); 
		}  
		for (int k = 1; k <= n; k++) {
			prices[k] = cnst[0]*( Math.sin(cnst[1]*k + cnst[2]) + Math.cos(cnst[3]*k + cnst[4]) + 2 );
			
		} 
		
		double decline = 0;
		double max_decline = 0;
		for (int i = 1; i <= n; i++) {   
			if (prices[i] > decline) { decline = prices[i]; } 
			else if ( (decline - prices[i]) > max_decline) {
				max_decline = decline - prices[i];
			} 
		}
		if( max_decline < 0) { max_decline = 0; }
		System.out.printf("%.06f", max_decline);
	}
}
