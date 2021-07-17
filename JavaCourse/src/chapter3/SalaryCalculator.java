package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		//Intialize the known values
		int salary =1000;
		int bonus=300;
		int quota =10;
		//Get the values for the unknown
		System.out.println("How many sales did the employee make this week");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		
		scanner.close();
		
		if(sales>quota) {
			//memory location
			    salary       =  salary+bonus;
			
		}
		
		System.out.println("The employee pay is  "+salary);
				
	}
}
