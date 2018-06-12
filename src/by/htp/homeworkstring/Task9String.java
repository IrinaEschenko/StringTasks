package by.htp.homeworkstring;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Task9String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello, my friend! Hello. my Grufallo! Hello my Mammy!";
		String words[] = getString(s);
		findMatchesCount(words);
		
	}


	public static String [] getString(String s) {
		
		s=s.replaceAll("[\\!|\\,|\\.]+", "");

		System.out.println(s);
		Pattern patern = Pattern.compile("\\s");
		String []words = patern.split(s);
		System.out.println((Arrays.toString(words)));
		
	//	return [];
		return words;
	}
	
	public static void findMatchesCount(String []s) {
		for(int i = 0; i< s.length; i++) {
			int counter = 0;
			for( int j=0; j<s.length;  j++) {
				
				if(s[i].equals(s[j]) ) {
					counter++;
				}
					
			}
			print(s[i], counter);

		}

		
	}
	public static void print(String words, int counter) {
		System.out.println("We found "+words+" "+counter+" times" );		
		
	}
	
}
