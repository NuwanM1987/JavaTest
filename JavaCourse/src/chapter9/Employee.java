package chapter9;

public class Employee extends Person{

	private String employeeId;
	private String title;
	
	public Employee() {
		super("nuwan");
		System.out.println("This is employee default constructor");
	}

	public void setemployeeId(String employeeId) {
		this.employeeId =employeeId;
	}
	
	public String getemployeeId() {
		return employeeId;
	}
	
	public void settitle(String title) {
		this.title =title;
	}
	
	public String gettitle() {
		return title;
	}
	
	
}
