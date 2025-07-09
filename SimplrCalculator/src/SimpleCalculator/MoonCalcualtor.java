package SimpleCalculator;

import java.util.Scanner;

public class MoonCalcualtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome MOON\'s Coding Calculator");

		char permission;
		do {
		Scanner so=new Scanner(System.in);
				
				float z=0;
				System.out.println("Enter First Value");
				float x=so.nextFloat();
				System.out.println("Enter second Value");
				float y=so.nextFloat();
		System.out.println("Press + for Sum \nPress - for Sub \nPress / for Divide \nPress % for Modulus \nPress * for Multiply ");

		char ch=so.next().charAt(0);
			if(ch=='/') {
				System.out.println("Divide :"+(x/y));
			}else if(ch=='+'){
				System.out.println("sum :"+(x+y));
			}else if(ch=='-') {
				System.out.println("sub :"+(x-y));
			}else if(ch=='*') {
				System.out.println("Multiply :"+(x*y));
			}else if(ch=='%') {
				System.out.println("Modulus :"+((int)x%(int)y));
			}
			
			
			System.out.println("Press Y/N for again");
			permission=so.next().charAt(0);
		}while(permission=='y'&&permission=='Y');
		System.out.println("Thanks for using Moon\'s Calculator");
		
	}

}
