package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
	
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]){
		
		HomeAreaCalculatorRedo homecalculator = new HomeAreaCalculatorRedo();
		Rectangle kitchen = homecalculator.getRoom();
		Rectangle bathroom = homecalculator.getRoom();
		
		double area= homecalculator.calculateTotalArea(kitchen, bathroom);
		System.out.println("The total area is: " + area);
		homecalculator.scanner.close();
		}
		
		
	

public Rectangle getRoom() {
	
	System.out.println("Enter the length of your room:");
	double length = scanner.nextDouble();
	
	System.out.println("Enter the width of your room:");
	double width = scanner.nextDouble();
	
	return new Rectangle(length, width);
}

public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
	
	return rectangle1.calculateArea() + rectangle2.calculateArea();
	
}

}