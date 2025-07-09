package labmanual2b;
import java.util.Scanner;

class Book{
	int id;
	String Title;
	String author;
	int pages;
	
	void setValues(int i, String til, String au, int p){
		Scanner so=new Scanner(System.in);
		System.out.println("Book Details");
	    id=i=so.nextInt();
		so.nextLine();
		Title=til=so.nextLine();
		author=au=so.nextLine();
		pages=p=so.nextInt();
	}
	void DisplayDetails(){
		System.out.println("Book Details");
		System.out.println(id);
		System.out.println(Title);
		System.out.println(author);
		System.out.println(pages);
	}
	
	}


public class task2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b1=new Book();
Book b2=new Book();

b1.setValues(b1.id, b1.Title,b1.author, b1.pages);
b2.setValues(b2.id, b2.Title,b2.author, b2.pages);
b1.DisplayDetails();
b2.DisplayDetails();


	}

}
