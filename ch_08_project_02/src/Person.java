
public class Person {

	private String fName;
	private String lName;
	
	//seems set up okay, check over again
	
	public Person(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}



	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}



	@Override
	public String toString() {
		return "Name:         " +fName+ " " +lName;
	}
	
	
	
	
	
	
	
}
