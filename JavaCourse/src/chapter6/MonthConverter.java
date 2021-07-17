package chapter6;

public class MonthConverter {
	 public static void main(String args[]){
		 //because methods are static they do not need to create objects
		 System.out.println(Month.getMonth(2));
	        System.out.println(Month.getMonth("January"));
	 }
}
