class Doctor {
	public void details() {
		System.out.println("Doctor without any specialization");
	}
}

class Dentist extends Doctor {
	public void details() {
		System.out.println("Doctor with specialization: Dentist ");
	}
}

public class OverrideTest {
	public static void main (String [] args) {
		Doctor d = new Doctor();
		Doctor b = new Dentist(); //Doctor ref, but a Dentist object
		d.details(); // Runs the Doctor version 
		b.details(); // Runs the Dentist version 
	}
} 
