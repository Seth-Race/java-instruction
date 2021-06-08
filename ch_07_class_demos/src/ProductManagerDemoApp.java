
public class ProductManagerDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager");
		
		//p.225
		// create Products
		//use empty constructor
		Product p1 = new Product();
		p1.setCode("Java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(57.50);
		
		//fully loaded constructor
		Product p2 = new Product("andr", "Murach's Android Programming", 59.50);
		
		
		Product p3 = new Product("andr", "Murach's Android Programming", 59.50);
		Product p4 = p1;

//		printProduct(p1);
//		printProduct(p2);
//		printProduct(p3);
//		printProduct(p4);
		

		
		
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		
		
		
		
		
		System.out.println("Goodbye.");

	}
	
	private static void printProduct(Product p) {
		System.out.println();
		System.out.println("Product Detail:");
		System.out.println("Code: " +p.getCode());
		System.out.println("Description: " +p.getDescription());
		System.out.println("Price: " +p.getPrice());
		
	}

	
}
