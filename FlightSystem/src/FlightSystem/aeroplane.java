package FlightSystem;
import java.util.Scanner;
public class aeroplane {
	private String Aname;//boeing 
	private int Anumber;//380
//	private char Agroup;//A group
	private int Ainspect;//0 for Done/1 for No
	private String Anotification;
	private int Aid;// unique number
	private String Aarrivalcity;// city form 
	private String Adeparturecity;// city to
	
	private int[] Aseats;//500
	private int[] Aarrivaltime;
	private int[] Adeparturetime;
	
	
	
	Scanner so=new Scanner(System.in);
	
	public void ainput() {
		 
		 System.out.println("Plane Name");
		this.Aname=so.next();
		System.out.println("Plane number");
		this.Anumber=so.nextInt();
		System.out.println("Press 1 for plane Inspected/n Press 0 for not Inspected");
		this.Ainspect=so.nextInt();
		System.out.println("Notification About Plane");
		this.Anotification=so.nextLine();
		 System.out.println("Plane Arrival City");
		this.Aarrivalcity=so.next();
		 System.out.println("Plane Departure city");
		this.Adeparturecity=so.next();
		
		//
	}
	 
	public  void adisplay() {
		 
	 }
}


