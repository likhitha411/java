package semAverager;

import java.util.Scanner;

public class SemAverager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int sem1 = s.nextInt();
		int sem2 = s.nextInt();
		int sem3 = s.nextInt();
		int sem4 = s.nextInt();
		int sem5 = s.nextInt();
		int sem6 = s.nextInt();
		int sem7 = s.nextInt();
		int sem8 = s.nextInt();
		System.out.printf("%.2f",calculateAverage(sem1, sem2,  sem3,sem4,sem5,sem6,sem7,sem8));
	}

	
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0;
	}
}


