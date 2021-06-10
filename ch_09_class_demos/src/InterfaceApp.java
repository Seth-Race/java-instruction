
public class InterfaceApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Book b1 = new Book("Java", "Murach's Java Programming", 57.5, "Joel Murach");
		
		
		System.out.println(b1); // calls toString
		printIt(b1);
		// cloneable p.316
		Book b2 = (Book)b1.clone();
		printIt(b2);
		
		
	}

	private static void printIt(Printable p) {
		p.print();
	}
	
	
	
}
