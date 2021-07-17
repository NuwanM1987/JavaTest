package chapter6;

public class Rectangle {

	
	private double length;
	private double width;
	
	//Defauld constr used to assign default values
	public Rectangle() {
		length = 0;
	    width = 0;
	}
	//Create constructor with parameters
	public Rectangle(double length, double width) {
		this.length=length; ////can be set this way
		setWidth(width); //or can be set this way. these are only different here to demo alternative options
	}
	double calculatePerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public double calculateArea() {
		return length*width;
	}
	
	public double getLength() {
		return length;
	}
	
	//this.length refer the length variable in the class
	public void setLength(double lengthnew) {
		this.length=lengthnew;
		
	}
	
	public double getWidth() {
		return length;
	}
	
	//this.length refer the length variable in the class
	public void setWidth(double width) {
		this.width=width;
		
	}
	
	
	
	
}
