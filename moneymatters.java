/*
 * Kattis Programming Challenge: Money Matter
 * Solved by: Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Friend {
	ArrayList<Friend> ships;
	int debt;
	
	public Friend(int d) { 
		ships = new ArrayList<Friend>();
		debt = d;
	} 
}

public class moneymatters { 
	
	private static int N; // no. of friends
	private static int M; // no. of friend ships
	
	private static int DFS(Friend f, HashSet<Friend> visit, int curr) { 
		int total = curr + f.debt;
		
		visit.add(f); 
		for ( Friend i : f.ships) { 
			if (!visit.contains(i)) { 
				total += DFS(i, visit, 0);
			} 
		}
		return total;
	} 
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = bf.readLine().split(" "); 
		N = Integer.parseInt(input[0]); // no. of friends
		M = Integer.parseInt(input[1]); // no. of ships
		 
		ArrayList<Friend> friends = new ArrayList<Friend>();
		for (int i = 0; i < N; i++) {
			Friend f = new Friend(Integer.parseInt(bf.readLine())); 
			friends.add(f);			   // Array of debts each friend has
		}    
		
		for (int i = 0; i < M; i++) {
			String[] pair = bf.readLine().split(" ");
			int x = Integer.parseInt(pair[0]);
			int y = Integer.parseInt(pair[1]);
			
			friends.get(x).ships.add(friends.get(y));
			friends.get(y).ships.add(friends.get(x));  
		}
		 
		HashSet<Friend> visited = new HashSet<Friend>();
		for (int i = 0; i < N; i++) { 
			if ( !visited.contains(friends.get(i)) && (DFS(friends.get(i), visited, 0) != 0) ) {
				System.out.println("IMPOSSIBLE"); 
				return; 
			}
		}
		System.out.println("POSSIBLE");
		return;
	}
}
