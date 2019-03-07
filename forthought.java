/*
 * Kattis Programming Challenge: 4 thought
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;
import java.util.*;

public class forthought {
	
	// Given an int map to operation [0 : +] [1 : -] [2 : *] [3 : /]
	private static String op_toString(int i) {
		return (i == 0) ? "+" : (i == 1) ? "-": (i == 2) ? "*" : "/"; 
	}  
	
	// evaluates a <op> b
	private static int eval(char op, int a, int b) { 
		return (op == '+') ? a+b : (op == '-') ? a-b : (op == '*') ? a*b : (b==0) ? 0 : a/b;
	}
	
	// T if op2 has higher importance than or same importance as op1, else F
	private static boolean precedence(char op1, char op2) {
		return ((op2 == '*' || op2 == '/') && (op1 == '+' || op1 == '-')) ? true : false;
	}
	
	// Given three operations, turn into expression of 4 fours.
	private static String expression(int op1, int op2, int op3) {
		return "4 " + op_toString(op1) + " 4 " + op_toString(op2) + " 4 "  + op_toString(op3) + " 4";
	}
	 
	private static int evaluate(char[] expr) {
		Stack<Character> ops = new Stack<Character>();
		Stack<Integer> value = new Stack<Integer>();
		
		for (int i = 0; i < expr.length; i++) {
			if (expr[i] == ' ') continue;  
			if (expr[i] == '4') value.push(4); 
			else if (expr[i] == '*' || expr[i] == '/' || expr[i] == '+' || expr[i] == '-') { 
				while (!ops.empty() && precedence(expr[i], ops.peek())) {
					value.push( eval(ops.pop(), value.pop(), value.pop()) );
				}
				ops.push(expr[i]); 
			}
		}
		while ( !ops.empty() ) {
			value.push( eval(ops.pop(), value.pop(), value.pop()) );
		}
		
		return value.pop();
	} 
	
	private static String searchR(int R) {   
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) { 
					int r = evaluate(expression(k,j,i).toCharArray());  
					if (r == R) {
						return expression(i,j,k) + " = " + R;
		} } } }
		return "no solution";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		int M = Integer.parseInt(bf.readLine());
		int R = 0;
		
		for (int i =0; i < M; i++) {
			R = Integer.parseInt(bf.readLine());  
			System.out.println(searchR(R));
		}  
	} 
}
