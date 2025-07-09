package p1;



public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan f1=new fan();
		fan f2=new fan();
		fan f3=new fan();
		
		f1.input();
		f2.input();
		f3.input();
		fan mix=f1;
		
		if(mix.getPrice()>f2.getPrice()) {
			mix=f2;
		}else {
			mix=f3;
		}
		
		
		mix.display();
	
	}

}
