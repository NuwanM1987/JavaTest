package chapter8;

public class convertDecimalToInt {
	
	public static void main(String[] args) {
		convertDecimalToInt();
	}

	public static void convertDecimalToInt() {
		
		double [] numbers = {12.44,56.55,7,78.90};
		
		for(Double number:numbers) {
			System.out.println(number.intValue());
		}
	}
}
