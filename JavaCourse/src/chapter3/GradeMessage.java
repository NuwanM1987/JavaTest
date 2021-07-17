package chapter3;

import java.util.Scanner;

public class GradeMessage {
	
	public static void main(String[] args) {
		
		
		//Get the test results
				System.out.println("Enter your test results:");
				Scanner scanner = new Scanner(System.in);
				String grade = scanner.next();
				scanner.close();
				String message;
				switch(grade) {
				
				case "A":
					message="Excellent job";
					break;
					
				case "B":
					message="Gret job";
					break;
		
				case "C":
					message="Good job";
					break;
					
				case "D":
					message="Need to work hard";
					break;
					
				case "F":
					message="Ohh noo";
					break;
				
				default:
					message="Error!";
					break;
				}
				System.out.println(message);
	}

}
