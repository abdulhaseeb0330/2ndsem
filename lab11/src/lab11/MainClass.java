package lab11;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		System.out.println("Enter Employee daat 1");
		e1.input();
		System.out.println("Enter Employee daat 2");
		e2.input();
		System.out.println("Enter Employee daat 3");
		e3.input();
		
		System.out.println("Enter Employee daat 1");
		e1.displayinfo();
		e1.calculatrebonus();
		System.out.println("Enter Employee daat 2");
	e2.displayinfo();
	e2.calculatrebonus();
	
		System.out.println("Enter Employee daat 3");
		e3.displayinfo();
		e3.calculatrebonus();
		
	}

}
