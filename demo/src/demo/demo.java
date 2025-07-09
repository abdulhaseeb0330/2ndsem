package demo;
import java.util.Scanner;

class name{
	int age;
	int name;
	
	name(int a,int n){
		this.name=n;
		this.age=a;
	}
}


class demo{
	public static void main(String[] args) {
		Scanner so=new Scanner(System.in);
		name na=new name(10,20);
		
		System.out.println(na.name);
		System.out.println(na.age);
		
 }
}