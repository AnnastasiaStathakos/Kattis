/*
 * Kattis Challenge Programming: 2048
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Arrays;

public class t2048 { 
	
	private static int[][] game = new int[4][4];
	
	private static int[] shiftrowlr2(int[] row, int index, int dir) { 
		int[] r = new int[row.length]; 
		
		if ( dir == 0 ) { // left  
			for (int i = 0; i < index; i++) { r[i] = row[i]; }
			for (int i = index; i < row.length-1; i++) { r[i] = row[i+1]; }
			r[row.length-1] = 0; 
		} else { // right 
			r[0] = 0;
			for (int i = index; i > 0; i--) { r[i] = row[i-1]; }
			for (int i = index+1; i < row.length; i++) { r[i] = row[i]; }
			 	
		}  
		
		return r;
	} 
	
	private static int[][] transpose(int[][] g) {
		int[][] t = new int[g.length][g.length];
		
		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g.length; j++) { t[j][i] = g[i][j]; }
		} 
		
		return t;
	}
	
	private static int[][] action(int[][] g, int m) {
		int[][] newg = new int[4][4];
		int[][] temp = new int[4][4];

		switch (m) {
			case 0: // left
				for (int i = 0; i < 4; i++) { 
					for (int j = 0; j < 4; j++) {
						for (int h = 0; h < 4; h++) {
						if (g[i][h] == 0) {  int k = 0;
							while ((k<4) && g[i][h] == 0) { g[i] = shiftrowlr2(g[i], h, 0);  k++; } 
						} }  
						if ((j+1<4) && g[i][j] == g[i][j+1] && (g[i][j+1] != 0)) {  
							g[i] = shiftrowlr2(g[i], j, 0);  
							newg[i][j] = g[i][j] + g[i][j];  
						} else { newg[i][j] = g[i][j]; } 
					}  	  
				} 
				break;
			case 1: // up  
				temp = action(transpose(g), 0);
				newg = transpose(temp);
				break;
			case 2: // right 
				for (int i = 0; i < 4; i++) { 
					for (int j = 3; j >= 0; j--) {
						for (int h = 3; h >= 0; h--) {
							if (g[i][h] == 0) {  int k = 0;
								while ((k<4) && g[i][h] == 0) { g[i] = shiftrowlr2(g[i], h, 1);  k++; } 
							} } 
						if ((j-1>=0) && g[i][j] == g[i][j-1] && (g[i][j-1] != 0)) {  
							g[i] = shiftrowlr2(g[i], j, 1);  
							newg[i][j] = g[i][j] + g[i][j];  
						} else { newg[i][j] = g[i][j]; } 
					} 
				} 
				break;
			case 3: // down 
				temp = action(transpose(g), 2);
				newg = transpose(temp); 
				break;
			default:
				break;
		}
		
		return newg;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
		for (int i = 0; i < 4; i++) {
			String[] row = bf.readLine().split(" ");
			for (int j = 0; j < 4; j++) {
				game[i][j] = Integer.parseInt(row[j]); // board state
			}
		}
		int move = Integer.parseInt(bf.readLine()); // move number
		
		int[][] b = action(game, move);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
