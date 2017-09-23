package bai1_equals_hashcode;

public class Employee {
	public int employeeId;
	public String firstName, lastName;
	public int yearStarted;
	
	@Override
	public int hashCode() {
		return employeeId;
	}
	
	//Overload
	public boolean equals(Employee obj) {
		return this.employeeId == obj.employeeId;
	}
	
	public static void main(String argn[]) {
		Employee one = new Employee();
		one.employeeId = 101;
		
		Employee two = new Employee();
		two.employeeId = 101;
		
		if(one.equals(two)) {
			System.out.println("Giống!");
		}else {
			System.out.println("Khác!");
		}
	}
}
