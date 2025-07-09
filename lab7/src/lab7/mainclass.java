package lab7;
import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars[] arr=new cars[10];
		cars m=new cars();
		int t=0;
		int enter=0;
		Scanner so=new Scanner(System.in);
		do {
System.out.println("Enter 1 for Add Car");
System.out.println("Enter 2 for Display details of car having maxium price ");
System.out.println("Enter 3  for apply 15% of cars having capacity below 1000");enter=so.nextInt();

if(enter==1) {
	for(int c=0;c<10;c++)
	{
	arr[c]=new cars();
		arr[c].input();
	
	}
	
}else if(enter==2) {
//	 m.setPrice(arr[0].getprice());
	int max=arr[0].getPrice();
	for(int f=0;f<10;f++) {
		if(max<arr[f].getPrice()) {
			max=arr[f].getPrice();
			t=f;
		}
	}
	
	arr[t].display();
//	for(int f=0;f<counter;f++) {
//		if(arr[f].getPrice()==arr[t].getPrice()) {
//			arr[f].display();
//		}
//	}
	
}else if(enter==3) {
	for(int f=0;f<10;f++) {
		if(arr[f].geteng()<1000) {
		int oldprice=arr[f].getPrice();
		int disc=oldprice*15/100;
		int nprice=oldprice-disc;
		arr[f].setPrice(nprice);
	}
		}
}
		}while(enter==0);
	}

}
