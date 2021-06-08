
public class Actor {

	private int id;
	private String fName;
	private String lName;
	private String gender;
	
	
	
	public Actor(int id, String fName, String lName, String gender) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "BmdbActor [id=" + id + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender + "]";
	}
	
	
	
	
}
