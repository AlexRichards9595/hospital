package hospital;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class HospitalTest {

	@Test
	public void shouldBeAbleToAddEmployee() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("","","");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();
		
		assertEquals(doctor, check);
		}
	@Test
	public void shouldBeAbleToAddTwoEmployees() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor ("","","");
		Nurse nurse = new Nurse ("", "");
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();
		
		Assert.assertThat(check, Matcher.contains(doctor, nurse));
		
	}

}
