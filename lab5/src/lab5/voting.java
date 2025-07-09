package lab5;
import java.util.Scanner;


class Cand{
	
	String Name;
    int  count;
	
	
	void DisplayMenu(){
		System.out.println("Prerss 1 for Touseef");
		System.out.println("Prerss 2 for Own");
		System.out.println("Prerss 3 for Ubaid");
	}
	void Display(){
		System.out.println("voting "+count);
		
}
	}

public class voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
Cand c1=new Cand();
Cand c2=new Cand();
Cand c3=new Cand();
c1.Name="Touseef";
c2.Name="ahad";
c3.Name="own";
c1.count=0;
c2.count=0;
c3.count=0;

		int e;
		
		do {
			
			c1.DisplayMenu();
			e=so.nextInt();
			if(e==1) {
				c1.count++;
				so.nextInt();
			}else if(e==2) {
				c2.count++;
				so.nextInt();
			}else if(e==3) {
				c3.count++;
				so.nextInt();
			}else {
				System.out.println("Invalid");	
			}
		}while(e==0);
		
		
		 c1.Display();
			c2.Display();
			c3.Display();	
	}
		
		
}

