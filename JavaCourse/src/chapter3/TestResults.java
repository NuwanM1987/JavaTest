package chapter3;

import java.util.Scanner;

public class TestResults {

	public static void main(String [] args) {
		
		
		//Get the test results
		System.out.println("Enter your test results:");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();
		
		//Determine the letter grade
		char grade;
		
		if(score<60) {
			grade='F';
		}
		else if(score<70) {
			grade='D';

		}
		else if(score<80) {
			grade='c';

		}
		else if(score<90) {
			grade='B';

		}
		else {
			grade='A';
		}
		System.out.println("Your grade is :"+grade);
	}
}
