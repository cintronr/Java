/*
 Rico Cintron
 Factorial Calculator
 6/7/2017
 University of Advancing Technology
 */



public class factorialMain {//Class

	
	
	public static void main(String[] args) {//void main
		System.out.println("*****************************************");
		System.out.println("Hello, Welcome to my factorial calcualtor");
		System.out.println("*****************************************");
		System.out.println();
		for(int i=1;i<3;i++){// for loop, 1-5
		float sum =factorFunction(i);//int sum is equal to factorFunction(i) enabling i value to be passed into the function
		System.out.println(i+" has a factorial of "+sum);//print i and sum value
	
		}
			

	}
	public static float factorFunction(int n){//factorFunction(pass in int sets to n)
	float sum=1; //sets a value to 1
	for(int i=1;i<=n;i++){//for loop enabling i loop value to compare to value passed in. If int i is less than value passed in then...
	sum = sum*i;//sum value equals sum value times int i
	}//end for loop
	return sum;//returns sum value for use outside of function
	
		
	}//end function

}//end class
