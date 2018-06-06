/*
 * Rico Cintron
 * Post Lab Distance Assignment
 * 6/14/2017
 * University of Advancing Technology
 * 
 */
import java.util.Scanner;//util scanner package

public class DistanceMain {//class DistanceMain
static Scanner reader = new Scanner(System.in);
	//void main
	public static void main(String[] args) {
	System.out.println("Hello, Welcome to my distance calculation program");
	System.out.println("*************************************************");
	System.out.println("Please enter the following information below.");
	System.out.println();
	System.out.println("Please enter X1: ");//Prompt for X1
	double x1 = reader.nextDouble();//read and store X1
	System.out.println("Please enter Y1: ");//Prompt for Y1
	double y1 = reader.nextDouble();//read and store Y1
	System.out.println("Please enter X2: ");//Prompt for X2
	double x2 = reader.nextDouble();//read and store X2
	System.out.println("Please enter Y2: ");//Prompt for Y2
	double y2 = reader.nextDouble();//read and store Y2
	distMethod(x1,y1,x2,y2);//call method distMethod passing in the values read in above
		
	}
public static double distMethod(double x1, double y1, double x2, double y2){//method distMethod
	double distance = 0;//double for value for total distance 
	
	distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));// distance is equal to sqrt of (x2-x1)^2+(y2-y1)^2
	System.out.println("Distance is: "+distance);//display distance 
	
	
	
	return distance;//return distance
}
}
