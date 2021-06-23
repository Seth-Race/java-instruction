package business;

public class Product {

	private int id;
	private int vendorID;
	private String partNumber;
	private String name;
	private double price;
	private String unit;
	
	
	public Product(int id, int vendorID, String partNumber, String name, double price, String unit) {
		super();
		this.id = id;
		this.vendorID = vendorID;
		this.partNumber = partNumber;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}


	public Product() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getVendorID() {
		return vendorID;
	}


	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", vendorID=" + vendorID + ", partNumber=" + partNumber + ", name=" + name
				+ ", price=" + price + ", unit=" + unit + "]";
	}



	
	
}
