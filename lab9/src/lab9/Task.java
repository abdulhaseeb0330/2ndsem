package lab9;
import java.util.Scanner;
public class Task {

	int quan;
	double price;
	String name;
	
	public void input() {
		System.out.println("name");
		this.name=so.next();
		System.out.println("quan");
		this.quan=so.nextInt();
		System.out.println("price");
		this.price=so.nextInt();
		}
	public void display() {
		System.out.println("name"+this.name);
		System.out.println("quan"+this.quan);
		System.out.println("price"+this.price);
		
	}
	public void tp() {
		
		System.out.println("bill"+this.quan*this.price);
		
		
	}

	
	Scanner so=new Scanner(System.in);

}
