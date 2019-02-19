/*
 * Kattis programing Challenge: Akcjia
 * Solved by Annastasia Stathkos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
import java.util.Arrays;

public class akcija {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // No. of books 
		  
		int cost = 0; 
		int[] price = new int[N]; 
		for (int i = 0; i < N; i++) { 
			int book = Integer.parseInt(bf.readLine()); 
			price[i] = book;
			cost += book;
		}   
		Arrays.sort(price);
		 
		for (int i = N-3; i>=0; i-=3) { cost-=price[i]; } 
		System.out.println(cost);
	}
}
