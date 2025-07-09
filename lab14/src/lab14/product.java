package lab14;
import java.util.Scanner;
public class product {
String name;
int id;	
int quan;


public void input() {
	Scanner so=new Scanner(System.in);
		System.out.println("enter name of product");
		this.name=so.next();
		System.out.println("enter id of product");
		this.id=so.nextInt();
		System.out.println("enter quan of product");
		this.quan=so.nextInt();
}

public void search(int id) {
	Scanner so=new Scanner(System.in);
	for(int i=0;i<5;i++) {
		if(this.id==id) {
			System.out.println("eenter quantity");
			int r=so.nextInt();
			if(r<this.quan) {
				System.out.println("product purchase sucessfly");
				display(id);
			}else{
				System.out.println("stock  available only " +this.quan);
			}
		}
	}	
}
public void display(int idr) {
	for(int i=0;i<5;i++){
	
	if(this.id==idr){
	System.out.println("name"+this.name);
	}}
	System.out.println("name"+idr);
}

}
