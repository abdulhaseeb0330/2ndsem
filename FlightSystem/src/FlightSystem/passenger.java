package FlightSystem;
import java.util.Scanner;
public class passenger{
	//passengers details
	private String pName;//
	private int pid;//
	private String pcnic;
	private int ppassword;//
	private char pStatus;//
	private String parrivalcity;//
	private String pdeparturecity;//
	private String pnotes;//
	private String pnotification;//
	
	private int[] parrivaltime;//
	private int[] Pdeparturetime;//

	Scanner so=new Scanner(System.in);
	
public void pinput() {
	System.out.println("Passenger Cnic");
	this.pcnic=so.next();
	System.out.println("Passenger Name");
	this.pName=so.next();
	System.out.println("Arival City");
	this.parrivalcity=so.next();
	System.out.println("Destination City");
	this.pdeparturecity=so.next();
	System.out.println("Notes");
	this.pnotes=so.next();
		
}
public void pdisplay() {
	
}
	
	
	
}

