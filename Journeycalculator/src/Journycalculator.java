import java.util.*;
public class Journycalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		double speed = s.nextDouble();
		double time = s.nextDouble();
		double c = calculateDistance( speed,  time);
		System.out.println(c);
	}
	public static double calculateDistance(double speed, double time) {
		return speed*time;

	}

}
