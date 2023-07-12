package heightConverter;
import java.util.*;
public class HeightConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double  i = s.nextDouble();
		Converter c = new Converter();
		System.out.printf("%.2f",c.convertInchesToFeet(i));
	}

}
