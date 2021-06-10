import com.util.Console;

public class PersonManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Person Manager");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		String core = Console.getString("Create customer or employee?", "c", "e");
		//continue from here

		
		if (core.equalsIgnoreCase("e")) {
			String fName = Console.getString("First Name:        ", true);
			String lName = Console.getString("Enter Last Name:   ", true);
			String ssn = Console.getString("SSN (XXX-XX-XXXX):   ", true);

			Employee e1 = new Employee(fName, lName, ssn);
			System.out.println("You have entered a new Employee:");
			System.out.println();
			System.out.println(e1);
				}
		
		
		else {
			String fName = Console.getString("First Name:              ", true);
			String lName = Console.getString("Enter Last Name:         ", true);
			String custNum = Console.getString("Enter Customer Number:   ", true);
			
			Customer c1 = new Customer(fName, lName, custNum);
			System.out.println("You have entered a new Customer:");
			System.out.println();
			System.out.println(c1);
				}
		
		
		
		System.out.println();
		choice = Console.getString("Add another?   ", "y", "n");
		
		}
		System.out.println();
		System.out.println("Thanks for using the Person Manager");
	}

}
