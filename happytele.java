/*
 * Kattis Programming Challenges: Happy Telephones
 * Solved by Annastasia Stathakos
 */
import java.io.*;
import java.lang.Math;
import java.util.*;

public class happytele {

	// Interval object to represent the start and end of a call or listening period
	static class Interval {
		private int start;
		private int end;
		
		public Interval() {
			this.start = 0;
		}
		
		public Interval(int s, int e) {
			if ( s < e) { start = s; end = e; } 
			else { start = e; end = s; }
		}
		
		public int intervalLen() {
			return this.end-this.start;
		}
		
		public Interval interIntersec(Interval b) {
			int st = Math.max(this.start, b.start);
			int en = Math.min(this.end, b.end);  
			
			if ( st > en ) { return null; }
			
			Interval c = new Interval(st, en);
			return c; 
		} 
		
		@Override
		public String toString() {
			return this.start + " " + this.end;
		}
	}
	
	
	// Call object to represent an active call or listening period
	static class Call { 
		private Interval interval = new Interval();
		
		public Call(int s, int d) { 
			this.interval = new Interval(s, s+d); 
		}
		
		public boolean overlap(Call c2) {
			Interval intersec = this.interval.interIntersec(c2.interval); 
			if (intersec == null) 
				return false;
			
			if (intersec.intervalLen() >= 1) 
				return true;
			
			return false;
		} 
		
		@Override
		public String toString() {
			return this.interval.toString();
		}
	}
	
 
	// Compute no. of active calls during each police listening interval
	public static int activeCalls(Call[] call, Call police) { 
		int count = 0; 
		for ( Call c : call ) {
			if ( police.overlap(c) ) { count++; }
		} 
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = " ";
		while (!(s = bf.readLine()).equals("0 0")) { 
			String[] info = s.split(" ");
			int N = Integer.parseInt(info[0]); // No. of calls
			int M = Integer.parseInt(info[1]); // No. of intervals 
			
			// Collect calls
			Call[] calls = new Call[N]; 
			for (int i = 0; i < N; i++) {
				info = bf.readLine().split(" "); 
				Call c = new Call(Integer.parseInt(info[2]), Integer.parseInt(info[3]));
				calls[i] = c;
			} 
			
			// Collect police listening intervals
			Call[] police = new Call[M];
			for (int i = 0; i < M; i++) {
				info = bf.readLine().split(" "); 
				Call r = new Call(Integer.parseInt(info[0]), Integer.parseInt(info[1]));
				police[i] = r;
			} 
			// Print out no. of active calls during listening intervals
			for ( Call p : police )
				System.out.println(activeCalls(calls, p)); 
			
		}
		
	}
}
