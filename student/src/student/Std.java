package student;

import javax.swing.JOptionPane;

public class Std {
 private int age;
 private String name;
 public void call() {
	String s2= JOptionPane.showInputDialog("enter nmae",null);
     this.name=s2;
	String s1= JOptionPane.showInputDialog("enter age",null);
    int age2=Integer.parseInt(s1);
    this.age=age2;
 }
 
}
