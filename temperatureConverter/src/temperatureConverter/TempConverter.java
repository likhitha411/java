package temperatureConverter;
import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double fahrenheit = s.nextDouble();
		System.out.printf("%.2f",convertFahrenheitToCelsius( fahrenheit));

	}


		public static double convertFahrenheitToCelsius(double fahrenheit) {
			return (fahrenheit-32)*5/9;
		}

	

}
