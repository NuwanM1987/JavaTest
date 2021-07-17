package chapter4;

import java.util.Scanner;

public class AverageTestScores {

	public static void main(String[] args) {
		
		//initialize the what we know
		
		int numOfStudent=24;
		int numOfTest=4;
		Scanner scanner = new Scanner(System.in);
		//Process all students
		for(int i=0;i<numOfStudent;i++) {
			
			//Going through each tests
			double total=0;
			
			for(int j=0;j<numOfTest;j++) 
			{
				System.out.println("Enter the score for test#"+j+1);
				double score = scanner.nextDouble();
				
				total = total+score;
			}
			double average = total/numOfTest;
			System.out.println("The test average for student #" + (i+1) + " is " + average);
		}
		 scanner.close();
		
	}
}
