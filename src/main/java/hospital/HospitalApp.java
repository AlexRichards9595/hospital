package hospital;

public class HospitalApp {

	public static void main(String[] args) {

		Doctor phil = new Doctor("1111", "Phil", "Brain");
		Surgeon harry = new Surgeon("2222", "Harry", "Brain", true);
		Nurse jackie = new Nurse("3333", "Jackie");
		Janitor rosie = new Janitor("4444", "Rosie");

		Hospital hospital = new Hospital();
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(rosie);
		
		hospital.showPayRates();
		
		System.out.println();
		
		hospital.showAllMedicalPersonnel();

	}

}
