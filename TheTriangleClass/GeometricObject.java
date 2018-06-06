
public class GeometricObject {//parent class
	//various protected variables
	protected static String color = " ";
	protected static boolean filled = false;
	protected double area;
	protected double perimeter;
	protected double height;

//accessors and mutators
void setColor(String color){
	
	
	this.color=color;
}

String getColor(){
	
	return color;
}

void setFilled(boolean filled){
	this.filled=filled;
}

boolean getFilled(){
	return filled;
}

void setPerimeter(double perimeter){
	
	this.perimeter=perimeter;
}




void setArea(double area){
	this.area=area;
}

void setHeight(double height){
	
	this.height=height;
}
double getHeight(){
	return height;
}



}