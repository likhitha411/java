package galacticArithmeticia;
import java.util.*;
public class GalacticAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n1 = s.nextLong();
		long n2 = s.nextLong();
		long r = galacticAddition(n1,n2);
		System.out.println(r);
		
s.close();
	}
	public static long galacticAddition(long n1,long n2) {
		return n1+n2;
	}

}
