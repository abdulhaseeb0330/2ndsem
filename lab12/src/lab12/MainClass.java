package lab12;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		
		MyClass[] prod=new MyClass[2];
		MyClass t=null;
		int z=0;
		do {
			
				prod[z]=new MyClass(); 
				z++;
			
			
			System.out.println("press 1 Add prod");
			System.out.println("press 2 serch product");
			System.out.println("press 3 quantity");
			int x=so.nextInt();
			if(x==1) {
				for(int i=0;i<2;i++) {
				prod[i].set();
				}
			}else if(x==2) {
				System.out.println("enter name of prod for serch");
				String s=so.next();
				for(int i=0;i<2;i++) {
			prod[i].sechprod(prod, 2,  s);}
			if(t==null) {
				System.out.println("Not Available");
			}else {
				System.out.println("Available");
			}
			}else if (x==3) {
				System.out.println("enter name of prod for qty");
//				String d=so.next();
//				int f=prod[0].sechprch( prod,2,d );
//				if(f==0) {
//					System.out.println("Not Available");
//				}else {
//					System.out.println("Available");
//				}
				for(int i=0;i<2;i++) {
				prod[i].q() ;}
			}else {
				System.out.println("no command match");
			}
			
		}while(true);		
	}

}
