
public class Employee extends Person {

	private String ssn;


// concerned about constructor

	public String getSsn() {
		return ssn;
	}

	public Employee(String fName, String lName, String ssn) {
		super(fName, lName);
		this.ssn = ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSSN:          XXX-XX-" + getLast4();
	}

	
	private String getLast4() {
		String last4 = ssn.substring(7);
		
		return last4;
	}
	
}
