package chapter9;

public class InheritanceTester {

	public static void main(String[] args) {
		//Person person = new Person();
		Employee employee = new Employee();
		employee.setAge(34);
		System.out.println(employee.getAge());
		
		Rectangle rec = new Rectangle();
		rec.setLength(23.33);
		rec.setWidth(3.89);
		System.out.println(rec.calculatePerimeter());
		rec.print();
		
		Square sq = new Square();
		sq.setLength(2.90);
		System.out.println(sq.calculatePerimeter());
		sq.print();
		sq.print("nuwa");
	}
}
