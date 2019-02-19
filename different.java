/*
 * Kattis Challenges Programming: A different Problem
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math; 

public class different {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String in = "";
		while ( (in = bf.readLine()) != null) {
			String[] nums = in.split(" ");
			
			double A = Double.parseDouble(nums[0]);
			double B = Double.parseDouble(nums[1]);
			
			double diff = Math.abs(B-A);
			System.out.printf("%1.0f \n",diff);
		}
		
	}
}
