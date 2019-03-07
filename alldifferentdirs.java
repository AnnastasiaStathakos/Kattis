/*
 * Kattis Programming Challenge: All Different Directions
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
import java.lang.Math;

public class alldifferentdirs { 
	// turn, degree amt, current pos. >> rotate by degree amt;
	// walk, x dist, current pos. >> go x dist from curr position;
	private static double[] go(String instr, double vers, double[] du) { 
		double[] to = new double[3]; 
		
		if (instr.equals("turn")) { 
			to[0] = du[0]; to[1] = du[1];
			to[2] = du[2] + vers;
		} else if (instr.equals("walk")) { 
			to[0] = du[0] + vers*Math.cos(Math.toRadians(du[2]));
			to[1] = du[1] + vers*Math.sin(Math.toRadians(du[2]));
			to[2] = du[2];
		}  
		return to;
	}
	
	private static double distance(double[] dest, double[] best) {
		return Math.sqrt(Math.pow(best[0] - dest[0], 2) + Math.pow(best[1] - dest[1], 2));
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String in = " ";
		while (!(in = bf.readLine()).equals("0")) {
			int n = Integer.parseInt(in); // no. of people asked
			
			double[] avg_dest = new double[2];
			double[][] dest = new double[n][2];
			for (int i = 0; i < n; i++) {
				String[] chart = bf.readLine().split(" "); 
				double[] start_pos = { Double.parseDouble(chart[0]), 
										Double.parseDouble(chart[1]), 
										 Double.parseDouble(chart[3]) }; 
				
				double[] curr_pos = start_pos;  
				for (int j = 4; j < chart.length-1; j++) {   
					curr_pos = go(chart[j], Double.parseDouble(chart[j+1]), curr_pos); j++; 
				}
				
				dest[i][0] = curr_pos[0]; dest[i][1] = curr_pos[1];
				avg_dest[0] += curr_pos[0]; avg_dest[1] += curr_pos[1]; 
			}
			avg_dest[0] /= n; avg_dest[1] /= n; 
			
			double max_dist = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				max_dist = Math.max(max_dist, distance(dest[i], avg_dest));
			}
			
			System.out.println(avg_dest[0] + " " + avg_dest[1] + " " + max_dist);
		} 
	} 
}
