package lab13;



public class patient {
String name;
int age;
String disease;
String[] Symptoms;
//patient(int size){
//	Symptoms=new String[size];
//	
//}
patient(String name,int age,String disease,String[] Symptom){
	Symptoms=new String[Symptom.length];
	this.name=name;
	this.age=age;
	this.disease=disease;
	
	this.Symptoms=Symptom;//shallloow copy
	
	//deep copy
	for(int i=0;i<Symptoms.length;i++) {
		this.Symptoms[i]=Symptom[i];
		}
	}


public void setname(String name) {
	this.name=name;
}
public void setage(int age) {
	this.age=age;
}
public void setdisease(String disease) {
	this.disease=disease;
}
public void setsymptoms(String Symptoms,int i) {
	this.Symptoms[i]=Symptoms;//
}
public void setSymptoms(String[] Symptoms) {
	for(int i=0;i<Symptoms.length;i++) {
		this.Symptoms[i]=Symptoms[i];
	}
}
//


public String getname() {
	return name;
}
public int getage() {
	return age;
}
public String getdisease() {
	return disease;
}
public String getsymptoms(int i) {
	return Symptoms[i];
}
 //dispaly
public void dispaly() {
	System.out.println("patient name"+name);
	System.out.println("patient age"+age);
	System.out.println("patient disease"+disease);
	System.out.println("patient Symptoms"+Symptoms);

}

public static patient search(patient[] arr, String name) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].getname().equalsIgnoreCase(name)) {
            return arr[i]; 
        }
    }
    return null;
}

public patient hassymptoms(String Symptom,patient arr[]) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i].Symptoms[i].equalsIgnoreCase(Symptom)) {}
	}
	return null;
}
//static void inputi() {
//	patientmaibn.menu();
//}
}
