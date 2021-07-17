package chapter3;

import java.util.Scanner;

public class LoanQulifier {
//nested if
	
	public static void main(String[] args) {
		
		
		int requiredSalary = 30000;
		int requiredYeasrEmployed=2;
		
		System.out.println("Enter your salary:");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("Enter the number of years with your current employee:");
		int numOfYears=scanner.nextInt();
		
		scanner.close();
		
		if(salary>requiredSalary)
		{
			if(numOfYears>requiredYeasrEmployed) 
			{
					System.out.println("Congratz, You qualify for the loan.");
			}
			else 
			{
				System.out.println("Sorry. You must worked at your current job"+requiredYeasrEmployed+"years");
			}
			
		}
		else
		{
			System.out.println("Sorry you must have "+requiredSalary+" and You must worked at your current job "+
		requiredYeasrEmployed+" years for qualify for the loan");
		}
	}
}
