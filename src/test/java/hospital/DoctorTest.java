package hospital;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1111", "Phil", "Brain");

	@Test
	public void shouldDrawBlood() {
		Patient patient = new Patient();

		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);

		int bloodsAfter = patient.getBloods();

		assertThat(bloodsBefore - bloodsAfter, is(1));
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
	public void shouldHaveSalary() {
		Employee underTest = new Doctor("1111", "Phil", "Brain");

		int salary = underTest.getSalary();

		assertThat(salary, is(90000));
	}

	@Test
	public void shouldIncreasePatientHealth() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertThat(healthAfter - healthBefore, is(10));
	}

	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertThat(check, is("1111"));
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertThat(check, is("Phil"));
	}

	@Test
	public void shouldReturnSpecialty() {
		String check = underTest.getSpecialty();
		assertThat(check, is("Brian"));

	}

}
