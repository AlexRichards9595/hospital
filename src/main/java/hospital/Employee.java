package hospital;

public abstract class Employee {
	protected String empNumber;
	protected String empName;

	public abstract int getSalary();

	public String getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}
	
	@Override
	public String toString() {
		return empName;
	}

}
