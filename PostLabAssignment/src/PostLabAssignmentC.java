/*
Rico Cintron
Post Lab Assignment
5/10/17
University of Advancing Technology
 */


import java.util.Scanner;//import declaration for scanner class
public class PostLabAssignmentC {//public class
	
	public static void main(String[] args) {//main
		System.out.println("Welcome to my Post-Lab assignment. Enter a radius of a circle and recieve area,diameter and circumference.");
	Scanner input=new Scanner(System.in);//scanner creation for user input
	//several doubles to set value for Pi, hold other values
	double circleRadius;
	double Pi=3.14159;



	
	
	System.out.println("Please enter radius:");//print statement
	circleRadius=input.nextInt();//allows for user input
	double rSqr;//variable for square root 
	rSqr = (circleRadius*circleRadius);
	//output statements to display data to console
	System.out.println("Diameter is:"+circleRadius*2);
	System.out.print("Circumference:");
	System.out.println(2*Pi*circleRadius);
	System.out.print("Area is:");
	System.out.println(Pi*rSqr);
	System.out.println(" ");
	System.out.println("Thanks for using my program!");
		
		
		
		
		
		
		
		

	}

}
