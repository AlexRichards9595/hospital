package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PatientTest {

	@Test
	public void shouldBeAbleToRemoveBlood() {
		Patient patient = new Patient();

		patient.removeBlood(3);

		int currentBloods = patient.getBloods();

		assertEquals(currentBloods, 39);
	}

	@Test
	public void shouldBeAbleToAddHealth() {
		Patient patient = new Patient();

		patient.giveHealth(10);

		int currentHealth = patient.getHealth();

		assertEquals(Patient.DEFAULT_HEALTH + 10, currentHealth);
	}

}
