package assignment;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner so=new Scanner(System.in);
SIMCard[] sim = new SIMCard[100];
int simCount = 0;

do {
	System.out.println("1. Add new SIM card (issue)\r\n"
			+ "2. Add balance to an existing SIM\r\n"
			+ "3. Check balance of a SIM\r\n"
			+ "4. Deactivate a SIM\r\n"
			+ "5. Check activation status\r\n"
			+ "6. Transfer ownership of a SIM\r\n"
			+ "7. Use mobile data from a SIM\r\n"
			+ "8. Recharge mobile data to a SIM\r\n"
			+ "9. Display all SIM cards\r\n"
			+ "10. Exit the program");
	int choice=so.nextInt();
	if(choice==1) {
		String number,cnic;
		boolean b=false;
		do {
		System.out.println("Enter phone number");
		number=so.next();
		if(number.matches("\\d{11}")) {
			b=true;
		}else {b=false;}
		}while(b);
		
		b=false;
		do {
		System.out.println("Enter CNIC number without _es ");
		cnic=so.next();
		if(number.matches("\\d{13}")) {
			b=true;
		}else {b=false;}
		}while(b);
		int t;
		do {
		System.out.println("Press 1 for call \n Press 2 for data");
		t=so.nextInt();
		}while(t!=1||t!=2);
	}
	else if(choice==2) {
		
	}
	else if(choice==3) {}else if(choice==4) {}else if(choice==5) {}else if(choice==6) {}else if(choice==7) {}else if(choice==8) {}else if(choice==9) {}else {System.exit(0);}
}while(true);
	}

}
