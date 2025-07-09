package lab12;
import java.util.Scanner;


public class MyClass {
	Scanner so=new Scanner(System.in);
	String name;
	int qty;

	public void q() {
		System.out.println("quantity"+this.qty);
	}
	
	public void sechprch(MyClass arr[], int count, String accnum) {
	    for (int i = 0; i < count; i++) {
	        if (arr[i].name.equals(accnum)) {
	        	System.out.println("find"+i);
	        }
	    }
	    System.out.println("null");
	}
	public void sechprod(MyClass arr[], int count, String accnum) {
	    for (int i = 0; i < count; i++) {
	        if (arr[i].name.equals(accnum)) {
	            System.out.println("ar index"+i); 
	        }
	    }
	    System.out.println("null");
	}
	
	public void set() {
		System.out.println("Enter name of prod");
		this.name=so.next();
		System.out.println("Enter quan");
		this.qty=so.nextInt();
			
	}
	
}
