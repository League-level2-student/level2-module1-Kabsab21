package _00_intro_to_array_lists;

import java.nio.charset.Charset;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> words = new ArrayList<String>();
		//2. Add five Strings to your list
		words.add("crocodile");
		words.add("platypus");
		words.add("orange");
		words.add("deez nutz");
		words.add("holy spirit");
		//3. Print all the Strings using a standard for-loop
		for( int i = 0; i < words.size(); i++) {
			String w = words.get(i);
			System.out.println("string uh thing "+i+" is called "+w);
		}
		//4. Print all the Strings using a for-each loop
		for( String w: words) {
			System.out.println(w);
		}
		//5. Print only the even numbered elements in the list.
		for( int i = 0; i < words.size(); i++) {
			if(i % 2 == 0) {
			String w = words.get(i);
			System.out.println("string uh thing "+i+" is called "+w);
			}
		}
		//6. Print all the Strings in reverse order.
		for( int i = words.size() - 1; i >= 0; i--){
			String w = words.get(i);
			System.out.println("string uh thing "+i+" is called "+w);
			}
		
		//7. Print only the Strings that have the letter 'e' in them.
		
	for( int i =0 ; i <  words.size(); i++){
		boolean hase = false;
		String w = words.get(i);
		
		for( int e = 0; e < w.length(); e++) {
				char e1 = 'e';
				if( w.charAt(e) == (e1)) {
					hase = true;
					}
				}
		
		if(hase == true){
			System.out.println("string uh thing "+i+" is called "+w);
				}
			}
	
	
	}
}
