package lab8;
import java.util.Scanner;
public class taskclass {

	private double coffee;
	private  double water;
	private  double milk;
	
	
	Scanner so=new Scanner(System.in);
	
	public  void Display() {
		System.out.println("coffee"+this.coffee);
		
		System.out.println("water"+this.water);
	
		System.out.println("milk"+this.milk);
	}
	
	
	public void refillcoffee(double coffeeamount){
		this.coffee=this.coffee+coffeeamount;
	}
	public void refillwater(double wateramount){
		this.water=this.water+wateramount;
	}
	public void refillmilk(double milkamount){
		this.milk=this.milk+milkamount;
	}
	public void brewcoffee(double coffeeamount,double wateramount,double milkamount){
		
		if(coffeeamount<=this.coffee&&wateramount<=this.water&&milkamount<=this.milk) {
		this.coffee=coffee-coffeeamount;
		this.milk=this.milk-milkamount;
		this.water=this.water-wateramount;
		}else {
			System.out.println("NOt Available Items");
		}
	}
	 
}

