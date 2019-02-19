/*
 * Kattis Programming Challenge: ACM Contest Scoring
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class acm {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> m = new ArrayList<Integer>();  
		ArrayList<String> ans = new ArrayList<String>();
		String problem = "";
		 
		String in = "";
		while (!(in = bf.readLine()).equals("-1")) {
			String[] entry = in.split(" "); 
			
			ans.add(entry[2]);   
			problem += entry[1] + ""; 
			m.add(Integer.parseInt(entry[0])); 
		}
		
		
		int time = 0, right = 0;
		for (int i = 0; i < ans.size(); i++) {
			if (ans.get(i).equals("right")) {
				time += m.get(i);
				right++;  
				
				for (int j = 0; j < problem.length(); j++) {
					if (problem.charAt(j) == problem.charAt(i) && ans.get(j).equals("wrong")) {
						time += 20;
					} }
			} }
		
		if (right == 0) { time = 0; }
		
		System.out.println(right + " " + time);
		
	}
}
