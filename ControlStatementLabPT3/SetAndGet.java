
public class SetAndGet {
//private variables
	
	private int account;//integer for account number
	private int oldBalance; // integer for initial balance
	private int charges; //integer for charges made to account
	private int credits;//integer for credit
	private int creditLimit;//integer for maximum credit limit
	private int newBalance;//integer for new balance
public SetAndGet()
{
	
int account =0;//integer for account number
int oldBalance=0; // integer for initial balance
int charges=0; //integer for charges made to account
int credits=0;//integer for credit
int creditLimit=0;//integer for maximum credit limit
int newBalance=0;//integer for new balance
}//end method
public void setAccount(int account){//modifier 
	this.account = account;
}
public int getAccount()//accessor
{
	return account;
}
public void setOldBalance(int oldBalance){
	this.oldBalance = oldBalance;
}
public int getOldBalance(){
	return oldBalance;
}
public void setCharges(int charges){
	this.charges = charges;
}
public int getCharges(){
	return charges;
}
public void setCredits(int credits){
	this.credits = credits;
}
public int getCredits(){
	return credits;
}
public void setCreditLimit(int creditLimit){
	this.creditLimit = creditLimit;
}
public int getCreditLimit(){
	return creditLimit;
}
public void setNewBalance(int newBalance){
	this.newBalance = newBalance;
}
public int getNewBalance(){
	return newBalance;
}
}//end SetAndGet Class
