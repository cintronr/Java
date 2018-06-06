//main class (Address) and accessors and mutators
public class Address {
protected int zip;
protected String state;
protected String city;
protected String street;


void setState(String state){
	
this.state = state;
	
}
String getState(){

	return state;
	
}
void setCity(String city){
this.city=city;
}

String getCity(){
	return city;
	
}
void setStreet(String street){
	this.street=street;
}
String getStreet(){
return street;
}

void setZip(int zip){
	this.zip=zip;
}
int getZip(){
	return zip;
}

}// End Address Class


