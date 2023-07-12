package practise;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new  Scanner(System.in);
		
		
		
		for(;;) {
			System.out.println("hello user.....\n +--->addition\n- -->sub\n * -->multiplication\n / --> division\n % --> modular division\n ^ --->square");
			
			System.out.println("enter an option or enter ! to exit");
			char c = s.next().charAt(0);
			if(c=='!') {
				System.out.println("ok...tata...see u ....bye bye");
				break;
			}
			System.out.println("enter the 2 numbers");
			int a = s.nextInt();
			int b = s.nextInt();
			
			switch(c) {
			case '+': System.out.println("sum is: "+(a+b));break;
			case '-': System.out.println("sub is: "+(a-b));break;
			case '*': System.out.println("mul is: "+(a*b));break;
			case '/': System.out.println("div is: "+(a/b));break;
			case '%': System.out.println("modular div is: "+(a%b));break;
			case '^':System.out.println("enter a number");int y=s.nextInt();  System.out.println("square of  number is"+(y*y));
			default :System.out.println("enter a valid option");
			
			
			}
		
		}
			
		}
		
		
	}

