import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double  p = s.nextDouble();
		double  r = s.nextDouble();
		double  t = s.nextDouble();
		FinanceCalculator f = new FinanceCalculator();
		System.out.printf("%.2f",f.calculateSimpleInterest(p, r, t));
	}

}
