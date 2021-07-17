package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
	
	public static void main(String[]args) {
		
		//1.get the num of hours worked
		System.out.println("Enter the number of hours the employee worked");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		//2.get the hourly pay rate
		System.out.println("Enter the employees pay rate");
		double rate = scanner.nextDouble();
		
		//3.Multiple hours and pay rate
		double grosspay = hours*rate;
		
		//4.Display results
		
		System.out.println("Gross pay is $"+grosspay);
		
		
	}

}
