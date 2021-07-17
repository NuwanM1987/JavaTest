package chapter3;

import java.util.Scanner;

public class Excersice1 {

	public static void main(String[] args) {

		double penny = .01;
		double nickel = .05;
		double dime = .10;
		double quarter = .25;
		int dollar = 1;
	
		System.out.println(
				"Welcome to 'Change for a Dollar'! " + "Your goal is to enter enough change to make exactly $1.00");
		Scanner scanner = new Scanner(System.in);
		System.out.println("how many pennies would you like?");
		double numofpenny = scanner.nextDouble();
		System.out.println("How many nickels would you like?");
		double numofnickel = scanner.nextDouble();
		System.out.println("How many dimes?");
		double numofdime = scanner.nextDouble();
		System.out.println("how many quarters?");
		double numofquarter = scanner.nextDouble();

		scanner.close();
		
		double total = numofpenny*penny+numofnickel*nickel+numofdime*dime+numofquarter*quarter;
		
		if(total<dollar)
		{
			 double amountShort = dollar - total;
			//Way to make the decimal print with only 2 decimal places
			 System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
			
		}
		else if(total>dollar)
		{
			double amountOver=total-dollar;
			//Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
		}
		else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }

	}
}
