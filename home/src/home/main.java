package home;
import java.util.*;
public class main {
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 h1[] arr=new h1[100];
	 int c=0;
	 System.out.println("press 1 to add patient\n press 2 to search by name patient\n press3 to dispaly patient\n press 5 to search patient by id");
	 int x=s.nextInt();
	 switch(x) {
	 case 1:
		 arr[c] =new h1();
		 arr[c].input();
		 c++;
		 break;
	 case 2:
		 System.out.println("Enter name");
		 for(int i=0;i<c;i++) {
			 arr[i].searchname(s.next());
		 }
		 break;
	 case 3:
		 System.out.println("Enter id");
		 for(int i=0;i<c;i++) {
			 arr[i].searchid(s.nextInt());
		 }
		 break;
	 case 4:
		 for(int i=0;i<c;i++) {
			 arr[i].display();
		 }
		 break;
		 default:
			 System.exit(0);
	 }
	 
	 
 }
}
