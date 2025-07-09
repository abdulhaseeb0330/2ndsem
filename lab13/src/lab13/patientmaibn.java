package lab13;
import java.util.Scanner;
public class patientmaibn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner so =new Scanner(System.in);
int count=0;
//System.out.println("enter no wan to create");
patient[] p=new patient[10];
int t=0;


	

    menu();
int choice =so.nextInt();
if(choice==1) {
	input(count,t,p);
}else if(choice==2){
	for(int i=0;i<count;i++) {
		p[i].dispaly();
	}
}else if(choice==3){
	patient[] d=null;
	System.out.println("Enter name for serch");
	String name=so.next();
	
	patient.search(p, name);
}else if(choice==4){
	
}else if(choice==5){
	
}else {
	System.exit(0);
	}
	}
	
	static void menu() {				
		System.out.println("Press 1 for Add patients");
		System.out.println("Press 2 for Display all patient");
		System.out.println("Press 3 for search ");
		System.out.println("Press 4 for updaet ");
		System.out.println("Press 5 for view specific patient symptoms ");
		System.out.println("Press 0 for exit");
	}
static void input(int count,int t,patient[] p) {
	
	Scanner so =new Scanner(System.in);
	do {
		System.out.println("Enter patient name");
		String name=so.next();
		System.out.println("Enter patient age");
		int age=so.nextInt();
		System.out.println("Enter patient Disease");
		String disease=so.next();
		System.out.println("Enter totla Symptoms");
		int sys=so.nextInt();
		
		String[] arr=new String[sys];
//		String symp;
		for(int i=0;i<sys;i++) {
			System.out.println("Enter Symptoms one by one");
			 arr[i]=so.next();
		}
			p[count]=new patient(name, age, disease,arr);
			count++;
			System.out.println("Enter 0 to add new patient");
			t=so.nextInt();
			
		}while(t==0);
	so.close();
//	patient.inputi();	
}
}
