package chatting;
import java.util.Scanner;
import java.util.Arrays;

class u{
	String uname;
	String[] uchat;
}

public class chat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		u u1=new u();
		u u2=new u();
		u1.uname="Ali";
		u2.uname="Own";
		int n=0;
		Scanner so=new Scanner(System.in);
		
		
System.out.println("\t\t\tWelcome to my Chat\n\n");
System.out.println(u1.uname+"\t\t\t\t\t"+ u2.uname);


while(true) {
	System.out.println("Press 1 if youare "+u1.uname+"\n");
	System.out.println("Press 2 if youare"+u2.uname+"\n");
	int c;
	c=so.nextInt();
	
	for(int i=0;i<=n;i++) {
		if(c==1) {
			System.out.println(u2.uchat[i]+"\n");
			u1.uchat[i]= so.nextLine();
			so.nextLine();
			//for(int t=0;t<;t++) {
				System.out.println(u1.uchat[i]+"\n");
			//}
			
		}else if(c==2) {
			System.out.println(u1.uchat[i]+"\n");
			u2.uchat[i]= so.nextLine();
			so.nextLine();
			//for(int t=0;t<;t++) {
			System.out.println(u2.uchat[i]+"\n");
		}
		n++;
	}
}

	}

}
