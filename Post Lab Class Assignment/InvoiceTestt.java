	/*
	 Rico Cintron
	 Post Lab Assignment
	 5/25/2017
	 University of Advancing Technology
	 */

public class InvoiceTestt {
	
	


		public static void main (String[] args)//main
		{
			System.out.println("*********************************");
			System.out.println("Welcome to my post lab assignment");
			System.out.println("*********************************");
			
			////////////////////////////Hammer Invoice///////////////////////////
			Invoice myInvoice = new Invoice();//New hammer creation
			//Mutator manipulation, enabling specific data to be "set".
			myInvoice.setDescription("Hammer");
			myInvoice.setPartNumber("1PNP86743");
			myInvoice.setPrice(100.23);
			myInvoice.setQuantity(24);
			myInvoice.setInvoiceAmount(100.23, 24);
			//Print statements coupled with commands getting information via accessors
			System.out.println("Original invoice information");
			System.out.println("Part number:"+myInvoice.getPartNumber());
			System.out.println("Description:"+myInvoice.getDescription());
			System.out.println("Quantity:"+myInvoice.getQuantity());
			System.out.println("Price:"+myInvoice.getPrice());
			System.out.println("Invoice amount:"+myInvoice.getInvoiceAmount());
			////////////////////////////Updated Hammer Invoice///////////////////////////
			System.out.println();
			Invoice myInvoice2 = new Invoice();//New hammer creation
			//Mutator manipulation, enabling specific data to be "set".
			myInvoice.setDescription("Yellow Hammer");
			myInvoice.setPartNumber("1000000PNP86743");
			myInvoice.setPrice(22.23);
			myInvoice.setQuantity(4);
			myInvoice.setInvoiceAmount(22.23, 4);
			//Print statements coupled with commands getting information via accessors
			System.out.println("Updated invoice information");
			System.out.println("Part number:"+myInvoice.getPartNumber());
			System.out.println("Description:"+myInvoice.getDescription());
			System.out.println("Quantity:"+myInvoice.getQuantity());
			System.out.println("Price:"+myInvoice.getPrice());
			System.out.println("Invoice amount:"+myInvoice.getInvoiceAmount());
			////////////////////////////Original paint brush Invoice///////////////////////////
			System.out.println();
			Invoice myInvoice3 = new Invoice();//New paint brush creation
			//Mutator manipulation, enabling specific data to be "set".
			myInvoice.setDescription("Paint Brush");
			myInvoice.setPartNumber("43E2D3");
			myInvoice.setPrice(0);
			myInvoice.setQuantity(0);
			myInvoice.setInvoiceAmount(0,0);
			//Print statements coupled with commands getting information via accessors
			System.out.println("Original invoice information");
			System.out.println("Part number:"+myInvoice.getPartNumber());
			System.out.println("Description:"+myInvoice.getDescription());
			System.out.println("Quantity:"+myInvoice.getQuantity());
			System.out.println("Price:"+myInvoice.getPrice());
			System.out.println("Invoice amount:"+myInvoice.getInvoiceAmount());
			////////////////////////////Updated paint brush Invoice///////////////////////////
			System.out.println();
			Invoice myInvoice4 = new Invoice();//New paint brush creation
			//Mutator manipulation, enabling specific data to be "set".
			myInvoice.setDescription("Paint Brush");
			myInvoice.setPartNumber("43E2D3");
			myInvoice.setPrice(3.43);
			myInvoice.setQuantity(82000);
			myInvoice.setInvoiceAmount(3.43,82000);
			//Print statements coupled with commands getting information via accessors
			System.out.println("Updated invoice information");
			System.out.println("Part number:"+myInvoice.getPartNumber());
			System.out.println("Description:"+myInvoice.getDescription());
			System.out.println("Quantity:"+myInvoice.getQuantity());
			System.out.println("Price:"+myInvoice.getPrice());
			System.out.println("Invoice amount:"+myInvoice.getInvoiceAmount());
			
			
			
			
			
			
			
			
			
		}//End main
		

	}//End class
