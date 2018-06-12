package by.htp.homeworkstring;

public class Task7String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello568  567     my87 y7898yuhkfriend! 8798Allo *()_&^Grufallo";
		System.out.println(s);
		s = s.replaceAll("[ \t\n\r]+", " ");
		s = s.replaceAll("[^A-Za-z ]", "");
		System.out.println(s);
	}

}
