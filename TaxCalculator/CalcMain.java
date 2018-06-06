import java.util.Scanner;
public class CalcMain {

	public static void main(String[] args) {
	String Contt;//string for while loop
	System.out.println("Hello! "+"Welcome to Al Capone's tax calculator.");//Funny into
	//status creation 
	CalcSetGet single = new CalcSetGet();
	CalcSetGet marriedJoint = new CalcSetGet();
	CalcSetGet marriedSeparate = new CalcSetGet();
	CalcSetGet headOfHousehold = new CalcSetGet();
	//Scanner input for user input
	Scanner input = new Scanner(System.in);
	char Continue = 'y';//char for while loop, scanner cannot take char, utilized with string  contt
	while(Continue == 'y'){ //while loop, while continue is y
		
	
			
	int selection;//int for switch, user input
	//statements for basic menu
	System.out.println("What is your filing status?...");
	System.out.println("1. Single.");
	System.out.println("2. Married Filling Jointly.");
	System.out.println("3. Married Filing Separately.");
	System.out.println("4. Head of Household.");
		
		selection = input.nextInt();
		switch(selection) {
		case 1:
		System.out.println("Single.");
		System.out.println("Please enter taxable income:");
		single.setTaxableIncome(input.nextInt());
		if(single.getTaxableIncome()< 8350){
		single.setTaxTotal(single.getTaxableIncome()*10/100);
		System.out.println("Your tax ammount is:"+single.getTaxTotal());
		
		}
		else if (single.getTaxableIncome()>8350&single.getTaxableIncome()<33950) {
		int prevTax = 835;
		single.setTaxTotal((single.getTaxableIncome()-8350)*15/100+prevTax);
		System.out.println("Your tax ammount is:"+single.getTaxTotal());
		}
		else if(single.getTaxableIncome()>33950&single.getTaxableIncome()<82250){
		int prevTax = 835;
		int prevTax2 = 5092;
		single.setTaxTotal((single.getTaxableIncome()-42300)*25/100+prevTax+prevTax2);
		System.out.println("Your tax ammount is:"+single.getTaxTotal());
		}
		else if(single.getTaxableIncome()>82250&single.getTaxableIncome()<171550){
		int prevTax=835;
		int prevTax2=5092;
		int prevTax3=20562;
		single.setTaxTotal((single.getTaxableIncome()-124550)*28/100+prevTax+prevTax2+prevTax3);
		System.out.println("Your tax ammount is:"+single.getTaxTotal());
		}
		else if(single.getTaxableIncome()>171551&single.getTaxableIncome()<372950){
		int prevTax=835;
		int prevTax2=5092;
		int prevTax3=20562;
		int prevTax4=48034;
		single.setTaxTotal((single.getTaxableIncome()-296100)*33/100+prevTax+prevTax2+prevTax3+prevTax4);
		System.out.println("Your tax ammount is:"+single.getTaxTotal());
		}
		else if(single.getTaxableIncome()>372951){
			int prevTax=835;
			int prevTax2=5092;
			int prevTax3=20562;
			int prevTax4=48034;
			int prevTax5=123073;
			single.setTaxTotal((single.getTaxableIncome()-669050)*35/100+prevTax+prevTax2+prevTax3+prevTax4+prevTax5);
			System.out.println("Your tax ammount is:"+single.getTaxTotal());	
		}
		
		break;
		case 2:
		System.out.println("Married Filing Jointly.");
		System.out.println("Please enter taxable income:");
		marriedJoint.setTaxableIncome(input.nextInt());
		if(marriedJoint.getTaxableIncome()< 16700){
			marriedJoint.setTaxTotal(marriedJoint.getTaxableIncome()*10/100);
			System.out.println("Your tax ammount is:"+marriedJoint.getTaxTotal());
			
			}
			else if (marriedJoint.getTaxableIncome()>16700&marriedJoint.getTaxableIncome()<67900) {
			int prevTax = 1670;
			marriedJoint.setTaxTotal((marriedJoint.getTaxableIncome()-16701)*15/100+prevTax);
			System.out.println("Your tax ammount is:"+marriedJoint.getTaxTotal());
			}
			else if(marriedJoint.getTaxableIncome()>67900&marriedJoint.getTaxableIncome()<137050){
			int prevTax = 1670;
			int prevTax2 = 10185;
			marriedJoint.setTaxTotal((marriedJoint.getTaxableIncome()-84600)*25/100+prevTax+prevTax2);
			System.out.println("Your tax ammount is:"+marriedJoint.getTaxTotal());
			}
			else if(marriedJoint.getTaxableIncome()>137050&marriedJoint.getTaxableIncome()<208850){
			int prevTax=1670;
			int prevTax2=10185;
			int prevTax3=34262;
			marriedJoint.setTaxTotal((marriedJoint.getTaxableIncome()-221650)*28/100+prevTax+prevTax2+prevTax3);
			System.out.println("Your tax ammount is:"+marriedJoint.getTaxTotal());
			}
			else if(marriedJoint.getTaxableIncome()>208850&marriedJoint.getTaxableIncome()<372950){
			int prevTax=1670;
			int prevTax2=10185;
			int prevTax3=34262;
			int prevTax4=58478;
			marriedJoint.setTaxTotal((marriedJoint.getTaxableIncome()-427500)*33/100+prevTax+prevTax2+prevTax3+prevTax4);
			System.out.println("Your tax ammount is:"+marriedJoint.getTaxTotal());
			}
			else if(marriedJoint.getTaxableIncome()>372951){
				int prevTax=1670;
				int prevTax2=10185;
				int prevTax3=34262;
				int prevTax4=58478;
				int prevTax5=123073;
				marriedJoint.setTaxTotal((marriedJoint.getTaxableIncome()-800450)*35/100+prevTax+prevTax2+prevTax3+prevTax4+prevTax5);
				System.out.println("Your tax ammount is:"+marriedJoint.getTaxTotal());
			}
		break;
		case 3:
		System.out.println("Married Filing Separately.");
		System.out.println("Please enter taxable income:");
		marriedSeparate.setTaxableIncome(input.nextInt());
		if(marriedSeparate.getTaxableIncome()< 8350){
			marriedSeparate.setTaxTotal(marriedSeparate.getTaxableIncome()*10/100);
			System.out.println("Your tax ammount is:"+marriedSeparate.getTaxTotal());
			
			}
			else if (marriedSeparate.getTaxableIncome()>8350&marriedSeparate.getTaxableIncome()<33950) {
			int prevTax = 835;
			marriedSeparate.setTaxTotal((marriedSeparate.getTaxableIncome()-8350)*15/100+prevTax);
			System.out.println("Your tax ammount is:"+marriedSeparate.getTaxTotal());
			}
			else if(marriedSeparate.getTaxableIncome()>33950&marriedSeparate.getTaxableIncome()<68525){
			int prevTax = 835;
			int prevTax2 = 5092;
			marriedSeparate.setTaxTotal((marriedSeparate.getTaxableIncome()-42300)*25/100+prevTax+prevTax2);
			System.out.println("Your tax ammount is:"+marriedSeparate.getTaxTotal());
			}
			else if(marriedSeparate.getTaxableIncome()>68525&marriedSeparate.getTaxableIncome()<104425){
			int prevTax=835;
			int prevTax2=5092;
			int prevTax3=15131;
			marriedSeparate.setTaxTotal((marriedSeparate.getTaxableIncome()-102825)*28/100+prevTax+prevTax2+prevTax3);
			System.out.println("Your tax ammount is:"+marriedSeparate.getTaxTotal());
			}
			else if(marriedSeparate.getTaxableIncome()>104426&marriedSeparate.getTaxableIncome()<186475){
			int prevTax=835;
			int prevTax2=5092;
			int prevTax3=15131;
			int prevTax4=29239;
			marriedSeparate.setTaxTotal((marriedSeparate.getTaxableIncome()-215250)*33/100+prevTax+prevTax2+prevTax3+prevTax4);
			System.out.println("Your tax ammount is:"+marriedSeparate.getTaxTotal());
			}
			else if(marriedSeparate.getTaxableIncome()>186475){
				int prevTax=835;
				int prevTax2=5092;
				int prevTax3=15131;
				int prevTax4=29239;
				int prevTax5=61536;
				marriedSeparate.setTaxTotal((marriedSeparate.getTaxableIncome()-401725)*35/100+prevTax+prevTax2+prevTax3+prevTax4+prevTax5);
				System.out.println("Your tax ammount is:"+marriedSeparate.getTaxTotal());	
			}
		break;
		case 4:
		System.out.println("Head of Household.");
		System.out.println("Please enter taxable income:");
		headOfHousehold.setTaxableIncome(input.nextInt());
		if(headOfHousehold.getTaxableIncome()< 11950){
			headOfHousehold.setTaxTotal(headOfHousehold.getTaxableIncome()*10/100);
			System.out.println("Your tax ammount is:"+headOfHousehold.getTaxTotal());
			
			}
			else if (headOfHousehold.getTaxableIncome()>11950&headOfHousehold.getTaxableIncome()<45500) {
			int prevTax = 1195;
			headOfHousehold.setTaxTotal((headOfHousehold.getTaxableIncome()-11950)*15/100+prevTax);
			System.out.println("Your tax ammount is:"+headOfHousehold.getTaxTotal());
			}
			else if(headOfHousehold.getTaxableIncome()>45500&headOfHousehold.getTaxableIncome()<117450){
			int prevTax = 1195;
			int prevTax2 = 6825;
			headOfHousehold.setTaxTotal((headOfHousehold.getTaxableIncome()-57460)*25/100+prevTax+prevTax2);
			System.out.println("Your tax ammount is:"+headOfHousehold.getTaxTotal());
			}
			else if(headOfHousehold.getTaxableIncome()>117451&headOfHousehold.getTaxableIncome()<190200){
			int prevTax=1195;
			int prevTax2=6825;
			int prevTax3=29362;
			headOfHousehold.setTaxTotal((headOfHousehold.getTaxableIncome()-174900)*28/100+prevTax+prevTax2+prevTax3);
			System.out.println("Your tax ammount is:"+headOfHousehold.getTaxTotal());
			}
			else if(headOfHousehold.getTaxableIncome()>190200&headOfHousehold.getTaxableIncome()<372950){
			int prevTax=1195;
			int prevTax2=6825;
			int prevTax3=29362;
			int prevTax4=53256;
			headOfHousehold.setTaxTotal((headOfHousehold.getTaxableIncome()-365100)*33/100+prevTax+prevTax2+prevTax3+prevTax4);
			System.out.println("Your tax ammount is:"+headOfHousehold.getTaxTotal());
			}
			else if(headOfHousehold.getTaxableIncome()>372951){
				int prevTax=1195;
				int prevTax2=6825;
				int prevTax3=29362;
				int prevTax4=53256;
				int prevTax5=123073;
				headOfHousehold.setTaxTotal((headOfHousehold.getTaxableIncome()-738050)*35/100+prevTax+prevTax2+prevTax3+prevTax4+prevTax5);
				System.out.println("Your tax ammount is:"+headOfHousehold.getTaxTotal());	
			}
		break;
		default:
		System.out.println("Invalid entry!");
		}
		
		
		
	
	
	
	
	
	
	
	
		
	System.out.println("Would you like to continue? (y/n)");
	Contt = input.next().toLowerCase();//input = scan.next().toLowerCase();
	Continue = Contt.charAt(0);//quit = input.charAt(0)			
	}
	
		
		
	}//end main
	
	
	

}//end class
