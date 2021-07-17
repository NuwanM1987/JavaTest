package chapter4;

import java.util.Scanner;

public class GrossPayInputvalidation {
	public static void main(String[] args) {
		
		int rate =15;
		int maxHours =40;
		System.out.println("how many hours did you work in this week?");
		Scanner scanner = new Scanner(System.in);
		double hoursWorked =scanner.nextDouble();
		
		//validate input
		while(hoursWorked>maxHours ||hoursWorked<1 ) {
			System.out.println("Invalid. You must work between 1-40.");
			hoursWorked =scanner.nextDouble();
		}
		scanner.close();
		//calculate the gross
		double gross=rate*hoursWorked;
		System.out.println("Gross Pay is:"+gross);
	}

}
