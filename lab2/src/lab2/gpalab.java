package lab2;
import java.util.Scanner;
public class gpalab {

	public static void main(String[] args) {
		
		Scanner count=new Scanner(System.in);
		System.out.println("Input count student");
		int c=count.nextInt();
		double[] f=new double[c];
		do {
		// TODO Auto-generated method stub
		System.out.println("1. Input gpa of student");
		
		System.out.println("2. display gpa of all student");
		System.out.println("3. Find and display max gpa");
		System.out.println("4. find and display min gpa");
		System.out.println("5. compute and display avg gpa");
		Scanner check=new Scanner(System.in);
		int enter=check.nextInt();
		
		
		
		
		
		Scanner so=new Scanner(System.in);
		
		Scanner gpa=new Scanner(System.in);
		
		
		
		
		
		if(enter==1) {
			
			
			for(int i=0;i<c;i++) {
				System.out.println("Input gpa of student");
				f[i]=gpa.nextDouble();
			
			}
			
			
		}else if(enter==2) {
			
			for(int i=0;i<c;i++) {
				System.out.println(f[i]);
				
			}
			
		}else if(enter==3) {
			Scanner o=new Scanner(System.in);
			double or=f[0];
			double sum=or;
			for(int i=1;i<c;i++) {
				System.out.println(f[i]);
				if(sum<f[i]) {
					sum=f[i];
				}
				System.out.println("max =");
				System.out.println(sum);
			}
			
			
		}else if(enter==4) {
			Scanner o=new Scanner(System.in);
			double or=f[0];
			double sum=or;
			for(int i=1;i<c;i++) {
				System.out.println(f[i]);
				if(sum>f[i]) {
					sum=f[i];
				}
				System.out.println("max =");
				System.out.println(sum);
			}
			
			
		}else if(enter==5) {
			Scanner o=new Scanner(System.in);
//			double or=f[0];
			double sum=0.0;
			for(int i=1;i<c;i++) {
				System.out.println(f[i]);
				sum=sum+f[i];

				System.out.println("min =");
				System.out.println(sum/c);
			}
		}}while(true);
		
		}
		
		
		
		
	}


