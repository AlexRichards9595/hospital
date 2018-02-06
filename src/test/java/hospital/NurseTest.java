package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NurseTest {
	
	
	Nurse underTest = new Nurse("3333", "Jackie");

	@Test
	public void shouldHaveASalary() {
		Employee underTest = new Nurse("3333", "Jackie");

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
		Bleedable patient = new BleedableDouble();

		underTest.drawBlood(patient);

		Assert.assertTrue(wasBled);
	}

	@Test
	public void shouldIncreasePatientHealth() {
		Patient patient = new Patient();

		int healthBefore = patient.getHealth();
		underTest.administerCare(patient);
		int healthAfter = patient.getHealth();

		assertEquals(healthAfter - healthBefore, 5);
	}
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals("3333", check);
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals("Jackie", check);
	}

}
