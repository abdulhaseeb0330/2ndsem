package home;
import java.util.*;
public class h1 {
private String name;
private int id;
private Double price;
private String[] disease;


public void setname(String name) {
	this.name=name;
}
public void setid(int id) {
	this.id=id;
}
public void setprice(Double price) {
	this.price=price;
}
public void setdisease(String[] dis) {
	this.disease=dis;
}

public String getname() {
	return this.name;
}
public int getid() {
	return this.id;
}
public Double getprice() {
	return this.price;
}
public String[]  getdisease() {
	return disease;
}

public void input() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter anme");
	this.setname(s.next());
	System.out.println("Enter id");
	this.setid(s.nextInt());
	System.out.println("Enter Price");
	this.setprice(s.nextDouble());
	System.out.println("Enter no of Disease");
	int x=s.nextInt();
	String[] d=new String[x];
	for(int i=0;i<x;i++) {
		d[i]=s.next();
	}
	
}
public h1 searchname(String name) {
	if(this.name.equals(name)) {
		System.out.println("patient available");
		return this;
	}
	return null;
}
public h1 searchid(int id) {
	if(this.id==id) {
		System.out.println("patient available");
		return this;
	}
	return null;
}
public void display() {
	System.out.println(" anme"+name);
	
	System.out.println(" id"+id);

	System.out.println("Price"+price);
for(int i=0;i<disease.length;i++) {
	System.out.println("Disease"+this.disease);
	}
}

}
