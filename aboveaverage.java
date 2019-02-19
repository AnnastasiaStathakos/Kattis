/*
 * Kattis Programming CHallenge: Above Average
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class aboveaverage {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(bf.readLine()); // no. of test cases;
		
		for (int i = 0; i < C; i++) {	
			String[] grades = bf.readLine().split(" ");
			int N = Integer.parseInt(grades[0]); // no. of students in class
			
			double sum = 0;
			double[] g = new double[N];
			for (int j = 1; j <= N; j++) { 
				g[j-1] = Double.parseDouble(grades[j]);
				sum += g[j-1];
			}  
			double avg = sum/N;	// compute class average
			
			double count = 0;
			for (int j = 0; j < N; j++) {
				if (g[j] > avg) { count++; }	// compute how many are above average
			}
			
			double percent = count/N*100;
			System.out.printf("%.03f%% \n",percent);
		}
		
		
	}
}
