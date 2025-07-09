package lab10;

public class BankAccount {
 private int accno;
 private String acctitle;
 private double accbal;
 private String accusr;
 private String accpass;

//constructor
 BankAccount(String actitle,double accbal,String accusr,String accpass) {
	 this.setacctitle(actitle);
	 this.accbal=0;
	 this.setaccusr(accusr);
	 this.setaccpass(accpass);
 }
 //getters
 public int getaccno(){
	 return this.accno;
 }
 public String getacctitle(){
	 return this.acctitle;
 }
 public String getaccusr(){
	 return this.accusr;
 }
 public String getaccpass(){
	 return this.accpass;
 }
 public double getaccbal(){
	 return this.accbal;
 }
 

 public void setacctitle(String title){
	 this.acctitle=title;
 }
 public void setaccpass(String pass){
	this.accpass=pass;
}
 public void setaccusr(String bal){
	this.accusr=bal;
}

// deposit 
 public void setaccdeposit(double depoamt){
	if(depoamt>0) {
		this.accbal+=depoamt;
		System.out.println("amount Sucessfully deposit");
	}else {
		System.out.println("amount not vaid for deposit");
	}
}
//withdraw
void setaccwithdraw(double drawamt){
	if(drawamt>0&&drawamt<=this.accbal) {
		this.accbal-=drawamt;
		System.out.println("amount withdraw Sucessfully");
	}else {
		System.out.println("amount not vaid for withdraw");
	}
}
//transfer

//username match
public BankAccount validate(String usrname, BankAccount[] arr, int count, String password) {
    for (int i = 0; i < count; i++) {
        if (arr[i].accusr.equals(usrname) && arr[i].accpass.equals(password)) {
        	System.out.println("valid plz continue");
            return arr[i];
        }
    }
    System.out.println("invalid plz Again");
    return null;
}

public BankAccount sechaccno(BankAccount[] arr, int count, int accnum) {
    for (int i = 0; i < count; i++) {
        if (arr[i].getaccno() == accnum) {
            return arr[i]; 
        }
    }
    return null;
}
public BankAccount transfer(BankAccount[] arr,int count,int accnum) {
	for(int i=0;i<count;i++) {
		if(this.arr[i].getaccno()==accnum) {}
	}
	if() {}
	
	
//	this.accno=count;
	return null;//temp
}
}