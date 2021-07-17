package chapter9;

public class Person {

	private String name;
	private int age;
	private String gender;
	
	public Person(){
		System.out.println("This is Person's default constructor");
		
	}

	public Person(String name){
		System.out.println("This is Person's specific constructor:name is set");
		
	}
	public void setName(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(String gender) {
		this.gender =gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	
}
