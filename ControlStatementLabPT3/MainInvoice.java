/*Rico Cintron
Control Statement Lab Part 3
6/2/2017
University of Advancing Technology*/

import java.util.Scanner;

public class MainInvoice {//public class MainInvoice
	

	public static void main(String[] args) {//main
	String Contt;//string for while loop
	//account creation 1-4
	SetAndGet account1 = new SetAndGet();
	SetAndGet account2 = new SetAndGet();
	SetAndGet account3 = new SetAndGet();
	SetAndGet account4 = new SetAndGet();
	//welcome message
	System.out.println("*************************");
	System.out.println("Welcome to my assignment: Control Statements Part 3");
	System.out.println("*************************");
	Scanner input = new Scanner(System.in);//new scanner, user input
	char Continue = 'y';//char for while loop, scanner cannot take char, utilized with string  contt
	while(Continue == 'y'){ //while loop, while continue is y
		
	
	
	int selection;//int for switch, user input
	
	System.out.println("Please enter info for the following accounts...");
	System.out.println("1. Account #1");
	System.out.println("2. Account #2");
	System.out.println("3. Account #3");
	System.out.println("4. Account #4");
	
	selection = input.nextInt();
	switch(selection) {
	case 1:
	//accessors and mutators utilized for account parameter manipulation
	System.out.println("Please enter account number:");
	account1.setAccount(input.nextInt());
	System.out.println("Please enter balance: ");
	account1.setOldBalance(input.nextInt());
	System.out.println("Enter charges made: ");
	account1.setCharges(input.nextInt());
	System.out.println("Enter account credit:");
	account1.setCredits(input.nextInt());
	System.out.println("Enter credit limit: ");
	account1.setCreditLimit(input.nextInt());
	account1.setNewBalance(account1.getCredits()+account1.getOldBalance()-account1.getCharges());
	System.out.println("New balance is: "+account1.getNewBalance());
	if(account1.getNewBalance()<0 & account1.getNewBalance()<account1.getCreditLimit())
	System.out.println("Insufficent Credit!");
	else
	{
	}
	break;
	
	case 2:
	//accessors and mutators utilized for account parameter manipulation
	System.out.println("Please enter account number:");
	account2.setAccount(input.nextInt());
	System.out.println("Please enter balance: ");
	account2.setOldBalance(input.nextInt());
	System.out.println("Enter charges made: ");
	account2.setCharges(input.nextInt());
	System.out.println("Enter account credit:");
	account2.setCredits(input.nextInt());
	System.out.println("Enter credit limit: ");
	account2.setCreditLimit(input.nextInt());
	account2.setNewBalance(account2.getCredits()+account2.getOldBalance()-account2.getCharges());
	System.out.println("New balance is: "+account2.getNewBalance());
	if(account2.getNewBalance()<0 & account2.getNewBalance()<account2.getCreditLimit())
	System.out.println("Insufficent Credit!");
	else
	{
	}

	break;
	case 3:
	//accessors and mutators utilized for account parameter manipulation
	System.out.println("Please enter account number:");
	account3.setAccount(input.nextInt());
	System.out.println("Please enter balance: ");
	account3.setOldBalance(input.nextInt());
	System.out.println("Enter charges made: ");
	account3.setCharges(input.nextInt());
	System.out.println("Enter account credit:");
	account3.setCredits(input.nextInt());
	System.out.println("Enter credit limit: ");
	account3.setCreditLimit(input.nextInt());
	account3.setNewBalance(account3.getCredits()+account3.getOldBalance()-account3.getCharges());
	System.out.println("New balance is: "+account3.getNewBalance());
	if(account3.getNewBalance()<0 & account3.getNewBalance()<account3.getCreditLimit())
	System.out.println("Insufficent Credit!");
	else
	{
	}
	break;
	
	case 4:
	//accessors and mutators utilized for account parameter manipulation
	System.out.println("Please enter account number:");
	account4.setAccount(input.nextInt());
	System.out.println("Please enter balance: ");
	account4.setOldBalance(input.nextInt());
	System.out.println("Enter charges made: ");
	account4.setCharges(input.nextInt());
	System.out.println("Enter account credit:");
	account4.setCredits(input.nextInt());
	System.out.println("Enter credit limit: ");
	account4.setCreditLimit(input.nextInt());
	account4.setNewBalance(account1.getCredits()+account4.getOldBalance()-account4.getCharges());
	System.out.println("New balance is: "+account4.getNewBalance());
	if(account4.getNewBalance()<0 & account4.getNewBalance()<account4.getCreditLimit())
	System.out.println("Insufficent Credit!");
	else
	{
	}
	break;
	
	default:
	System.out.println("Invalid Entry!");
	}// End switch
	System.out.println("Would you like to continue? (y/n)");
	Contt = input.next().toLowerCase();//input = scan.next().toLowerCase();
	Continue = Contt.charAt(0);//quit = input.charAt(0)
	
	}//while loop end
	
	}//end main

}//end class MainInvoice
