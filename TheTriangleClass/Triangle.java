/*
 * Rico Cintron
 * The Triangle Class Assignment
 * 7/13/2017
 * University of Advancing Technology
 */




public class Triangle {

	public static void main(String[] args) {
		System.out.println("**********************************");
		System.out.println("Class inheritance program");
		System.out.println("**********************************");
		
			
		ATriangle test = new ATriangle();
		test.setColor("Red");test.setFilled(true);test.setHeight(20);//mutator call/modification
		//Accessor calls
		System.out.println("Side 1 (Child atribute): "+test.getSide1());
		System.out.println("Side 2 (Child atribute): "+test.getSide2());
		System.out.println("Side 3 (Child atribute): "+test.getSide3());
		System.out.println("Color (Parent atribute): "+test.getColor());
		System.out.println("Fill status (Parent atribute): "+test.getFilled());
		System.out.println("Perimeter (Parent atribute): "+test.calculatePerimeter());
		System.out.println("Area (Parent atribute): "+test.calculateArea());
		
	}

}
