package doubleTrouble;
import java.util.*;
public class DoubleTrouble {
 public static void main(String []args) {
	 Scanner s = new Scanner(System.in);
		int num= s.nextInt();
	 int n = doubleTheNumber( num);
	 System.out.println(n);
	
}
 public static int doubleTheNumber(int num) {
	 
	 return 2*num;
 }
}
