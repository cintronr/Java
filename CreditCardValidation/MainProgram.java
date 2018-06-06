/*
 * Rico Cintron
 * Credit Card Validation Assignment
 * 6/14/2017
 * University of Advancing Technology
 */

import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		long number = 4388576018410707L;
		CardCalc(number);
		System.out.println();
		long number2 = 4246345689049834L;
		CardCalc(number2);
		
		
		
		
		
		
		
		
	}
	
public static int CardCalc(long number){
	System.out.println("Credit card number is: "+number);//print line displaying credit card number for verification
	int counter = 0;//integer for counting numbers in credit card
	Stack<Integer> CCStack = new Stack<Integer>();//stack CCStack for numbers entered
	//Various integers needed for basic arithmetic
	int firstProcess = 0;
	int firstProcess2 = 0;
	int secondProcess = 0;
	int secondProcess2 = 0;
	int sum=0;
	
	while (number > 0){//While number is greater than 0
	CCStack.push((int) (number % 10));//Push integer onto stack
	number=(number/10);//number equals number provided divided by ten, for continuous reduction of unneeded integers
	counter++;//counter increment
	
	}
	System.out.println();
	for(int i=0;i<16;i=i+2)//for loop providing cycles required to pop items from stack
	{
	firstProcess = 	(CCStack.pop()*2);//computes even number and assigns to firstProcess
	//A plethora of if statements which determine if a values are above 10, and if they are take one digit and add it to the second digit, setting that as the new value.
	if(firstProcess == 10){
		
	firstProcess = 1+0;
		
	}
	else if(firstProcess == 11){
		firstProcess = 1+1;
	}
	else if(firstProcess == 12){
		firstProcess = 1+2;
	}
	else if(firstProcess == 13){
		firstProcess = 1+3;
	}
	else if(firstProcess == 14){
		firstProcess = 1+4;
	}
	else if(firstProcess == 15){
		firstProcess = 1+5;
	}
	else if(firstProcess == 16){
		firstProcess = 1+6;
	}
	else if(firstProcess == 17){
		firstProcess = 1+7;
	}
	else if(firstProcess == 18){
		firstProcess = 1+8;
	}
	//assignment/calculation of popped values for computation
	firstProcess2 += firstProcess;
	secondProcess = (CCStack.pop());
	secondProcess2 += secondProcess;	
	}
	System.out.println();
	System.out.println("Numbers entered: "+counter);//display counter
	sum = firstProcess2+secondProcess2;//set sum of previous values
	System.out.println("Sum: "+sum);//display sum
	
	if(sum%10>0){//if remainder is not divisible by 10, card is invalid
	System.out.println("Card is INVALID");
	}
	else{
	System.out.println("Card is Valid");//otherwise, card is valid.
	}	
	
	return sum;//return sum
	
	

}
}


