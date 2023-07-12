package cubeMystery;
import java.util.*;
public class CubeMystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(cubeNumber( num));

	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}
