package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1111", "Phil");

	@Test
	public void shouldDrawBlood() {
		Patient patient = new Patient();

		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);

		int bloodsAfter = patient.getBloods();

		Assert.assertEquals(bloodsBefore - bloodsAfter, 1);
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

		Assert.assertTrue(wasBled);
	}

	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Doctor("1111", "Phil");

		int salary = underTest.getSalary();

		assertEquals(90000, salary);
	}

	@Test
	public void shouldIncreasePatientHealth() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertEquals(healthAfter - healthBefore, 10);
	}

	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals("1111", check);
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals("Phil", check);
	}

}
