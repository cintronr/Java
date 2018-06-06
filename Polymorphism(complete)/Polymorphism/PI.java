/*
 * Rico Cintron
 * Final Project: Polymorphism and Inheritance
 * 7/30/2017
 * University of Advancing Technology
 */
//import libraries for further functionality.
import java.io.*;//java libraries
import java.util.Objects;
import java.util.Scanner;




public class PI {//primary class

	public static void main(String[] args) {//main class
	
	//New scanner for user input and variables for user input
	Scanner reader = new Scanner(System.in);
	String Contt;
	char Continue = 'y';
	int selection2 = 0;
	int selection3 = 0;
	int contactRegular = 1;
	int contactFriend = 1;
	//
	String firstname;
	String lastname;
	int phoneNumber;
	String street;
	String city;
	String State;
	String emailAddress;
	int DOB;
	int zip;
	String search;
//creation of various classes
	Address test = new Address();
	Contact regular1 = new Contact();
	Friend friend1 = new Friend();
	Contact regular2 = new Contact();
	Friend friend2 = new Friend();
	Contact regular3 = new Contact();
	Friend friend3 = new Friend();
	
	while (Continue == 'y'){
	
	
	
	System.out.println("**********************************");
	System.out.println("Welcome to Rico's Contact Manager!");
	System.out.println("**********************************");
	System.out.println();
	System.out.println("Please make a selection from the menu below:");
	System.out.println("1) Add a new contact(Max of 3 each).");
	System.out.println("2) Look up a contact by last name.");
	System.out.println("3) Exit.");
//////////////////////////////////////////
	

		selection2  = reader.nextInt();
		switch(selection2){
		
		case 1:
		System.out.println("1) Regular Contact.");
		System.out.println("2) Friend.");
		selection3  = reader.nextInt();
		switch(selection3){
		case 1:
		if(contactRegular == 1){
		System.out.println("Please enter your first name: ");
		reader.nextLine();  // Consume newline left-over
		firstname  = reader.nextLine();
		regular1.setfirstName(firstname);
		System.out.println("Please enter your last name: ");
		lastname = reader.nextLine();
		//reader.nextLine();  // Consume newline left-over
		regular1.setlastName(lastname);
		System.out.println("Please enter your phone number: (No dashes)");
		phoneNumber = reader.nextInt();
		regular1.setphoneNumber(phoneNumber);
		System.out.println("Please enter your street: ");
		reader.nextLine();  // Consume newline left-over
		street = reader.nextLine();
		regular1.setStreet(street);
		System.out.println("Please enter your city: ");
		city = reader.nextLine();
		regular1.setCity(city);
		System.out.println("Please enter your state: ");
		State = reader.nextLine();
		regular1.setState(State);
		System.out.println("Please enter your zip code: ");
		zip = reader.nextInt();
		regular1.setZip(zip);
		contactRegular++;
		}
		else if (contactRegular == 2){
			System.out.println("Please enter your first name: ");
			reader.nextLine();  // Consume newline left-over
			firstname  = reader.nextLine();
			regular2.setfirstName(firstname);
			System.out.println("Please enter your last name: ");
			lastname = reader.nextLine();
			//reader.nextLine();  // Consume newline left-over
			regular2.setlastName(lastname);
			System.out.println("Please enter your phone number: (No dashes)");
			phoneNumber = reader.nextInt();
			regular2.setphoneNumber(phoneNumber);
			System.out.println("Please enter your street: ");
			reader.nextLine();  // Consume newline left-over
			street = reader.nextLine();
			regular2.setStreet(street);
			System.out.println("Please enter your city: ");
			city = reader.nextLine();
			regular2.setCity(city);
			System.out.println("Please enter your state: ");
			State = reader.nextLine();
			regular2.setState(State);
			System.out.println("Please enter your zip code: ");
			zip = reader.nextInt();
			regular2.setZip(zip);
			contactRegular++;
		}
		else if(contactRegular == 3){
			System.out.println("Please enter your first name: ");
			reader.nextLine();  // Consume newline left-over
			firstname  = reader.nextLine();
			regular3.setfirstName(firstname);
			System.out.println("Please enter your last name: ");
			lastname = reader.nextLine();
			//reader.nextLine();  // Consume newline left-over
			regular3.setlastName(lastname);
			System.out.println("Please enter your phone number: (No dashes)");
			phoneNumber = reader.nextInt();
			regular3.setphoneNumber(phoneNumber);
			System.out.println("Please enter your street: ");
			reader.nextLine();  // Consume newline left-over
			street = reader.nextLine();
			regular3.setStreet(street);
			System.out.println("Please enter your city: ");
			city = reader.nextLine();
			regular3.setCity(city);
			System.out.println("Please enter your state: ");
			State = reader.nextLine();
			regular3.setState(State);
			System.out.println("Please enter your zip code: ");
			zip = reader.nextInt();
			regular3.setZip(zip);
			contactRegular++;
		}
		else
		{
		System.out.println("Maximum capacity for Regular Contacts Reached!");
		}
		break;
		case 2:
			if(contactFriend == 1){
			System.out.println("Please enter your first name: ");
			reader.nextLine();  // Consume newline left-over
			firstname  = reader.nextLine();
			friend1.setfirstName(firstname);
			System.out.println("Please enter your last name: ");
			lastname = reader.nextLine();
			//reader.nextLine();  // Consume newline left-over
			friend1.setlastName(lastname);
			System.out.println("Please enter your phone number: (No dashes)");
			phoneNumber = reader.nextInt();
			friend1.setphoneNumber(phoneNumber);
			System.out.println("Please enter your street: ");
			reader.nextLine();  // Consume newline left-over
			street = reader.nextLine();
			friend1.setStreet(street);
			System.out.println("Please enter your city: ");
			city = reader.nextLine();
			friend1.setCity(city);
			System.out.println("Please enter your state: ");
			State = reader.nextLine();
			friend1.setState(State);
			System.out.println("Please enter your zip code: ");
			zip = reader.nextInt();
			friend1.setZip(zip);
			System.out.println("Please enter your email address: ");
			reader.nextLine();  // Consume newline left-over
			emailAddress = reader.nextLine();
			friend1.setemailAddress(emailAddress);
			System.out.println("Please enter your date of birth without dashes (mmddyyyy): ");
			DOB = reader.nextInt();
			friend1.setDOB(DOB);
			contactFriend++;
			}
			else if(contactFriend == 2){
				System.out.println("Please enter your first name: ");
				reader.nextLine();  // Consume newline left-over
				firstname  = reader.nextLine();
				friend2.setfirstName(firstname);
				System.out.println("Please enter your last name: ");
				lastname = reader.nextLine();
				//reader.nextLine();  // Consume newline left-over
				friend2.setlastName(lastname);
				System.out.println("Please enter your phone number: (No dashes)");
				phoneNumber = reader.nextInt();
				friend2.setphoneNumber(phoneNumber);
				System.out.println("Please enter your street: ");
				reader.nextLine();  // Consume newline left-over
				street = reader.nextLine();
				friend2.setStreet(street);
				System.out.println("Please enter your city: ");
				city = reader.nextLine();
				friend2.setCity(city);
				System.out.println("Please enter your state: ");
				State = reader.nextLine();
				friend2.setState(State);
				System.out.println("Please enter your zip code: ");
				zip = reader.nextInt();
				friend2.setZip(zip);
				System.out.println("Please enter your email address: ");
				reader.nextLine();  // Consume newline left-over
				emailAddress = reader.nextLine();
				friend2.setemailAddress(emailAddress);
				System.out.println("Please enter your date of birth without dashes (mmddyyyy): ");
				DOB = reader.nextInt();
				friend2.setDOB(DOB);
				contactFriend++;
			}
			else if (contactFriend == 3){
				System.out.println("Please enter your first name: ");
				reader.nextLine();  // Consume newline left-over
				firstname  = reader.nextLine();
				friend3.setfirstName(firstname);
				System.out.println("Please enter your last name: ");
				lastname = reader.nextLine();
				//reader.nextLine();  // Consume newline left-over
				friend3.setlastName(lastname);
				System.out.println("Please enter your phone number: (No dashes)");
				phoneNumber = reader.nextInt();
				friend3.setphoneNumber(phoneNumber);
				System.out.println("Please enter your street: ");
				reader.nextLine();  // Consume newline left-over
				street = reader.nextLine();
				friend3.setStreet(street);
				System.out.println("Please enter your city: ");
				city = reader.nextLine();
				friend3.setCity(city);
				System.out.println("Please enter your state: ");
				State = reader.nextLine();
				friend3.setState(State);
				System.out.println("Please enter your zip code: ");
				zip = reader.nextInt();
				friend3.setZip(zip);
				System.out.println("Please enter your email address: ");
				reader.nextLine();  // Consume newline left-over
				emailAddress = reader.nextLine();
				friend3.setemailAddress(emailAddress);
				System.out.println("Please enter your date of birth without dashes (mmddyyyy): ");
				DOB = reader.nextInt();
				friend3.setDOB(DOB);
				contactFriend++;
			}
		break;
		}
		break;
		
		case 2:
		System.out.println("Please enter last name of contact you wish to find: ");
		reader.nextLine();  // Consume newline left-over
			search  = reader.nextLine();
			if(Objects.equals(regular1.getlastName(),search))
			{
				System.out.println("Found in contact 1! ");
				System.out.println("First Name:"+ regular1.getfirstName());
				System.out.println("Last Name:"+ regular1.getlastName());
				System.out.println("Phone #:"+ regular1.getphoneNumber());
				System.out.println("Street:"+ regular1.getStreet());
				System.out.println("City:"+ regular1.getCity());
				System.out.println("State:"+ regular1.getState());
				System.out.println("Zip Code:"+ regular1.getZip());
			}
			else if(Objects.equals(regular2.getlastName(),search))
			{
				System.out.println("Found in contact 2! ");
				System.out.println("First Name:"+ regular2.getfirstName());
				System.out.println("Last Name:"+ regular2.getlastName());
				System.out.println("Phone #:"+ regular2.getphoneNumber());
				System.out.println("Street:"+ regular2.getStreet());
				System.out.println("City:"+ regular2.getCity());
				System.out.println("State:"+ regular2.getState());
				System.out.println("Zip Code:"+ regular2.getZip());
			}
			else if(Objects.equals(regular3.getlastName(),search))
			{
				System.out.println("Found in contact 3! ");
				System.out.println("First Name:"+ regular3.getfirstName());
				System.out.println("Last Name:"+ regular3.getlastName());
				System.out.println("Phone #:"+ regular3.getphoneNumber());
				System.out.println("Street:"+ regular3.getStreet());
				System.out.println("City:"+ regular3.getCity());
				System.out.println("State:"+ regular3.getState());
				System.out.println("Zip Code:"+ regular3.getZip());
			}
			else if(Objects.equals(friend1.getlastName(),search))
			{
				System.out.println("Found in friend contact 1! ");
				System.out.println("First Name:"+ friend1.getfirstName());
				System.out.println("Last Name:"+ friend1.getlastName());
				System.out.println("Phone #:"+ friend1.getphoneNumber());
				System.out.println("Street:"+ friend1.getStreet());
				System.out.println("City:"+ friend1.getCity());
				System.out.println("State:"+ friend1.getState());
				System.out.println("Zip Code:"+ friend1.getZip());
				System.out.println("Email: "+ friend1.getemailAddress());
				System.out.println("Date of Birth: "+ friend1.getDOB());
			}
			else if(Objects.equals(friend2.getlastName(),search))
			{
				System.out.println("Found in friend contact 2! ");
				System.out.println("First Name:"+ friend2.getfirstName());
				System.out.println("Last Name:"+ friend2.getlastName());
				System.out.println("Phone #:"+ friend2.getphoneNumber());
				System.out.println("Street:"+ friend2.getStreet());
				System.out.println("City:"+ friend2.getCity());
				System.out.println("State:"+ friend2.getState());
				System.out.println("Zip Code:"+ friend2.getZip());
				System.out.println("Email: "+ friend2.getemailAddress());
				System.out.println("Date of Birth: "+ friend2.getDOB());
			}
			else if(Objects.equals(friend3.getlastName(),search))
			{
				System.out.println("Found in friend contact 3! ");
				System.out.println("First Name:"+ friend3.getfirstName());
				System.out.println("Last Name:"+ friend3.getlastName());
				System.out.println("Phone #:"+ friend3.getphoneNumber());
				System.out.println("Street:"+ friend3.getStreet());
				System.out.println("City:"+ friend3.getCity());
				System.out.println("State:"+ friend3.getState());
				System.out.println("Zip Code:"+ friend3.getZip());
				System.out.println("Email: "+ friend3.getemailAddress());
				System.out.println("Date of Birth: "+ friend3.getDOB());
			}
			else{
				System.out.println("Contact not found!");
			}
		break;
		case 3:
		System.out.println("Exiting...");
		return;
		//break;
		default:
		System.out.println("Invalid Selection. Please try Again!");
		}	

////////////////////////////////////////	
	}//while loop ends
	System.out.println("Would you like to continue? (y/n)");
	Contt = reader.nextLine().toLowerCase();
	Continue = Contt.charAt(0);
	
	
	
	
}//main ends

	
}//class ends