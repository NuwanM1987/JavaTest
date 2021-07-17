package chapter9;

public class Rectangle {

	protected double length;
	protected double width;
	protected double sides = 4;

	public double getLength() {

		return length;
	}

	public void setLength(double Length) {
		this.length = Length;
	}

	public double getWidth() {

		return width;
	}

	public void setWidth(double Width) {
		this.width = Width;
	}

	public double getSides() {

		return sides;
	}

	public void setSides(double sides) {
		this.sides = sides;
	}
	
	public double calculatePerimeter() {
		return (2 * length) + (2 * width);
	}
	public void print(){
	    System.out.println("I am a rectangle");
	}
}
