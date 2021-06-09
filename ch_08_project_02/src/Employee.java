
public class Employee extends Person {

		private String Ssn;

// concerned about constructor
		

		public Employee(String fName, String lName, String ssn) {
			super(fName, lName);
			Ssn = ssn;
		}

		public String getSsn() {
			return Ssn;
		}

		public void setSsn(String ssn) {
			Ssn = ssn;
		}

		@Override
		public String toString() {
			return super.toString()+ "\nSSN:   " + Ssn;
		}
	
	
}
