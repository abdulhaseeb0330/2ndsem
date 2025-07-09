package eid;
class Eidi{
	String eidGreet="Eid Mubarak to you and your family\n\tAllah bless you";
	String from="\n\t\t\tAbdul-Haseeb";
	public void display() {
		System.out.println(eidGreet+""+from);
	}
}
public class MainEidi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eidi eid=new Eidi();
		eid.display();
	}
}