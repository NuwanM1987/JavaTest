package chapter10;

public class Zoo {
	
	public static void main(String[] args) {
	Dog rocky = new Dog();
	rocky.makeSound();
	rocky.fetch();
	
	
	Animal sasha = new Dog();
	sasha.makeSound();//this will print the override methods value
	feed(sasha);
	
	sasha= new Cat();
	sasha.makeSound();
	((Cat) sasha).scratch(); // type casting, here shasha type is Animal
	feed(sasha);
		
		
	}
	public static void feed(Animal animal) {
		
		if(animal instanceof Dog) {
			System.out.println("here's your dog food");
		}
		else if(animal instanceof Cat) {
			System.out.println("here's your cat food");
		}
	}
}
