/*
 * Rico Cintron
 * Airline Reservation Assignment
 * 6/22/2017
 * University of Advancing Technology
 */
import java.util.Scanner;//Java scanner utility
public class MainClass {//main class
static Scanner reader = new Scanner(System.in);//scanner creation
//integer initialization
static int seatFirstClass = 5;
static int seatEconomy = 5;
static int seatNumFirst =1;
static int seatNumEcon = 6;
//array creation
static boolean[] Array = new boolean[11];



	public static void main(String[] args) {
	//loop to populate each section of the array with false values
	for(int i=0;i<10;i++){
	Array[i] = false;
	}
	String looper = "y"; //string setting looper to "y"
	
	while(looper=="y"||looper=="Y"){//while loop
	int selection=0;//int for selection
	//Brief menu providing user options
	System.out.println("Please make a purchase selection.");
	System.out.println("1. First Class.");
	System.out.println("2. Economy.");
	selection = reader.nextInt();//scan selection
	switch(selection){//switch case providing menu selections
	case 1:
	if(seatFirstClass <= 0){//if first class seats are sold out, provide economy seat
	System.out.println("First class is full. You will receive an Economy Class seat.");
	if(seatEconomy <= 0){//if economy seats are sold out, state such condition
	System.out.println("Economy seats are sold out, Sorry!");	
	}
	else{
	seatEconomy--;
	Array[seatNumEcon] = true;
	System.out.println("Economy Class.");
	System.out.println("Seat # "+seatNumEcon);
	seatNumEcon++;
	}
	}
	else{
	seatFirstClass--;
	Array[seatNumFirst]= true;
	System.out.println("First Class.");
	System.out.println("Seat # "+seatNumFirst);
	seatNumFirst++;
	}
	break;
	case 2:
	if(seatEconomy <= 0){
	System.out.println("Economy seats are sold out, Sorry!");	
	}
	else{
	seatEconomy--;
	
	Array[seatNumEcon] = true;
	System.out.println("Economy Class.");
	System.out.println("Seat # "+seatNumEcon);
	seatNumEcon++;
	//for(int i =0;i<10;i++){
	//System.out.println(Array[i]);
	//}//end array print for loop
	}
	break;
	case 3://test option to verify array populated with true values
	
	System.out.println("Array 1: "+Array[1]);
	System.out.println("Array 2: "+Array[2]);
	System.out.println("Array 3: "+Array[3]);
	System.out.println("Array 4: "+Array[4]);
	System.out.println("Array 5: "+Array[5]);
	System.out.println("Array 6: "+Array[6]);
	System.out.println("Array 7: "+Array[7]);
	System.out.println("Array 8: "+Array[8]);
	System.out.println("Array 9: "+Array[9]);
	System.out.println("Array 10: "+Array[10]);
	
	break;
	default:
	System.out.println("Invalid Selection!");
	break;
	}//end switch selection

	}//end main
	System.out.println("Would you like to purchase another ticket?");
	looper = reader.next();
	}//end loop
}//end main class
