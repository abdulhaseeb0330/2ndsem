package lab14;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		product[] p=new product[5];
		do {
		System.out.println("Press 1 fro ADD");
		System.out.println("Press 2 fro Search");
		System.out.println("Press 3 fro Display");
		int x=so.nextInt();
		
		if(x==1) {
			for(int i=0;i<5;i++) {
				p[i]=new product();
				p[i].input();
			}
		}else if(x==2) {
			System.out.println("enter id to search product");
			int r=so.nextInt();
			for(int i=0;i<5;i++) {
			p[i].search(r) ;
			}
		}else {
			System.out.println("Invalid entity");
		}
	}while(true);
		}
	}

