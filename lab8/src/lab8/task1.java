package lab8;
import java.util.Scanner;



public class task1 {

	public static void main(String[] args) {
		Scanner sm=new Scanner(System.in);
		taskclass t1=new taskclass();
		// TODO Auto-generated method stub
		System.out.println("Enter coffee Amount");
		System.out.println("coffee than water than milk");
		double cof,mil,wat;
		cof=sm.nextDouble();
		wat=sm.nextDouble();
		mil=sm.nextDouble();
//		
		t1.refillcoffee(cof);
		t1.refillwater(wat);
		t1.refillmilk(mil);
		
		System.out.println("Enter coffee in gms");
		double coffee =sm.nextDouble();
		System.out.println("Enter water in ml");
		double water =sm.nextDouble();
		System.out.println("Enter milk in ml");
		double milk =sm.nextDouble();
		t1.brewcoffee(coffee,water,milk);
		t1.Display();

	}
	

}
