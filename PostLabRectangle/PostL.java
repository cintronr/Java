/*
 * Rico Cintron
 * Post Lab: Rectangle
 * 7/7/2017
 * University of Advancing Technology
 */
import java.util.Scanner;



public class PostL {//Post Lab class

	public static void main(String[] args) {//main
	Rectangle myRect = new Rectangle();//creation of new object
	System.out.println("***********************************");
	System.out.println("Hello, welcome to Post Lab: Rectangle.");
	System.out.println("***********************************");
	System.out.println();
	
	char selection1 = 'y';//char selection for while loop
	int selection2 = 0;//char selection for menu
	Scanner input = new Scanner(System.in);	//new scanner for user input
	while(selection1 == 'y' || selection1 == 'Y'){//while loop
	//Menu
	System.out.println("Please make a selection from the menu below.");
	System.out.println("1.Enter Length and Width of rectangle.");
	System.out.println("2.Perform calculation and generate results.");
	System.out.println("3.Exit.");
	selection2 = input.nextInt();//accepts user input, assigns to selection2
	switch(selection2){//switch case menu
	case 1:
	//accept width and length for rectangle
	System.out.println("Please enter Width: ");
	myRect.setWidth(input.nextFloat());
	System.out.println("Please enter Lenth: ");
	myRect.setLength(input.nextFloat());
	break;
	case 2:
	//display area and perimeter 
	System.out.println("Area: "+Rectangle.calculateArea());
	System.out.println("Perimeter: "+Rectangle.calculatePerimeter());
	break;
	case 3:
	break;
	default:
	System.out.println("Invalid selection, please try again!");
	break;
	}
	//myRect.setWidth(10);
	//myRect.setLength(10);
	System.out.println("Would you like to continue(y/n)");
	selection1 = input.next(".").charAt(0);
	
	}//end while loop
	
	
	}// end main

}// end class PostL
