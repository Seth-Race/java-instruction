
public class ProductManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Product Manager App.");
		
		
		Book b = new Book("java", "Murach's Java Programming", 57.50, "Joel Murach");
		Software s = new Software("netbeans", "NetBeans", 0, "8.2");
		
		
		
		System.out.println(b);
		System.out.println(s);
			
		
		
		Product p = b;
		System.out.println("p toString: " +p);
		
		
		System.out.println("Thank you for using the Product Manager App.");

	}

}
