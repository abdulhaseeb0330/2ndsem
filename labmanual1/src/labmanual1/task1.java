package labmanual1;
import java.util.Scanner;

class student{
int id;
String name;
int age;
char gender;
int semester;
String  section;
String discipline;



}

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student();
student s2=new student();
s1.id=1;
s1.name="Ali";
s1.age=1;
s1.gender='M';
s1.semester=2;
s1.section="B";
s1.discipline="BSAI";

s2.id=1;
s2.name="Ali";
s2.age=1;
s2.gender='M';
s2.semester=2;
s2.section="B";
s2.discipline="BSAI";

System.out.println("s1 details");
System.out.println(s1.id);
System.out.println(s1.name);
System.out.println(s1.age);
System.out.println(s1.gender);
System.out.println(s1.semester);
System.out.println(s1.section);
System.out.println(s1.discipline);
System.out.println("s2 details");
System.out.println(s2.id);
System.out.println(s2.name);
System.out.println(s2.age);
System.out.println(s2.gender);
System.out.println(s2.semester);
System.out.println(s2.section);
System.out.println(s2.discipline);

	}

}
