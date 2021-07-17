package chapter7;

import java.util.Random;

public class LotteryTicket {

	//constant variable
	private static final int LENGTH =6;
	private static final int MAX_TICKET_NUMBER = 69;
	public static void main(String[] args){
		int [] ticket = generateNumbers();//this will return tickt array of values
		printTicket(ticket);
    }
	
	//Read the array
	public static void printTicket(int[]ticket1){
		for(int i=0; i<LENGTH; i++){
	        System.out.print(ticket1[i] + " | ");
	    }
	}
	
	public static int[] generateNumbers() {
		
		int[] ticket = new int[LENGTH];
		//generate random numbrs
		Random random = new Random();
		//generate a random number and then I can assign it to one of the elements in the ticket array
		//use loop since same thing need to to 6 times
		for (int i=0;i<LENGTH;i++) {
			//we'll use the one with the bound, since our numbers have to be between 1 and 69.
			ticket[i]=random.nextInt(MAX_TICKET_NUMBER)+1;
		}
		return ticket;
	}
}
