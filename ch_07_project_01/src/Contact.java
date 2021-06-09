
public class Contact {
private String fName;
private String lName;
private String email;
private String phoneNumber;




public Contact(String fName, String lName, String email, String phoneNumber) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.email = email;
	this.phoneNumber = phoneNumber;
}


@Override
public String toString() {
	return "Contact [fName=" + fName + ", lName=" + lName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}






}