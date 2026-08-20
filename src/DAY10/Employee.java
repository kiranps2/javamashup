package DAY10;

public class Employee {
	private String Name;
	private int ID;
	private String Department ;
	private Double Salary ;
	public String getName() {
		return Name;
	}
	public int getID() {
		return ID;
	}
	public String getDepartment() {
		return Department;
	}
	public double getSalary() {
		return Salary;
	}
	public void setName(String n) {
		this.Name=n;
	}
	public void setID(int i) {
		this.ID=i;
	}
	public void setDepartment(String d) {
		this.Department=d;
	}
	public void setSalary(double s) {
		this.Salary=s;
	}
}
