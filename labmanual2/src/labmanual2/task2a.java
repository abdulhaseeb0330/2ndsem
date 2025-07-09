package labmanual2;
import java.util.Scanner;

class Calculator{
	double a,b;
	double sum,div,sub,mul;
	
	 double add(double a,double b) {
		double c=a+b;
		return c;
	}
	double sub(double a,double b) {
		double c=a-b;
		return c;
	}
	double mul(double a,double b) {
		double c=a*b;
		return c;
	}
	double div(double a,double b) {
		double c=a/b;
		return c;
	}
}
public class task2a{
public static void main(String[] args) {
	Scanner so=new Scanner(System.in);
	Calculator s=new Calculator();
	
	s.a=so.nextDouble();
	s.b=so.nextDouble();

	System.out.println(s.sum=s.add(s.a,s.b));
	System.out.println(s.sub=s.sub(s.a,s.b));
	System.out.println(s.sub=s.mul(s.a,s.b));
	System.out.println(s.div=s.div(s.a,s.b));
	
}
}


