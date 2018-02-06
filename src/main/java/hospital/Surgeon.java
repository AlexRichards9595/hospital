package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public Surgeon(String empNumber, String empName, String specialty, boolean isOperating) {
		super(empNumber, empName, specialty);
		this.isOperating = isOperating;
	}

	public boolean getIsOperating() {
		return isOperating;
	}

}
