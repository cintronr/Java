
public class CalcSetGet {
	//Private Variables
	private int taxableIncome;//
	private int taxTotal;


public CalcSetGet(){
	int taxableIncome=0;
	int taxTotal=0;
	
	
}
public void setTaxableIncome(int taxableIncome)
{
	this.taxableIncome=taxableIncome;
}
public int getTaxableIncome(){
	return taxableIncome;
}

public void setTaxTotal(int taxTotal){
	this.taxTotal=taxTotal;
}
public int getTaxTotal(){
	return taxTotal;
}

}//end class