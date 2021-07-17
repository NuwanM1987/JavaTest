package chapter4;

import java.util.Scanner;

public class LetterSearch {
	

public static void main(String[] args) {
		
	System.out.println("Enter the text");
	Scanner scanner = new Scanner(System.in);
	String text = scanner.next();
	scanner.close();
	boolean letterFound=false;
	//Search letter A in text
	for(int i=0;!letterFound&&i<text.length();i++) {
		char currentletter = text.charAt(i);
			letterFound=true;
			//break;
		}
		
	
	if(letterFound) {
		System.out.println("This contains the letter A");
	}
	else {
		System.out.println("This does not contain the letter A");
	}

		
	
}
}