package stringJoiner;

public class StringJoiner {
 public static void main(String []args) {
	String s= joinStrings("Hello, ", "World!");
	System.out.println(s);
}
	
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}
}
