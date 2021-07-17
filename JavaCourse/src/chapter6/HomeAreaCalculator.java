package chapter6;

public class HomeAreaCalculator {

	public static void main(String args[]) {
		
		//Rectangel1
		
		
		Rectangle room1 = new Rectangle();
		room1.setLength(20);
		room1.setWidth(50);
		double Arearoom1= room1.calculateArea();
		
		//Rectangel2
		
		Rectangle room2 = new Rectangle(40,60);
		double Arearoom2=room2.calculateArea();
		
		
		double totalArea= Arearoom1+Arearoom2;
		System.out.println(totalArea);
	}
}
