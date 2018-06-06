//derived class with accessors and mutators
public class Contact extends Address{
protected int phoneNumber;
protected String firstName;
protected String lastName;



void setfirstName(String firstName){
	
this.firstName = firstName;
	
}
String getfirstName(){

	return firstName;
	
}
void setlastName(String lastName){
this.lastName=lastName;
}

String getlastName(){
	return lastName;
}

void setphoneNumber(int phoneNumber){
	this.phoneNumber=phoneNumber;
}
int getphoneNumber(){
	return phoneNumber;
}



}// End Contact Class
