
public class ATriangle extends GeometricObject{//child class inheriting from Geometric
//private variables initialized to zero

private static double side1  = 0;
private static double side2 = 0;
private static double side3 = 0;


public ATriangle()//no-arg constructor
{
	side1 = 1;
	side2 = 1.5;
	side3 = 1;	
}

//various accessors and mutators 
double getSide1(){
	return side1;
}
double getSide2(){
	return side2;
}
double getSide3(){
	return side3;
}
public double calculateArea(){
	

return (height*(side2/2));
}
public double calculatePerimeter(){
	
	double perimeter = (side1+side2+side3);
	return perimeter;
}

}
