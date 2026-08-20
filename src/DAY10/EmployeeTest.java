package DAY10;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp2=new Employee();
		emp.setName("kiran");
		emp.setDepartment("java");
		emp.setID(0);
		emp.setSalary(20000);
		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getID());
		System.out.println(emp.getSalary());
		emp2.setName("raj");
		emp2.setDepartment("python");
		emp2.setID(1);
		emp2.setSalary(2003400);
		System.out.println(emp2.getName());
		System.out.println(emp2.getDepartment());
		System.out.println(emp2.getID());
		System.out.println(emp2.getSalary());
	}

}
