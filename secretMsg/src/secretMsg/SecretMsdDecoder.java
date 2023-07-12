package secretMsg;
import java.util.*;
public class SecretMsdDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		char ch = s.next().charAt(0);
System.out.println(decodeCharacter(ch));
	}
	public static int decodeCharacter(char ch) {
		return (int)ch;
	}
}
