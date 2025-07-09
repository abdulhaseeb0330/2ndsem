package lab15;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);

    System.out.println("Enter no of product want to save");
    int x=s.nextInt();
    Product[] arr=new Product[x];
    
    int c=0,e;
    do {
    menu();
    
    e=s.nextInt();
    if(e==1) {
    	
    	
    }else if(e==2) {
    	
    }else if(e==3) {
    	System.out.println("name");
    	String n=s.next();
    	for(int i=0;i<c;i++) {
    		arr[i].search(arr, n, c);
    	}
    }else {
    	for(int i=0;i<c;i++) {
    		arr[i].tax(arr);
    	}
    	}
    }while(e==1||e==2||e==3||e==4);
    
    
    
	}
	
	public static void menu() {
		System.out.println("Press 1 for Add product");
		System.out.println("Press 2 for display product");
		System.out.println("Press 3 for Search product");
		System.out.println("Press 4 for  Tax product");
	}

}
