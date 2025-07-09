package jazzcash;
import java.util.Scanner;
public class jazz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bol=false;
		do {
Scanner so=new Scanner(System.in);
	System.out.println("1.Transfer Amount");
	System.out.println("2. Bill Payment");
	System.out.println("3. Mobile Packages");
	System.out.println("4. Exit");
	
	 int enter = so.nextInt();

		switch(enter) {
		case 1:
//			do {
			System.out.println("a. Jazz to Jazz");
			System.out.println("b. Bank Transfer");
			char ch= so.next().charAt(0);
			
			switch(ch) {
			case 'a':
				System.out.println("Amount Transferred");
				bol=false;
				break;
			case 'b':
				System.out.println("Amount Enter");
				bol=false;
				break;
				default:
					bol=false;
			}
			break;
		case 2:
			System.out.println("1. IESCO");
			System.out.println("2. MCI");
			int ch1= so.nextInt();
			if(ch1==1) {
				System.out.println("Amount Transferred");
				bol=false;
			}else if(ch1==2) {
				System.out.println("Amount Enter");
				bol=false;
			
			
			}else {
				bol=false;
			}
			break;
		case 3:
			System.out.println("1. Monthly");
			System.out.println("2. Daily");
			char ch2= so.next().charAt(0);
			switch(ch2) {
			case '1':
				System.out.println("Amount Transferred");
				bol=false;
				break;
			case '2':
				System.out.println("Amount Enter");
				bol=false;
				break;
				default:
					bol=false;
			}
			break;
		case 4:
			System.out.println("Exit Thanks");
			bol=true;
			break;
			default:
				bol=false;	
}
		}while(bol==false);
	
	}		
	}


