package lab6;
import java.util.Scanner;

public class Class1 {

	 double pi=3.14159;
	double radius;
	
	void input() {
		Scanner so=new Scanner(System.in);
		System.out.println("Enter radius");
		radius=so.nextDouble();
	}
	double getarea() {
		System.out.println("Enter radius");
		return pi*(radius*radius);
	}
	double getcir() {
		System.out.println("Enter radius");
		return 2*pi*radius;
	}
	
}
