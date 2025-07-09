package FlightSystem;
import java.util.Arrays;
import java.util.Scanner;


public class MoonAirline {
	
public static void main(String[] args) {
	Scanner  so=new Scanner(System.in);
	
	int check=0;
	 
	do {
	System.out.println("=== Welcome To Moon AirLine ===");
	System.out.println("-------------------------------");
	System.out.println("1. Pessenger");
	System.out.println("2. Staff");
	System.out.println("3. General Details");
  check=so.nextInt();
	
	if(check==1) {
		System.out.println("=== Welcome On Passenger Portal ===");
		System.out.println("-----------------------------------");
		
	}else if(check==2) {
		System.out.println("=== Welcome On Staff Portal ===");
		System.out.println("-------------------------------");
		
	}else if(check==3) {
		System.out.println("=== Welcome On General Portal ===");
		System.out.println("-------------------------------");
		
	}else {
		System.out.println("Oops! Invalid Option");
		System.out.println("Press 0 for Again Start");
		
		
	}
	}while(check!=0);
	


}
}


//public void 







