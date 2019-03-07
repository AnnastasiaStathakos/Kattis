/*
 * Kattis Progamming Challenges: All About That Base
 * Solved by Annastasia Stathakos
 */ 
 import java.util.*;

public class ants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // no. of cases
		
		for (int i = 0; i < N; i++) { 
			int len = sc.nextInt(); 	// len of pole in cm
			int n = sc.nextInt();		// no. of ants on pole
			
			int[] ants = new int[n+1];
			int shrt = Integer.MIN_VALUE, lng  = Integer.MIN_VALUE;
			for (int j = 0; j < n; j++) {
				ants[j] = sc.nextInt();
				shrt = Math.max(Math.min(ants[j], len-ants[j]), shrt);
				lng  = Math.max(Math.max(ants[j], len-ants[j]), lng);
			}
			System.out.println(shrt + " " + lng); 
			 
		}
		sc.close();
	}
}
