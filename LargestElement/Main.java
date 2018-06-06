/*
 * Rico Cintron
 * Locate Largest Element Assignment
 * 6/27/2017
 * University of Advancing Technology
 */



import java.util.*;//imported java utility
public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);//new scanner
	//integer for row and column
	int row=0;
	int column=0;
	//Greeting and instructions
	System.out.println("Welcome to two-dimensional array fun!");
	System.out.println("You will enter the desired rows and columns for your array.");
	System.out.println("You will also enter the numbers for the array!");
	System.out.println();
	System.out.println("Please enter desired rows: ");
	row = input.nextInt();
	System.out.println("Please enter desired columns: ");
	column = input.nextInt();
	int numbers=0;
	numbers = row*column;//calculation to display total of numbers that need to be entered
	MaxValue(row,column,numbers);//function/method call. Accepts 3 sets of integers
	
	}
public static double MaxValue(int row, int column,int numbers){//method that accepts 3 ints
	double[][]multi= new double [row][column];//multi-dimension array creation, accepts ints from user for rows and colums
	double value=0;//int for value
	Scanner input = new Scanner(System.in);//new scanner
	System.out.println("Please enter " +numbers+ " numbers.");//output numbers user needs to enter
	for(int i=0;i<multi.length;i++){//for loop using array length
	double max = multi[i][0];
	for(int j=0;j<multi[i].length;j++){//for loop using array length 
	System.out.print("Please enter a number: ");//ask user for a number
	multi[i][j]= input.nextDouble();//scan in number
	
	if(max<multi[i][j]){;//if max is less than array positions
		
		max = multi[i][j];//max equals positions
		
		
		}
	}
	System.out.println("Maximum number in this row is: " +max);//display max number for this row
	System.out.println();
	if(max > value)value = max;//if max value is greater than value, set value equal to max
}
	
System.out.println("Highest value entered for entire array is: "+value);//display highest value in entire array
	
System.out.println("Thanks for using this program!");
	return value;
	
}
}
/*
multi[0][0]=23.5;
multi[0][1]=35;
multi[0][2]=2;
multi[0][3]=10;
multi[1][0]=4.5;
multi[1][1]=35;
multi[1][2]=45;
multi[1][3]=3.5;
multi[2][0]=35;
multi[2][1]=44;
multi[2][2]=5.5;
multi[2][3]=9.6;
*/
