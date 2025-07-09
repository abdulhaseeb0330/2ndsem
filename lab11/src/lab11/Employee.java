package lab11;
import java.util.Scanner;
public class Employee {
String name;
Double Salary;
int age;

public void input() {
	Scanner so=new Scanner(System.in);
	System.out.println("Enter your name");
	this.name=so.next();
	System.out.println("Enter your Salary");
	this.Salary=so.nextDouble();
	System.out.println("Enter your age");
	this.age=so.nextInt();
}
public void displayinfo() {
	System.out.println("name"+this.name);
	System.out.println("Salary"+this.Salary);
	System.out.println("age"+this.age);
}
public void calculatrebonus() {
	Double x=this.Salary*10/100;
	Double b=this.Salary+x;
	System.out.println("Salary after bonus 10% is="+b);
}
	
}
