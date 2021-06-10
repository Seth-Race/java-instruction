
public class Customer extends Person {
	
	private String custNum;

//Unsure on constructor setup





	public String getCustNum() {
		return custNum;
	}


	public Customer(String fName, String lName, String custNum) {
		super(fName, lName);
		this.custNum = custNum;
	}


	public void setCustNum(String custNum) {
		this.custNum = custNum;
	}


	@Override
	public String toString() {
		return super.toString()+ "\nCustomer Number:  " +custNum;
	}
	
	
	
}
