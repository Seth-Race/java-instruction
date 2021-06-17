package ui;

import com.util.Console;

import business.Item;
import interfaces.DAO;
import text.ItemTextFile;

public class ItemManagerApp {
	private static final String ITEM_NOT_FOUND = "No item found for ID: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Item Management app. Text file version.");
		System.out.println();
		
		//creating instance of ItemTextFile - should create file if doesn't exist on first run.
		DAO<Item> itemsDAO = new ItemTextFile();
		
		
		int command = 0;
	while (command != 9) {
		displayMenu();
		command = Console.getInt("Please enter a command.   ");
		System.out.println();
		
		switch(command) {
		case 1:
			//get all
			System.out.println("Get all Items");
			System.out.println("=============");
			for (Item item: itemsDAO.getAll()) {
				System.out.println(item);
			}
			break;
		case 2:
			//get item by ID
			System.out.println("Get Item by ID");
			System.out.println("==============");
			int id = Console.getInt("ID:   ");
			Item item = itemsDAO.get(id);
			if (item != null) {
				System.out.println("Item found: " +item);
			}
			else {
				System.out.println(ITEM_NOT_FOUND +id);
			}
			break;
		case 3:
			//add item
			System.out.println("Add an Item");
			System.out.println("===========");
			id = Console.getInt("ID:  ");
			String desc = Console.getLine("Description:   ");
			if (itemsDAO.add(new Item(id, desc))) {
				System.out.println("Item added");
				System.out.println();
			}
			else {
				System.out.println("Error adding item.");
			}
			break;
		case 4:
			//update item
			System.out.println("Update an Item");
			System.out.println("==============");
			id = Console.getInt("ID:   ");
			item = itemsDAO.get(id);
			if (item != null) {
				String newDesc = Console.getLine("Enter new description:   ");
				item.setDescription(newDesc);
				itemsDAO.update(item);
				System.out.println("Item Updated");
			}
			else {
				System.out.println(ITEM_NOT_FOUND +id);
			}
			
			break;
		case 5:
			// delete item
			System.out.println("Delete an Item");
			System.out.println("==============");
			id = Console.getInt("ID:   ");
			item = itemsDAO.get(id);
			if (item != null) {
				itemsDAO.delete(item);
				System.out.println("Item Deleted " +item);
			}
			else {
				System.out.println(ITEM_NOT_FOUND +id);
			}
			
			break;
		case 9:
			//exit
			break;
		default:
			System.out.println("Invalid command. Please try again.");
			break;
		}
		
		
		
		
		
		
		
		
	}
		System.out.println("Thank you for using this application. Goodbye");
	}
	
	private static void displayMenu() {
			System.out.println("COMMAND MENU:");
			System.out.println("==================");
			System.out.println("1 - List all items");
			System.out.println("2 - Get an item");
			System.out.println("3 - Add new item");
			System.out.println("4 - Update an item");
			System.out.println("5 - Delete an item");
			System.out.println("9 - Exit");
			System.out.println();
		}

	
}
