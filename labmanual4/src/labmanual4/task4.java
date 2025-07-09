package labmanual4;
import java.util.Scanner;

class Mobile{
	int id;
	String brand;
	String model;
	int price;
	
	
	void displayMobiel(Mobile[] mobiles) {
		System.out.println("id"+this.id);
		System.out.println("brand"+this.brand);
		System.out.println("model"+this.model);
		System.out.println("price"+this.price);
	}
	Mobile findMostExpensive(Mobile[] mobiles) {
		Mobile max=new Mobile();
		
		max=mobiles[0];
		for(int i=0;i<mobiles.length;i++) {
			if(max.price<mobiles[i].price) {
				max=mobiles[i];
			}
		}
		return max;
	}
	void filterMobileByPrice(Mobile[] mobiles) {}
	
	
	
}
public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner so=new Scanner(System.in);

Mobile[] m=new Mobile[10];

for(int i=0;i<10;i++) {
	m[i]=new Mobile();//object make for array
	
	m[i].id=so.nextInt();
	m[i].model=so.nextLine();
	so.next();
	m[i].brand=so.nextLine();
	so.next();
	m[i].price=so.nextInt();
	
}
	//display
for(int i=0;i<10;i++) {
	m[i].displayMobiel(m);
	
}
Mobile d=new Mobile();
//most expensive
for(int i=0;i<10;i++) {
	
	System.out.println(m[i].findMostExpensive(m));
	
}
	}

}
