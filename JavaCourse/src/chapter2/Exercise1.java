package chapter2;

import java.util.Scanner;

public class Exercise1 {

public static void main(String[]args) {

		System.out.println("Enter the season");
		Scanner scanner = new Scanner(System.in);
		String season = scanner.next();
		
		System.out.println("Enter the adjective");
		String adjective = scanner.next();
		
		System.out.println("Enter the whole number");
		int wnum = scanner.nextInt();
		
		System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + wnum +
                " cups of coffee.");
				
				
		
}
}