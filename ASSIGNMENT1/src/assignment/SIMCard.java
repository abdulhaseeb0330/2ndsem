package assignment;
import java.util.Scanner;
public class SIMCard {
	private String phoneNumber;
	private String ownerNIC;
	private Boolean isActive;
	private String type ;  //"Call" or "Data")
	private Double balance;
	private Double mobileDataMB;
	
	SIMCard (String phoneNumber,String ownerNIC,String type,Double balance,Double mobileDataMB
			,Boolean isActive){
		this.phoneNumber=phoneNumber;
		this.ownerNIC=ownerNIC;
		this.isActive=isActive;
		this.type=type;
		this.balance=balance;
		this.mobileDataMB=mobileDataMB;
	}
	
	SIMCard (String phoneNumber,String ownerNIC,String type){
		this.balance=0.0;
		this.mobileDataMB=0.0;
		this.phoneNumber=phoneNumber;
		this.ownerNIC=ownerNIC;
		this.isActive=false;
		this.type=type;
	}
	
	//copy constructor
	SIMCard(SIMCard s){
		 s.phoneNumber=phoneNumber;
		s.ownerNIC=ownerNIC;
		s.isActive=isActive;
		s.balance=balance;
		s.mobileDataMB=mobileDataMB;
	}
	
	//setter
	public void setphoneNumber(String phoneNumber) {}
	public void setownerNIC(String ownerNIC) {}
	public void setisActive(Boolean isActive) {}
	public void settype(String type) {}
	public void setbalance(Double balance) {}
	public void setmobileDataMB(Double mobileDataMB) {}
	
	//getter
	public String getphoneNumber() {return null;}
	public String getownerNIC() {return null;}
	public Boolean getisActive() {return true;}
	public String gettype() {return null;}
	public Double getbalance() {return 0.0;}
	public Double getmobileDataMB() {return 0.0;}
	
	// Activates the SIM
	public void activateSIM() {}
	// Deactivates the SIM
	public void deactivateSIM(){}
	// Adds recharge to the balance
	public void  addBalance(int amount) {}
	// Returns current balance
	public Double  checkBalance(){
		return 0.0;
		}
	// Changes ownership
	public void  transferOwnership(String newNIC){}
	// Returns activation status
	public Boolean  isActivated(){
		return true;
	} 
	// Deducts mobile data usage
	public void  useMobileData(Double amountMB){}
	// Adds mobile data
	public void  rechargeMobileData(Double amountMB){}
}
