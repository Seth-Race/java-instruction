package ui;

import com.util.Console;

import business.User;
import business.Vendor;
import db.VendorDB;
import db.UserDB;
import interfaces.DAO;

public class PRSManagerApp {
	private static final String USER_NOT_FOUND = "No user found for id:";
	private static final String VENDOR_NOT_FOUND = "No vendor found for id:";

	private static DAO<User> UsersDAO = new UserDB();
	private static DAO<Vendor> VendorsDAO = new VendorDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the Purchase Request System!");
		System.out.println();
		
		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Please enter command:   ");
			
			switch(command) {

			
			case 1:
				System.out.println();
				System.out.println("Displaying All Users");
				System.out.println("====================");
				for (User user : UsersDAO.getAll()) {
					System.out.println(user);
				}
				System.out.println();
				break; 
			case 2:
				System.out.println();
				System.out.println("Displaying User by ID");
				System.out.println("======================");
				int id = Console.getInt("Enter User ID:   ");
				User user = UsersDAO.get(id);
				if (user != null) {
					System.out.println("User found!");
					System.out.println(user);
					System.out.println();
				} else {
					System.out.println(USER_NOT_FOUND + id);
				}
				break;
			case 3:
				System.out.println("Adding a User");
				System.out.println("=============");
				// id = Console.getInt("ID: ");
				String username = Console.getLine("Username:   ");
				String password = Console.getString("Password:   ");
				String firstName = Console.getString("First Name:   ");
				String lastName = Console.getString("Last Name:   ");
				String phone = Console.getString("Phone Number (XXX-XXX-XXXX):   ");
				String email = Console.getString("Email:   ");
				int reviewer = Console.getInt("Reviewer? 1= yes, 0 = no:   ");
				int admin = Console.getInt("Admin? 1= yes, 0 = no:   ");
				if (UsersDAO.add(new User(username, password, firstName, lastName, phone, email, reviewer, admin))) {
					System.out.println("User Added.");
					System.out.println();
				} else {
					System.out.println("Error Adding User");
				}
				break;
			case 4:
				//Not yet implemented
				break;
			case 5:
				System.out.println("Delete User");
				System.out.println("===========");
				id = Console.getInt("ID:   ");
				user = UsersDAO.get(id);
				if (user != null) {
					UsersDAO.delete(user);
					System.out.println("Deleted " + user);
				} else {
					System.out.println(USER_NOT_FOUND + id);
				}
				break;
			case 6:
				System.out.println("Clearing User File");
				System.out.println("==================");
				UsersDAO.clear();
				System.out.println();
				break;
			case 99:
				//exit application.
				break;
			default:
				System.out.println("Invalid entry. Please try again");
				break;
		
		
			}
		
			}
			
		
		
		
		System.out.println("Thank you for using the Purchase Request System!");
	}
		
		

	private static void displayMenu() {
		System.out.println();
		System.out.println("COMMAND MENU:");
		System.out.println("===================");
		System.out.println("1 - List all Users");
		System.out.println("2 - Get a User by ID");
		System.out.println("3 - Add new User");
		System.out.println("4 - Update a User");
		System.out.println("5 - Delete a User");
		System.out.println("6 - Clear entire file");
		System.out.println();

	}

}
