
public class Product {

	// PoJo(Plain old Java object/JavaBean/Business Class p.217
	// 1) Create instance variables
	// 2) Generate/create constructors
	// 3) Generate/create getters and setters
	// 4) OPTIONAL - toString()

	private String code;
	private String description;
	private double price;

	// default/empty constructor
	public Product() {
		// by default Java sets primitive numeric types to 0 and String types to null.

	}

	// fully loaded constructor
	public Product(String code, String description, double price) {
		super();
		this.code = code;
		this.description = description;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	@Override
	public String toString() {
		return description;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		boolean sameData = false;
		if (obj instanceof Product) {
			Product p = (Product)obj;
		if (p.getCode().equals(code)) {
			sameData = true;
			}
		}
		
		return sameData;
	}
	
	
}
