package p1;
import java.util.Scanner;
public class fan {





	
	private String company;
	private String type;
	private double voltage;
	private int Price;
	
	
	
	void input() {
		System.out.println("Enter Company Name, type,Voltage,Price");
		Scanner so=new Scanner(System.in);
		
		company =so.nextLine();
		type =so.nextLine();
		voltage =so.nextFloat();
		Price =so.nextInt();
		
	}
	void display() {
		System.out.println("price"+Price);
		System.out.println("name"+company);
		
	}
	
	int getPrice() {
		return Price;
	}
	
		
		
	
}		
	