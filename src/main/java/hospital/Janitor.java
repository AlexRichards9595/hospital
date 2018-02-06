package hospital;

public class Janitor extends Employee {

	public Janitor(String empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}

	@Override
	public int getSalary() {
		return 40000;
	}
}
