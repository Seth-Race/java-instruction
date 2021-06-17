package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

import business.Item;

public class ItemManagerApp {

	private static List<Item> items;
	private static final String ITEM_NOT_FOUND_MSG = "No item found for number: ";

	public static void main(String[] args) {
		// initialize items list and add some office items
		items = new ArrayList<>();
		items.add(new Item(1, "Laptop"));
		items.add(new Item(2, "Monitor"));
		items.add(new Item(3, "Mouse"));

		// implement CRUD functionality to allow a user to
		// maintain the list of items: Create, Read (List, Get by number),
		// Update, and Delete

		System.out.println("Welcome to the Item Manager App!");
		System.out.println();
		int command = 0;
		int itemNbr = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command:   ");
			switch (command) {
			case 1:
				// list all items - loop through and print!
				getList();

				break;
			case 2:
				getItem();
				break;
			case 3:
				addItem();
				break;
			case 4:
				editItem(itemNbr);
				break;
			case 5:
				deleteItem(itemNbr);
				break;
			case 9:
				// exits application
				break;
			default:
				System.out.println("Invalid command.  Try again.");
				break;
			}
			System.out.println();
		}
		System.out.println("Bye!");
	}

	private static void deleteItem(int itemNbr) {
		// - loop through items and retrieve item
		// that matches the number entered
		// - if item not found, print message
		// - if item found, delete it and display success msg

		System.out.println("Delete an Item:");
		System.out.println("=================");
		itemNbr = Console.getInt("Please enter number   ");
		findItem(itemNbr);
		Item item = findItem(itemNbr);
		if (item != null) {
			items.remove(itemNbr - 1);
			System.out.println("Item number " + item + " was updated.");
		} else
			System.out.println();
			System.out.println(ITEM_NOT_FOUND_MSG + itemNbr);
	}

	private static void editItem(int itemNbr) {
		// - if item not found, print message
		// - if item found, prompt user for new description
		// - change the item description (hint: use setter)
		// and display success msg
		System.out.println("Update an Item:");
		System.out.println("=================");
		itemNbr = Console.getInt("Please enter number   ");
		findItem(itemNbr);
		Item item = findItem(itemNbr);
		if (item != null) {
			item.setDescription(Console.getLine("Updated name:   "));
			System.out.println("Item number " + itemNbr + " was updated.");
		} else
			System.out.println();
			System.out.println(ITEM_NOT_FOUND_MSG + itemNbr);
	}

	private static void getItem() {
		// get an item by id
		// - prompt user for id to retrieve
		// - loop through items and retrieve item
		// that matches the id entered
		// - print the item
		System.out.println("Get an Item:");
		System.out.println("=================");
		int number = Console.getInt("Please enter number   ");
		Item item = findItem(number);
		if (item != null) {
			System.out.println(item);
		} else
			System.out.println();
			System.out.println(ITEM_NOT_FOUND_MSG + number);
	}

	private static void addItem() {
		int itemNbr;
		System.out.println("Add an Item:");
		System.out.println("=================");
		itemNbr = Console.getInt("Enter item number:   ");
		String name = Console.getLine("Enter item name:   ");
		items.add(new Item(itemNbr, name));
		System.out.println("You added " + name);
	}

	private static void getList() {
		System.out.println("Items:");
		System.out.println("=================================");
		for (Item i : items) {

			System.out.println("Item: " + i.getNumber() + "      Description: " + i.getDescription());
		}
	}

	private static Item findItem(int itemNbr) {

		Item foundItem = null;
		for (Item item : items) {
			if (itemNbr == item.getNumber()) {
				foundItem = item;
			}
		}
		return foundItem;
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
