/*
 * Kattis Programming Challenges: Convex Polygon Area
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

public class complexpolygonarea {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());//No. of lines
		
		for (int i = 0; i < n; i++) {
			String[] points = bf.readLine().split(" ");
			int m = Integer.parseInt(points[0]); // no. of points
			  
			int index = 1;
			double[] X = new double[m+1];
			double[] Y = new double[m+1]; 
			for (int j = 1; j <= m; j++) {
				X[j-1] = Double.parseDouble(points[index]); index++;
				Y[j-1] = Double.parseDouble(points[index]); index++;
			}
			X[m] = X[0]; Y[m] = Y[0];
			
			double sum1 = 0, sum2 = 0;
			for (int j = 0; j < m; j++) {
				sum1 += X[j]*Y[j+1];
				sum2 += Y[j]*X[j+1]; 
			}
			
			double area = 0.5*Math.abs(sum1 - sum2); 
			
			System.out.println(area); 
		}
		 
	}

}
