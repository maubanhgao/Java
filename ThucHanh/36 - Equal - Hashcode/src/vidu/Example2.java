package vidu;

class Employee {
	protected long employeeID;;
	protected String firstName;
	protected String lastName;

	public Employee(long employeeID, String firstName, String lastName) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!(o instanceof Employee))
			return false;

		Employee other = (Employee) o;
		return this.employeeID == other.employeeID;
	}
}

public class Example2 {

	public static void main(String[] args) {
		Example2 ex = new Example2();
		Employee em = new Employee(123, "nguyen", "nguyen");
		System.out.println(em.equals(new Employee(123, "nguyen", "nguyen")));
		System.out.println(ex.equals(new Employee(123, "nguyen", "nguyen")));
	}

}
