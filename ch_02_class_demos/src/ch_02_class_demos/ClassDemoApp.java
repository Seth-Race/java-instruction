package ch_02_class_demos;

public class ClassDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome");

		
		// p.39 in book
		// single line comment
		
		/*
		 * this is a multi-line comment
		 * it goes on for a few lines
		 * just like this.
		 */
		
		// p.45
//		int counter = 1;
//		double unitPrice = 14.99;
//		
//		double d1 = 11.1;
//		double d2 = 25.44;
//		
//		counter = 2;
//		unitPrice = 13.99;
		

//
//		d2 = d1;
//		d1 = 7.99;
//		System.out.println(d1);
//		System.out.println(d2);
		
		int a = 5;
		double b = 8.3;
		
		//int sum = a+b;  <---invalid		
		
		int sum3 = a+(int)b; // casting. p.46
		System.out.println("Sum3 = "+sum3);
		
		
		// p.47 incrementing a counter
		
//		counter = 1;
//		// several ways to increment an int
//		counter = counter+1;
//		counter += 1;
//		counter ++;
//		System.out.println("Counter = "+counter);
		
		// p.48 Strings (STRING MUST BE CAPITALIZED)
//		
//		String fName = "Bob";
//		String mName = "Nesta";
//		String lName = "Marley";
//		String fullName = fName+ " " +mName+ " " +lName;
//		System.out.println(fullName);
//		
//		
		
		System.out.println("Goodbye");
		
	}

}
