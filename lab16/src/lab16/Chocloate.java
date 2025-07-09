package lab16;
import java.util.*;
//Scanner s=new Scanner(System.in);
public class Chocloate {

	private Double Price;
	private int qty;
	


	public Chocloate(int qty,int i) {
		if(i==1) {
		this.qty=qty;
		this.Price=500.0;}else if(i==2) {
			this.qty=qty;
			this.Price=60.0;
		}else {
			this.qty=qty;
			this.Price=10.0;
		}	
	}
//	public Double getprice() {
//		return this.Price;
//	}
	public void setqty() {
		
	this.qty=qty;
	
	}
//	public void setprice() {
//		
//	}
	
	
}
