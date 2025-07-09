package lab10;
import java.util.Scanner;
public class MainClassBankAccount {

	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		
int how = 10;
BankAccount arr[]=new BankAccount[how];
 
int enter=0;

for(int i=0;i<enter;i++) {
	arr[i]=new BankAccount();
	BankAccount b=new BankAccount();
int check;
do{

menu();//menu function
check=so.nextInt();
switch(check) {
case 1://create account portal
	System.out.println("Account Creating Portal");
	System.out.println("Enter Account Number");
	arr[i].setaccno(so.nextInt());
	System.out.println("Enter Account Title");
	arr[i].setacctitle(so.next());
	System.out.println("Enter Account UserName");
	arr[i].setaccusr(so.next());
	System.out.println("Enter Account Password");
	arr[i].setaccpass(so.next());
	break;
case 2:
	System.out.println("update account portal");
	System.out.println("Enter account Number");
	int u=so.nextInt();
	
	int p=-1;
	for(int f=0;f<enter;f++){
//	p=arr[f].sechaccno(arr,enter,u);}
	if(p==-1) {
		System.out.println("not found");
	}else {
		System.out.println("Found");
		System.out.println("Enter username");
		System.out.println("Enter Password");
		b=arr[i].validate(so.next(), arr, enter, so.next());
		if(b==null) {
			System.out.println("wrong username & password");
			}else {
				System.out.println("Press 1 to update account title");
				System.out.println("Press 2 to update account username");
				System.out.println("Press 3 to update account Password");
				int x=so.nextInt();
				switch(x) {
				case 1:
					arr[i].setacctitle(so.nextLine());
					break;
				case 2:
					arr[i].setaccusr(so.nextLine());
					break;
				case 3:
					arr[i].setaccpass(so.nextLine());
					break;
					default:
						System.out.println("invalid option");
				}
			}
	}
	}
	break;
case 3:
	int x=0;
	System.out.println("depositer portal");
	System.out.println("Enter Account number");
	int s=so.nextInt();
	for(int a=0;a<enter;a++) {
		 x=arr[a].sechaccno(arr, s, a);
	}
	if(x>=0) {
		System.out.println("Enter Amount");
		arr[x].setaccdeposit(so.nextDouble());
		}
	else {
		System.out.println("Not found Accno Number");
		}
	break;
case 4:
	System.out.println("Withdrawal portal");
	System.out.println("Enter Amount");
	arr[i].setaccwithdraw(so.nextDouble());
	break;
case 5:
	System.out.println("Transfer portal");
	//arr[i].transfer(arr,enter,so.nextInt());
	break;
case 6:
	System.out.println("Quick Search");
	System.out.println("Enter account Number");
//	int d=so.nextInt();
	int c=-1;
	for(int f=0;f<enter;f++){
	c=arr[f].sechaccno(arr,enter,so.nextInt());
	}
	if(c==-1) {
		System.out.println("not found");
	}else {
		System.out.println("Found");
	}
	
	break;
case 7://create account portal
	System.out.println("Account Details");
	System.out.println("Enter Account Number");
	arr[i].getaccno();
	System.out.println("Enter Account Title");
	arr[i].getacctitle();
	System.out.println("Enter Account UserName");
	arr[i].getaccusr();
	System.out.println("Enter Account Password");
	arr[i].getaccpass();
	break;
case 0:
	System.out.println("exit Sucessfully");
	System.exit(0);
	break;
	default:
		System.out.println("Wrong input");
}
enter++;
}while(check!=0);

}
//end main
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
