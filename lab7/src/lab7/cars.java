package lab7;
import java .util.Scanner;
public class cars {
private String company;
private int model;
private int price;
private int enginecap;

Scanner so=new Scanner(System.in);
public void input() {
	System.out.println("Enter compasny model price engine capacity one byh one ");
	company =so.next();
	model =so.nextInt();
	price =so.nextInt();
	enginecap =so.nextInt();

}

public void display() {
	System.out.println("company"+company);
	System.out.println("model"+company);
	System.out.println("price"+company);
	System.out.println("engine capacity"+enginecap);
	
}
public int getPrice() {
 return price;
}
public int geteng() {
	 return enginecap;
	}
public void setPrice(int m) {
	  price=m;
} 
}

