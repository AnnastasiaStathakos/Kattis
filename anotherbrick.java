/*
 * Kattis Programming Challenge: Another Brick in the Wall
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class anotherbrick {

	private static int laybricks(int h, int w, Queue<Integer> b) {
		int feasible = 1;   
	
		for (int k = 0; k < h; k++) {
			int blen = 0;
			while (blen < w && !b.isEmpty())  { 
				blen = blen + b.remove(); 
			} 
			if (blen != w) { return feasible = -1; }
		} 
		return feasible;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ins = bf.readLine().split(" ");
		
		int h = Integer.parseInt(ins[0]); 	// height		[1, 100]
		int w = Integer.parseInt(ins[1]); 	// width		[1, 100]
		int n = Integer.parseInt(ins[2]); 	// no. bricks [1, 10000]
		
		ins = bf.readLine().split(" ");   	
		Queue<Integer> lengths = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			lengths.add(Integer.parseInt(ins[i]));
		} 
		  
		if (laybricks(h,w,lengths) == -1) { System.out.println("NO"); } 
		else { System.out.println("YES"); }
		
		 
	}
}
