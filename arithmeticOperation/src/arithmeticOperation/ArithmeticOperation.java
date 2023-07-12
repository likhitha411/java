package arithmeticOperation;
import java.util.*;
public class ArithmeticOperation {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int su =subtractNumbers( num1,  num2);
		System.out.println(su);

		int mu = multiplyNumbers( num1,  num2);
System.out.println(mu);
		 double di=  divideNumbers( num1,  num2);
System.out.println(di);
		 int fr =  findRemainder( num1,  num2);
		System.out.println(fr);
	}
		public static int subtractNumbers(int num1, int num2) {
			
			return num1-num2;
		}

		public static int multiplyNumbers(int num1, int num2)
		{
			return num1*num2;
		}

		public static double divideNumbers(int num1, int num2) {
			return num1/num2;
		}

		public static int findRemainder(int num1, int num2) {
			return num1%num2;
		}
	

}
