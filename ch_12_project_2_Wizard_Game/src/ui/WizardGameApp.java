package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardGameApp {


	public static void main(String[] args) {
		System.out.println("*--------------------------------------*");
		System.out.println("| Welcome to the Wizarding World Game! |");
		System.out.println("*--------------------------------------*");
		System.out.println();
		displayCommands();
		System.out.println();
		String game = Console.getString("Enter the world?  (y/n)   ", "y", "n");

		List<String> inventory = new ArrayList<>(4);
		inventory.add("Wooden Staff");
		inventory.add("Wizard's Hat");
		inventory.add("Cloth Shoes");

		while (game.equalsIgnoreCase("y")) {

			String command = Console.getLine("Please enter command:   ");
			System.out.println();
			if (command.equalsIgnoreCase("inv")) {
				inv(inventory);
			}

			else if (command.equalsIgnoreCase("grab")) {
				grab(inventory);
			}

			else if (command.equalsIgnoreCase("drop")) {
				dropItem(inventory);
				
			} else if (command.equalsIgnoreCase("enchant")) {
				enchantItem(inventory);
			} else if (command.equalsIgnoreCase("help")) {
				displayCommands();
			} else if (command.equalsIgnoreCase("fight")) {
				fight();
			} else if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("quit")) {
				break;
			} else {
				System.out.println("Invalid command. Please try again, or type HELP for a list of commands!");
			}

			System.out.println();

		}

		System.out.println();
		System.out.println("*------------------------------------------------------*");
		System.out.println("| Thanks for playing, returning you to your own world. |");
		System.out.println("*------------------------------------------------------*");
	}

	private static void enchantItem(List<String> inventory) {
		inventory.set(((Console.getInt("Which item number?   ") - 1)), (Console.getLine("Give it a name!   ")));
		System.out.println();
		System.out.println("INVENTORY");
		System.out.println();

		for (int i = 0; i < inventory.size(); i++) {

			System.out.println(i + 1 + ".   " + inventory.get(i));
		}
	}

	private static void dropItem(List<String> inventory) {
		int itemNmbr = Console.getInt("Which item? (by inventory number)   ")-1;
		if (itemNmbr >= 0 && itemNmbr <= inventory.size()) {
			inventory.remove(itemNmbr);
			System.out.println("You dropped it!");
		} else {
			System.out.println("Invalid entry. Returning to main.");
			displayCommands();
		}
	}

	private static void grab(List<String> inventory) {
		if (inventory.size() <= 3) {
			String name = Console.getLine("Enter item name:   ");
			inventory.add(name);
			System.out.println("You picked up " + name);
		} else {
			System.out.println("Your hands are full! Try dropping something!");
		}
	}

	private static void inv(List<String> inventory) {
		System.out.println("INVENTORY");

		for (int i = 0; i < inventory.size(); i++) {

			System.out.println(i + 1 + ".   " + inventory.get(i));
		}
	}

	private static void displayCommands() {
		System.out.println();
		System.out.println("COMMAND LIST");
		System.out.println("inv       --- Show all items in inventory.");
		System.out.println("fight     --- Fight a Troll!");
		System.out.println("grab   	  --- Grab a specific item!");
		System.out.println("enchant   --- Make an item better!");
		System.out.println("drop      --- Drop a specific item!");
		System.out.println("quit   	  --- Exit the world.");
		System.out.println("help      --- Show this list of commands again.");
		System.out.println();
	}

	public static void fight() {
		int trollHP = 100;
		int highDmg = 0;
		int hits = 0;
		String fightCommand = "yes";

		System.out.println();
		System.out.println("*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println("| A FIGHT BREAKS OUT! |");
		System.out.println("*~*~*~*~*~*~*~*~*~*~*~*");
		System.out.println();

		System.out.println("You hear grunting and snarling from the nearby trees!");
		System.out.println("...");
		System.out.println();
		System.out.println("A troll approaches!");
		System.out.println();
		fightCommand = Console.getLine("What do you want to do? (run or attack)   ");
		if (fightCommand.equalsIgnoreCase("attack")) {
			while (trollHP > 0) {
				System.out.println();
				System.out.println("You attack the troll with a FIREBALL!!");
				int damage = (int) (Math.random() * 50 + 1);
				trollHP -= damage;
				hits++;
				if (highDmg < damage) {
					highDmg = damage;
				}
				System.out.println("You hit them for " + damage + "!");
				System.out.println("Troll's HP stands at " + trollHP);
				if (trollHP == 0) {
					System.out.println();
					System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
					System.out.println("| Congratulations! You defeated the troll! |");
					System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
					System.out.println("COMBAT STATS");
					System.out.println("Highest Damage in a single hit: " + highDmg);
					System.out.println("You hit the Troll " + hits + " times.");
					break;
				}
				if (trollHP < 0) {
					System.out.println();
					System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
					System.out.println("|             OVERKILL!!!!                 |");
					System.out.println("| Congratulations! You defeated the troll! |");
					System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
					System.out.println("COMBAT STATS");
					System.out.println("Highest Damage in a single hit: " + highDmg);
					System.out.println("You hit the Troll " + hits + " times.");
					break;
				}
			}
		}

		else if (fightCommand.equalsIgnoreCase("run")) {
			System.out.println();
			System.out.println("You try to run away!");
			System.out.println("...PANT PANT...");
			System.out.println("...HUFF HUFF...");
			System.out.println("You aren't sure where you are anymore...");
			System.out.println();
			System.out.println();
			System.out.println("You find a nearby village!");
			System.out.println("You escaped successfully!");
		} else if (fightCommand.equalsIgnoreCase("befriend")) {
			System.out.println();
			System.out.println("*~@~*~@~*~@~*~@~*~@~*~@~*~@~*");
			System.out.println("|  You found an Easter Egg! |");
			System.out.println("*~@~*~@~*~@~*~@~*~@~*~@~*~@~*");
			System.out.println();
			System.out.println("You take time to talk to the Troll and he calms down.");
			System.out.println("He tells you that his name is Frank, and he's been very lonely.");
			System.out.println("In a gesture of kindness, you offer him dinner. He accepts with a smile.");
			System.out.println("A few days go by, and you part ways, knowing you've gained a lifelong friend.");
			System.out.println("Good job.");
			System.out.println("FRIENDSHIP GAINED!");
		} else {
			System.out.println("Invalid command. Fleeing from the Troll!");
		}
	}
}
