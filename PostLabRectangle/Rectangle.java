
public class Rectangle {
	
//attributes
private static float length = 1;
private static float width = 1;
private float area;
private float perimeter;

//methods for main program
public static float calculateArea(){
	
	
float area = width*length;
return area;
	
	
}
public static float calculatePerimeter(){
	
	float perimeter = 2*(length+width);
	return perimeter;
}



void setWidth(float width){
	if(width>0.0 && width <20.0){
	this.width=width;
	}
	else{
	System.out.println("Invalid entry for width. Please try again.");
	}
	
}
float getWidth(){
	
	return width;
}
void setLength(float length){
	if(length>0.0 && length < 20.0){
	this.length=length;
	}
	else{
		System.out.println("Invalid entry for length. Please try again.");
	}
}

float getLength(){
	return length;
}

}
