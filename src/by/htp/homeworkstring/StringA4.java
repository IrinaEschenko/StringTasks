package by.htp.homeworkstring;

//import java.util.Arrays;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class StringA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//After every 5 symbol insert "(Hi!)"
		String input = "(Hi)";
		String s = "Hello my friend!";
		System.out.println(s);
		s = s.replaceAll("(.{5})", "$1"+input);
		System.out.println(s);
		
		
	
		
	}

}
