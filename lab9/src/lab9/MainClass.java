package lab9;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner so=new Scanner(System.in);
		int check,count=0,o=0;
		
		System.out.println("enter product in numbers wantr to enter ");
		int enter=so.nextInt();
		
		Task[] t1=new Task[enter];
		
		do {
			System.out.println("1 for input else display ");
			o=so.nextInt();
			if(o==1) {
			System.out.println("enter product name price quan ");
			for(int i=0;i<=enter;i++) {
				t1[i]=new Task();
				t1[i].input();
			}
			}else {
				o=0;
				System.out.println("product name price quan ");
				for(int i=0;i<=count;i++) {
					t1[i].display();
					t1[i].tp();
				}
			}
			
			System.out.println("press 1 for new product other number for exit ");
			check=so.nextInt();
		}while(check==1);
	}

}
