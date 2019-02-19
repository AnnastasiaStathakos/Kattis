/*
 * Kattis Programming Challenge: Quadrant Selection
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class quadrant {
	
	private static int whichQuad(int x, int y) {
		int quad = 0;  
		
		if ( x >= 0 && y >= 0 ) { quad = 1; }
		else if ( x < 0 && y < 0 ) { quad = 3;}
		else if ( x > 0 && y < 0 ) { quad = 4;}
		else { quad = 2; }
		
		return quad;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] ins = bf.readLine().split(" ");
		int X = Integer.parseInt(ins[0]);
		
		ins = bf.readLine().split(" ");
		int Y = Integer.parseInt(ins[0]); 
		
		System.out.println(whichQuad(X, Y));
	}
}
