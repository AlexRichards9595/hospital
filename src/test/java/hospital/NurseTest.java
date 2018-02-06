package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class NurseTest {

	@Test
	public void shouldHaveASalary() {
		Employee underTest = new Nurse();

		int salary = underTest.getSalary();

		assertEquals(50000, salary);
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
		Nurse underTest = new Nurse();
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		Assert.assertTrue(wasBled);
	}

	@Test
	public void shouldIncreasePatientHealth() {
		Nurse underTest = new Nurse();
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertEquals(healthAfter - healthBefore, 5);
	}
}
