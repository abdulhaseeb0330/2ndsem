package FlightSystem;

import java.util.Scanner;

public class staff {
	//passengers details
	private String sName;//
	private int sid;//
	private String scnic;
	private int spassword;//
	private char sStatus;//
	private String sarrivalcity;//
	private String sdeparturecity;//
	private String snotes;//
	private String snotification;//
	
	private int[] sarrivaltime;//
	private int[] sdeparturetime;//

	Scanner so=new Scanner(System.in);
	
public void sinput() {
	System.out.println("Passenger Cnic");
	this.scnic=so.next();
	System.out.println("Passenger Name");
	this.sName=so.next();
	System.out.println("Arival City");
	this.sarrivalcity=so.next();
	System.out.println("Destination City");
	this.sdeparturecity=so.next();
	System.out.println("Notes");
	this.snotes=so.next();
		
}
public void sdisplay() {
	
}

}
