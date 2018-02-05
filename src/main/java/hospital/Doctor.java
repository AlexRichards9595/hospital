package hospital;

public class Doctor {

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	public int getSalary() {
		return 0;
	}

}
