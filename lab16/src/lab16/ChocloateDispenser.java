package lab16;
import java.util.Scanner;
//Scanner s=new Scanner(System.in);
public class ChocloateDispenser {

	Scanner s=new Scanner(System.in);
	

	private Chocloate cd[]=new Chocloate[3];
	
	public ChocloateDispenser() {
		ChocloateDispenser d=new ChocloateDispenser();
		for(int i=0;i<3;i++) {
			cd[i]=new Chocloate(0,i);
		}
	}
//	for(int i=0;i<3;i++) {
//		
//			cd[i]=new Chocloate();
//		
//	}
		
		
	
	
	
	//constr
	
	public ChocloateDispenser (int qty) {
		
	}
	
	
	public void addChocolate(Double Price,int qty) {
		
	}
	public void dispenseChocolate(Double amount) {}
	public void displayreamning(Double price) {}
public void displayReamningHavingPrice60() {}

}
