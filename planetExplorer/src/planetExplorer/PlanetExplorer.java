package planetExplorer;
import java.util.*;
public class PlanetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double  radius = s.nextDouble();
		double d = CalculateSurfaceArea.SurfaceArea(radius);
System.out.printf("%.2f",d);
	}

}
