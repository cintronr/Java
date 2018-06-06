/*
 * Rico Cintron
 * Baby Name Ranking Assignment
 * 7/20/2017
 * University of Advancing Technology
 */
//import libraries for further functionality.
import java.io.*;
import java.util.Scanner;

import static java.lang.System.*;




public class BabyN {
	
	public static void main(String[] args) {
	//create new Scanner
	Scanner reader = new Scanner(System.in);	
	//create two two-dimensional arrays
	String[][] boyNames = new String[5][200];
	String[][] girlNames = new String [5][200];
	// Pass in names from text file to arrays
	try{
		FileReader fr = new FileReader("BabyNames1970s.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null){
			//System.out.println(str+"\n");
			for(int i =0;i<200;i++){
			boyNames[0][i] = br.readLine();
			girlNames[0][i]= br.readLine();
			}
		}
		br.close();	
	}
		catch(IOException e) {
		out.println("File not found!");
		}
	//////////////////////////////////////////////////////////////File 2
	try{
		FileReader fr = new FileReader("BabyNames1980s.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null){
			//System.out.println(str+"\n");
			for(int i =0;i<200;i++){
			boyNames[1][i] = br.readLine();
			girlNames[1][i]= br.readLine();
			}
		}
		br.close();	
	}
		catch(IOException e) {
		out.println("File not found!");
		}
	//////////////////////////////////////////////////////////File 3////////////////////////////////////////
	try{
		FileReader fr = new FileReader("BabyNames1990s.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null){
			//System.out.println(str+"\n");
			for(int i =0;i<200;i++){
			boyNames[2][i] = br.readLine();
			girlNames[2][i]= br.readLine();
			}
		}
		br.close();	
	}
		catch(IOException e) {
		out.println("File not found!");
		}
	/////////////////////////////////////////////////////////////File 4/////////////////////////////////////////////
	try{
		FileReader fr = new FileReader("BabyNames2000s.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null){
			//System.out.println(str+"\n");
			for(int i =0;i<200;i++){
			boyNames[3][i] = br.readLine();
			girlNames[3][i]= br.readLine();
			}
		}
		br.close();	
	}
		catch(IOException e) {
		out.println("File not found!");
		}
	/////////////////////////////////////////////////////File 5////////////////////////////////
	try{
		FileReader fr = new FileReader("BabyNames2010s.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null){
			//System.out.println(str+"\n");
			for(int i =0;i<200;i++){
			boyNames[4][i] = br.readLine();
			girlNames[4][i]= br.readLine();
			}
		}
		br.close();	
	}
		catch(IOException e) {
		out.println("File not found!");
		}
	

	
	
	//////////////////////////////////////////////////////Switch Case Menu//////////////////////
	String Contt;//string for while loop
	boolean looped = false;
	char Continue = 'y';//char for while loop, scanner cannot take char, utilized with string  contt
	while(Continue == 'y'){ //while loop, while continue is y
	System.out.println("Welcome to the Baby Name Ranking Program!");
	int selection = 0;
	int selection2 = 0;
	boolean found = false;
	String gender;
	String name2;	
	
	
	
	
	System.out.println("Please enter a name: ");
	if(looped == false){
	name2 = reader.nextLine();
	}
	else{
	name2 = reader.nextLine();
	name2 = reader.nextLine();
	}
	System.out.println("Please enter gender (M/F)");
	gender = reader.nextLine();
	System.out.println("Please enter a year(1970-2015): ");
	selection  = reader.nextInt();
	if(selection< 1970) System.out.println("Invalid Year!");
	else if(selection>=1970 && selection < 1980)selection2 = 1;
	else if(selection>=1980 && selection < 1990)selection2 = 2;
	else if(selection>=1990 && selection < 2000)selection2 = 3;
	else if(selection>=2000 && selection < 2010)selection2 = 4;
	else if(selection>=2010 && selection<2015)selection2 = 5;
	else System.out.println("Invalid Year!");
	switch(selection2){
	case 1:
	if(gender.equals("M")){
		for(int i = 0;i < 200;i++){
			if(boyNames[0][i].equals(name2)){
			System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
			//System.out.println(i+1);
			found = true;
			}//if statement ends
			}//for loop which helps find name end
			if (found == false){
			System.out.println("Name not found!");
			}	
	}
	else{
		for(int i = 0;i < 200;i++){
			if(girlNames[0][i].equals(name2)){
			System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
			//System.out.println(i+1);
			found = true;
			
			}//if statement ends
			}//for loop which helps find name end
			if (found == false){
			System.out.println("Name not found!");
			}
	}
	break;
	case 2:
		if(gender.equals("M")){
			for(int i = 0;i < 200;i++){
				if(boyNames[1][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
			
				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}	
		}
		else{
			for(int i = 0;i < 200;i++){
				if(girlNames[1][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
			
				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}
		}
	break;
	case 3:
		if(gender.equals("M")){
			for(int i = 0;i < 200;i++){
				if(boyNames[2][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
				
				}//if statement ends
				}//for loop which helps find name end
				if (found == false){
				System.out.println("Name not found!");
				}	
		}
		else{
			for(int i = 0;i < 200;i++){
				if(girlNames[2][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
		
				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}
		}
	break;
	case 4:
		if(gender.equals("M")){
			for(int i = 0;i < 200;i++){
				if(boyNames[3][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
				
				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}	
		}
		else{
			for(int i = 0;i < 200;i++){
				if(girlNames[3][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}
		}
	break;
	case 5:
		if(gender.equals("M")){
			for(int i = 0;i < 200;i++){
				if(boyNames[4][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;
	
				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}	
		}
		else{
			for(int i = 0;i < 200;i++){
				if(girlNames[4][i].equals(name2)){
				System.out.println(name2 +" is ranked #"+(i+1)+" in "+selection);
				//System.out.println(i+1);
				found = true;

				}//if statement ends
				}//for loop which helps find name ends
				if (found == false){
				System.out.println("Name not found!");
				}
		}
	break;
	default:
	System.out.println("Invalid Entry!");
	break;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//////////////////////////////////////////////////////////End switch case menu/////////////////////////////////
	
	looped = true;
	}//end while loop
	System.out.println("Would you like to continue? (y/n)");
	Contt = reader.nextLine().toLowerCase();//input = scan.next().toLowerCase();
	Continue = Contt.charAt(0);//quit = input.charAt(0)
	
	
	
	
	}//main ends

} //BabyN class ends
