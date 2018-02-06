package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse underTest = new Nurse("3333", "Jackie");

	@Test
	public void shouldHaveASalary() {
		Employee underTest = new Nurse("3333", "Jackie");

		int salary = underTest.getSalary();

		assertThat(salary, is(50000));
	}

	boolean wasBled = false;

	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled = true;
		}
	}

	@Test
	public void shouldDrawBloodFromTestDouble() {
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		assertThat(wasBled, is(true));
	}

	@Test
	public void shouldIncreasePatientHealth() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertThat(healthAfter - healthBefore, is(5));
	}

	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertThat(check, is("3333"));
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertThat(check, is("Jackie"));
	}

}
