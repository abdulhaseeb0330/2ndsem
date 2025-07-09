package practice;

import java.util.*;

public class mainpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		String a[]=new String[10];
		
		for(int i=0;i<10;i++) {
			a[i]=input();
		}
		
		for(int i=0;i<10;i++) {
//			display(a[i]);
			System.out.println("name on indez "+i+"="+ a[i]);
		}
		
	}
	
	public static String input() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
	return s.next();
	
	}
	public static void display(String n) {
		System.out.println("namem of index"+n);
	}
	}

