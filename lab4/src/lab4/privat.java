package lab4;
import java.util.Scanner;


class fan{
	
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
	


public class privat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fan f1=new fan();
		fan f2=new fan();
		fan f3=new fan();
		
		f1.input();
		f2.input();
		f3.input();
		fan mix=f1;
		
		if(mix.getPrice()>f2.getPrice()) {
			mix=f2;
		}else {
			mix=f3;
		}
		
		
		mix.display();
	}

}
