package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

	public static void main(String[] args) {
		//initialize values we know
		int quota =10;
		//Get unknown data
		System.out.println("How many sales did the employee make this week?");
		Scanner scanner = new Scanner(System.in);
		int sales =scanner.nextInt();
		scanner.close();
		
		//Make the decision on the path to take Output
		if(sales>=quota) 
			System.out.println("Congratz you've met your quota"); //If only one statement no need curly bracket
			
		else {
			int salesShort = quota-sales;//Calculation how many quota short
			System.out.println("You did not meet your quota, You were " +salesShort+" sales short");
		}
	}
}
