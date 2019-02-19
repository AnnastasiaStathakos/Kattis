/*
 * Kattis Programming Challenge: Completeing the Square
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class compthesq {
	
	private static int[] vect(int[] x, int[] y) {
		int[] xy = {y[0]-x[0],y[1]-x[1]};
		return xy;
	}

	private static int dot(int[] x, int[] y) {
		return x[0]*y[0] + x[1]*y[1];
	}

	private static int[] add(int[] x, int[] y, int[] p) {
		int[] xy = {p[0]+(x[0]+y[0]), p[1]+(x[1]+y[1])};
		return xy;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] coords = bf.readLine().split(" ");
		int[] A = { Integer.parseInt(coords[0]), Integer.parseInt(coords[1]) };
		coords = bf.readLine().split(" ");
		int[] B = { Integer.parseInt(coords[0]), Integer.parseInt(coords[1]) };
		coords = bf.readLine().split(" ");
		int[] C = { Integer.parseInt(coords[0]), Integer.parseInt(coords[1]) }; 
		
		int[] corner = new int[2];
		if ( dot(vect(A, B), vect(A, C)) == 0) { corner = add(vect(A,B),vect(A,C), A); } 
		else if ( dot(vect(B, A), vect(B, C)) == 0 ) { corner = add(vect(B,A),vect(B,C), B); } 
		else if ( dot(vect(C, A), vect(C, B)) == 0 ) { corner = add(vect(C,A),vect(C,B), C); } 
		else { System.out.println("error"); }
		
		System.out.println(corner[0] + " " + corner[1]);
		
	}
}
