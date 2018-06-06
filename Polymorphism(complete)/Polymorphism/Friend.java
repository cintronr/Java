//derived class with accessors and mutators

public class Friend extends Contact{
protected int DOB;
protected String emailAddress;




void setemailAddress(String emailAddress){
	
this.emailAddress = emailAddress;
	
}
String getemailAddress(){

	return emailAddress;
	
}




void setDOB(int DOB){
	this.DOB=DOB;
}
int getDOB(){
	return DOB;
}

}// End Friend Class

