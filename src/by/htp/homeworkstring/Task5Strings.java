package by.htp.homeworkstring;

public class Task5Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "(Hi)";
		String s = "Hello my friend! Allo Grufallo";
		System.out.println(s);
		s = s.replaceAll("(.llo)", "$1"+input);
		System.out.println(s);
	
	}

}
