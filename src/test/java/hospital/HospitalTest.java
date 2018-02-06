package hospital;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void shouldBeAbleToAddEmployee() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("", "", "");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();

		assertThat(check, contains(doctor));
	}

	@Test
	public void shouldBeAbleToAddTwoEmployees() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("1", "Phil", "");
		Nurse nurse = new Nurse("2", "Jackie");
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();

		assertThat(check, containsInAnyOrder(doctor, nurse));
	}

	@Test
	public void shouldRemoveAnEmployee() {
		Hospital hospital = new Hospital();
		Doctor doctor = new Doctor("1111", "Phil", "");
		Nurse nurse = new Nurse("2222", "Jackie");
		hospital.addEmployee(nurse);
		hospital.addEmployee(doctor);
		hospital.removeEmployee("1111");
		Collection<Employee> check = hospital.getAllEmployees();
		assertThat(check, containsInAnyOrder(nurse));
	}

}
