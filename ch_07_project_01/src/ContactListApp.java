
public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List App");
		
		String fName = Console.getString("Please enter First Name:  ");
		String lName = Console.getString("Please enter Last Name:   ");
		String email = Console.getString("Please enter E-Mail:      ");
		String phoneNumber = Console.getString("Please enter Phone Number:");
		
		
		
		Contact c1 = new Contact(fName, lName, email, phoneNumber);
		contactSummary(c1);
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Thanks for using the Contact List App!");
	}

	
	private static void contactSummary(Contact c) {
		System.out.println();
System.out.println("*---------------------------------------------*");
		System.out.println("Current Contact:");
		System.out.println("Name:     " +c.getfName()+ " " +c.getlName());
		System.out.println("Title:    " +c.getEmail());
		System.out.println("Year:     " +c.getPhoneNumber());
System.out.println("*---------------------------------------------*");
	}
	
}
