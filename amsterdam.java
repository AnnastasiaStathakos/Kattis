/*
 * Kattis Progamming Challenges: All About That Base
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.util.*;

public class amsterdam {
	
	private static double pie = 0;
	private static double radi = 0;
	private static double rings = 0; 

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] rl = bf.readLine().split(" ");
		
		pie   = Double.parseDouble(rl[0]); // no. of pie slices;
		rings = Double.parseDouble(rl[1]); // no. of half rings;
		radi  = Double.parseDouble(rl[2]); // radius of city;
		
		rl = bf.readLine().split(" ");
		double[] start = { Double.parseDouble(rl[0]), Double.parseDouble(rl[1]) };
		double[] end   = { Double.parseDouble(rl[2]), Double.parseDouble(rl[3]) };
		 
		double bist = Integer.MAX_VALUE;
		double max_dist = Math.max(start[1], end[1]);
		double min_dist = Math.min(start[1], end[1]); 
		for (int i = 0; i <= max_dist; i++) { 
			double dist = 0;
			dist += (radi/rings)*Math.abs(max_dist - i);
			dist += (radi/rings)*Math.abs(min_dist - i);
			dist += (radi/rings)*Math.PI*(Math.abs(start[0]-end[0])/pie)*i; 
			
			bist = Math.min(bist, dist);
		} 
		
		System.out.println(bist);
	}
}
