package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket2 {

	//constant variable
	private static final int LENGTH =6;
	private static final int MAX_TICKET_NUMBER = 69;
	public static void main(String[] args){
		int [] ticket = generateNumbers();//this will return tickt array of values
		Arrays.sort(ticket);
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
			int randomNumber;
			 /*
		    Generate random number then search to make sure it doesn't
		    already exist in the array. If it does, regenerate and search again.
		    */
			do {
			randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
			}
			/*
			 *  keep looping until it finds a number that is not already inside of the array. So search() should return a true or false. 
			 *  True if it actually finds the number in the array, meaning it's a duplicate. And so, we'll loop until it's not a duplicate.
			 */
			while(search(ticket,randomNumber)); {

	            //Number is unique if we get here. Add it to the array.
	            ticket[i] = randomNumber;
			
			} ;
		}
		return ticket;
		
		
	}
	/**
	 * Does a sequential search on the array to find a value
	 * 
	 * @param array Array to search through
	 * @param numberSearchFor Value to search for
	 * @return true if found, false if not
	 * 
	 */
	
		
	public static boolean search(int[] array,int numberSearchFor) {
		
		/*
		This is called an enhanced loop.
		It iterates through 'array' and
		each time assigns the current element to 'value'
		*/
		
		for(int value:array) {
			
			if(value == numberSearchFor) {
				return true;
			}
			
		}
		/*
	    If we've reached this point, then the entire array was searched
	    and the value was not found
	    */
		return false;
	}
	
	
	/*
	//Binary search
	public static boolean binarySearch(int[] array, int numberToSearchFor){
		//Array must be sorted first
		   Arrays.sort(array);
		   
		   int index =Arrays.binarySearch(array, numberToSearchFor);
		   if(index >= 0){
			    return true;
			}
			else return false;
	}*/

}
