package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class DoctorTest {
	
	@Test
	public void shouldDrawBlood() {
		Doctor underTest = new Doctor();
		Patient patient = new Patient();
		
		int bloodsBefore = patient.getBloods();
		underTest.drawBlood(patient);
		
		int bloodsAfter = patient.getBloods();
		
		Assert.assertEquals(bloodsBefore-bloodsAfter, 1);
	}
	
	boolean wasBled = false;
	public class BleedableDouble implements Bleedable {
		@Override
		public void removeBlood(int amount) {
			wasBled=true;
		}
	}
	
	@Test
	public void shouldDrawBloodFromTestDouble() {
		Doctor underTest = new Doctor();
		Bleedable patient = new BleedableDouble();
		
		underTest.drawBlood(patient);
		
		Assert.assertTrue(wasBled);
	}
	@Test 
	public void shouldHaveSalary() {
		Doctor underTest = new Doctor();
		
		int salary = underTest.getSalary();
	}
	
	
	
	
	
	
}
