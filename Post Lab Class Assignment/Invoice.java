
public class Invoice {
	//private variables
	private String partNumber;
	private String description;
	private int quantity;
	private double price;
	private double Invoice;
	private double InvoiceAmount;
	//public method setting variables
	public Invoice()
	{
		String partNumber="";
		String description="";
		int quantity=0;
		double price=0.0;
		double InvoiceAmount=0;
	}//method end
	public void setPartNumber(String partNumber)//Modifier 
	{
		this.partNumber = partNumber; 
	}
	public String getPartNumber()//Accessor for part number
	{
		return partNumber;
	}
	public void setDescription(String description)//Modifier 
	{
		this.description = description;
	}
	public String getDescription()//Accessor for part number
	{
		return description;
	}
	public void setQuantity(int quantity)//Modifier 
	{
		if (quantity < 0)
		{
			quantity = 1000;
		}
		this.quantity=quantity;
	}
	public int getQuantity()//Accessor for part number
	{
		return quantity;
	}
	public void setPrice(double price)//Modifier 
	{
		if (price < 0.0)
		{
			price = 100.1;
		}
		this.price=price;
	}
	public double getPrice()//Accessor for part number
	{
		return price;
	}
	public void setInvoiceAmount(double price, int quantity)//Modifier 
	{
		InvoiceAmount = price*quantity;
	}
	public double getInvoiceAmount()//Accessor for part number
	{
		
		
		
		return InvoiceAmount;
	}
	
	
	
	

}//class end
