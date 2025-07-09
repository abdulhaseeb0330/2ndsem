package lab6;
import java.util.Scanner;
//import lab6.Class1;
class Clas {

	 double pi=3.14159;
	double radius;
	double cir;
//	void input() {
//		Scanner so=new Scanner(System.in);
//		System.out.println("Enter radius");
//		radius=so.nextDouble();
//	}
	
	double getarea() {
		
		
		return pi*(radius*radius);
	}
	double getcir() {
		
		return 2*pi*radius;
	}
	
	
}


public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int check=0;
		Clas sone=new Clas();
		Clas stwo=new Clas();
		Clas sthree=new Clas();
		Clas smax=new Clas();
		sone.radius=5.10;
		stwo.radius=5.10;
		sthree.radius=5.10;
		
		sone.cir=sone.getcir();
		stwo.cir=stwo.getcir();
		sthree.cir=sthree.getcir();
		
		System.out.println("Enter 1 for area");
		System.out.println("Enter 2 for circumference");
		System.out.println("enter 3 total area of 3 circles");
		check=s.nextInt();
		double aras=sone.getarea()+stwo.getarea()+sthree.getarea();
	switch(check) {
	case 1:
		System.out.println("Area 1 circle"+sone.getarea());
		System.out.println("Area 1 circle"+stwo.getarea());
		System.out.println("Area 1 circle"+sthree.getarea());
		break;
case 2:
	System.out.println("circumference 1 circle"+sone.getcir());
	System.out.println("circumference 1 circle"+stwo.getcir());
	System.out.println("circumference 1 circle"+sthree.getcir());
		break;
case 3:
	System.out.println("total area of 3 circles="+sone.getarea()+stwo.getarea()+sthree.getarea());
	break;
	}
		
		smax.cir=sone.cir;
if(smax.cir>stwo.cir) {
	 if(smax.cir>sthree.cir) {
			System.out.println("circle 1");
		}else {
			System.out.println("circle 3");
		}
}else if(stwo.cir>sthree.cir) {
	System.out.println("circle 2");
}else {
	System.out.println("circle 3");
}
}
	
}
