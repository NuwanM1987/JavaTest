package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		Set <String   >fruit = new HashSet();
		fruit.add("Orange");
		fruit.add("Banana");
		fruit.add("Apple");
		fruit.add("lemon");
		fruit.add("Apple");
		//System.out.println(fruit.size());
	//	System.out.println(fruit);
		System.out.println("*************** Ways to loop through the collection ********************************");

		System.out.println("*************** Iterator ********************************");
		Iterator i = fruit.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("*************** Enhanced for loop ********************************");
		
		for(String item:fruit)
			System.out.println(item);
			
		System.out.println("******************* Foreach *******************************");
		
		fruit.forEach(x->System.out.println(x));
		System.out.println("******************* Foreach 2nd way *******************************");
		fruit.forEach(System.out::println);
		
		
		System.out.println("*************** Iterator ********************************");

		List fruit1 = new ArrayList();
		fruit1.add("Orange");
		fruit1.add("Banana");
		fruit1.add("Apple");
		fruit1.add("lemon");
		fruit1.add("Apple");
		System.out.println(fruit1.size());
		System.out.println(fruit1.get(2));
		System.out.println(fruit1);
		
		System.out.println("**************************************************************");
		
		Queue fruit2 = new LinkedList();
		fruit2.add("Orange");
		fruit2.add("Banana");
		fruit2.add("Apple");
		fruit2.add("lemon");
		fruit2.add("Apple");
		System.out.println(fruit2.size());
		System.out.println(fruit2.peek());
		System.out.println(fruit2);
		fruit2.remove();
		System.out.println(fruit2);
		System.out.println("*****************Hash Map*******************************");
		
		Map <String,Integer> fruitCalories = new HashMap();
		fruitCalories.put("apple", 95);
		fruitCalories.put("Orange", 195);
		fruitCalories.put("apple", 35);
		fruitCalories.put("lemon", 495);
		fruitCalories.put("Banana", 55);
		
		//System.out.println(fruitCalories.size());
		//System.out.println(fruitCalories);
		//System.out.println(fruitCalories.get("lemon"));
		System.out.println("*****************Hash Map values using enhanced for loop*******************************");
		for(Entry entry:fruitCalories.entrySet()) {
			System.out.println(entry.getValue());
			
		}
		
		System.out.println("*****************Hash Map values using for each*******************************");
		
		fruitCalories.forEach((k,v)->System.out.println("Fruit:"+k+",Calories"+v));
	}
	

}
