package lab3;
import java.util.Scanner;

class classha{
	
	String name;
	int rollno;
	double sc1,sc2;
	double total;

	
	void inputh(classha c) {
		Scanner so=new Scanner(System.in);
		System.out.println("name");
		c.name=so.next();
		System.out.println("roll no ");
		c.rollno=so.nextInt();
		System.out.println("2 scores ");
		c.sc1=so.nextFloat();
		c.sc2=so.nextFloat();
		
	}
	void caldisplay(classha p) {
		System.out.println("score total=");
		p.total=p.sc1+p.sc2;
		System.out.println(p.total);
	}

}




public class score {

	public static void main(String[] args) {
		
		classha c1=new classha();
		classha c2=new classha();
		
		
c1.inputh(c1);
c2.inputh (c2);


if(c1.total>c2.total) {
	System.out.println(" max");
	System.out.println(c1.name);
}else{
	System.out.println("max ");
	System.out.println(c2.name);
}

	}

}
