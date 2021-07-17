package chapter5;

import java.util.Scanner;

public class InstantCreaditCheck {
	
	//These are global variables now
	       //initialize what we know
			static int requiredSalary=25000;
			static int requiredCreditScore =700;
			 static Scanner scanner = new Scanner(System.in);
			 
			//Get we don's know
	
	public static void main(String[] args) {
				
		double s = getSalary();
		int c= getCreditScore();
		//These are arguments , which are not need to equal to parameter name
		boolean qualified=isQulified(c,s);
		notifyUser(qualified);
		scanner.close();	
	}
	
	//Get salary
	public static double getSalary() {
		System.out.println("Enter your salary:");
		double salary= scanner.nextDouble();
		return salary;
	}
	//Get Credit score
	public static int getCreditScore() {
		System.out.println("Enter your Creadit Score:");
		int creditScore=scanner.nextInt();
		return creditScore;
	}
	//This c corresponds to this cScore — meaning, whatever value is in c is now being stored inside of cScore.
	//Whatever is inside of s will be stored inside of salary.
	public static boolean isQulified(int cScore,double salary) {
		
		if(cScore>=requiredCreditScore && salary>=requiredSalary) {
			return true;
		}
		
		else
			return false;
	} 
	public static void notifyUser(boolean isQulified) {
		 if (isQulified) {
			 System.out.println("Congratz you have been approved!");
		 }
		 else
			 System.out.println("Sorry. you have been declined!");
	}
	
}
