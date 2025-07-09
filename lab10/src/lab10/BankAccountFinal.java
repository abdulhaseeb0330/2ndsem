package lab10;
import java.util.Scanner;
public class BankAccountFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
		System.out.println("Enter Account want to create");
		int how=so.nextInt();
		BankAccount arr[]=new BankAccount[how];
		
		int enter=0,choice=0;
		//calling main menu
	menu();
	choice=so.nextInt();
	//creat new account
	if(choice==1) {
		do {
		for(int i=enter;i<enter+1;i++) {
			arr[i]=new BankAccount();
			BankAccount b=new BankAccount();
			enter ++;
			//create account portal
			System.out.println("Account Creating Portal");
			System.out.println("Enter Account Number");
			arr[i].setaccno(so.nextInt());
			System.out.println("Enter Account Title");
			arr[i].setacctitle(so.next());
			System.out.println("Enter Account UserName");
			arr[i].setaccusr(so.next());
			System.out.println("Enter Account Password");
			arr[i].setaccpass(so.next());
		}
		}while(enter<how);
	}else if(choice==2) {
		//update account details
		System.out.println("update account portal");
		System.out.println("Enter account Number");
		int u=so.nextInt();
		
		BankAccount p=null;
		for(int f=0;f<enter;f++){
			 p=arr[f].sechaccno(arr,enter,u);}
		if(p==null) {
			System.out.println("not found");
		}else{
			System.out.println("Found");
			String ur,ps;
			System.out.println("Enter username");
			ur=so.next();
			System.out.println("Enter Password");
			ps=so.next();
			BankAccount b;
			for(int i=0;i<enter;i++) {
			b=arr[i].validate(ur, arr, enter, ps);}
			if(b==null) {
				System.out.println("wrong username & password");
				}else {
					System.out.println("Press 1 to update account title");
					System.out.println("Press 2 to update account username");
					System.out.println("Press 3 to update account Password");
					int x=so.nextInt();
					if(x==1) {
					System.out.println("Enter Account Title");
					b.setacctitle(so.next());
				}else if(x==2) {
					System.out.println("Enter Account UserName");
					b.setaccusr(so.next());
				}else if(x==3) {
					System.out.println("Enter Account Password");
					b.setaccpass(so.next());
				}else {
					System.out.println("Invalid Entery");
				}
				}
			}}}else if(choice==3) {
				
			}else if(choice==4) {
				
			}else {
				
			}
		
		
		}
	static void menu() {				
		System.out.println("Welcome to Bank Acccount System");
		System.out.println("Press 1 for create account");
		System.out.println("Press 2 for update account");
		System.out.println("Press 3 for deposit ");
		System.out.println("Press 4 for withdraw ");
		System.out.println("Press 5 for Transfer ");
		System.out.println("Press 6 for Quick Search");
		System.out.println("Press 7 for Display Details");
		System.out.println("Press 0 for exit");
	}
}
