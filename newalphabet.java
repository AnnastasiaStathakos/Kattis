/*
 * Kattis Programming CHallenge: A New Alphabet
 * Solved by Annastasia Stathakos
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class newalphabet {
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Dictionary d = new Hashtable();
		d.put('a', "@"); 		d.put('b', "8"); 		d.put('c', "("); 	d.put('d', "|)"); 		d.put('e', "3"); 		d.put('f', "#");
		d.put('g', "6"); 		d.put('h', "[-]"); 		d.put('i', "|"); 	d.put('j', "_|"); 		d.put('k', "|<"); 		d.put('l', "1");
		d.put('m', "[]\\/[]"); 	d.put('n', "[]\\[]");	d.put('o', "0");	d.put('p', "|D"); 		d.put('q', "(,)"); 		d.put('r', "|Z");
		d.put('s', "$"); 		d.put('t', "\'][\'"); 		d.put('u', "|_|");	d.put('v', "\\/"); 		d.put('w', "\\/\\/"); 	d.put('x', "}{");
		d.put('y', "`/"); 		d.put('z', "2"); 		d.put('A', "@"); 	d.put('B', "8"); 		d.put('C', "("); 		d.put('D', "|)");
		d.put('E', "3"); 		d.put('F', "#"); 		d.put('G', "6"); 	d.put('H', "[-]"); 		d.put('I', "|"); 		d.put('J', "_|");
		d.put('K', "|<"); 		d.put('L', "1"); 		d.put('M', "[]\\/[]"); d.put('N', "[]\\[]"); d.put('O', "0"); 		d.put('P', "|D");
		d.put('Q', "(,)"); 		d.put('R', "|Z"); 		d.put('S', "$"); 	d.put('T', "\'][\'"); 		d.put('U', "|_|"); 		d.put('V', "\\/");
		d.put('W', "\\/\\/");	d.put('X', "}{"); 		d.put('Y', "`/"); 	d.put('Z', "2");
		
		String text = bf.readLine();
		String cool = "";
		for (int i = 0; i < text.length();i++) {
			if (d.get(text.charAt(i)) != null) { 
				cool += d.get(text.charAt(i)) + "";
			} else { cool += text.charAt(i); }
		}
		System.out.println(cool);
	}

}
