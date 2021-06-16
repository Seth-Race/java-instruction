package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardGameApp {
//	static {
//		List<String> inventory = new ArrayList<>(4);
//		inventory.add("Wooden Staff");
//		inventory.add("Wizard's Hat");
//		inventory.add("Cloth Shoes");
//	}

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
				System.out.println("INVENTORY");

				for (int i = 0; i < inventory.size(); i++) {

					System.out.println(i + 1 + "   " + inventory.get(i));
				}
			}

			else if (command.equalsIgnoreCase("grab")) {
				if (inventory.size() <= 3) {
					inventory.add(3, Console.getLine("Enter item name:   "));
					System.out.println("You picked up " + inventory.get(3));
				} else {
					System.out.println("Your hands are full! Try dropping something!");
				}
			}

			else if (command.equalsIgnoreCase("drop")) {
				inventory.remove((Console.getInt("Which item? (by inventory number)   ") - 1));
				System.out.println("You dropped it!");
			} else if (command.equalsIgnoreCase("enchant")) {
				inventory.set(((Console.getInt("Which item number?   ") - 1)), (Console.getLine("Give it a name!   ")));
			} else if (command.equalsIgnoreCase("help")) {
				displayCommands();
			} else if (command.equalsIgnoreCase("fight")) {
				fight();
			} else if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.println();

		}

		System.out.println();
		System.out.println("*------------------------------------------------------*");
		System.out.println("| Thanks for playing, returning you to your own world. |");
		System.out.println("*------------------------------------------------------*");
	}
	

	private static void displayCommands() {
		System.out.println();
		System.out.println("COMMAND LIST");
		System.out.println("inv       --- Show all items in inventory.");
		System.out.println("fight     --- Fight a Troll!");
		System.out.println("grab   	  --- Grab a random item!");
		System.out.println("enchant   --- Make an item better!");
		System.out.println("drop      --- Drop a random item!");
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
		fightCommand = Console.getLine("What do you want to do? (run or attack)   ");
		if (fightCommand.equalsIgnoreCase("attack")) {
			while (trollHP > 0) {
			System.out.println();
			System.out.println("You attack the troll with a FIREBALL!!");
			int damage = (int) (Math.random()*50+1);
			trollHP -= damage;
			hits ++;
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
			System.out.println("Highest Damage in a single hit: " +highDmg);
			System.out.println("You hit the Troll " +hits+ " times.");
			break;
					}
			if (trollHP < 0) {
			System.out.println();
			System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
			System.out.println("|             OVERKILL!!!!                 |");
			System.out.println("| Congratulations! You defeated the troll! |");
			System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
			System.out.println("COMBAT STATS");
			System.out.println("Highest Damage in a single hit: " +highDmg);
			System.out.println("You hit the Troll " +hits+ " times.");
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
				}
		else if (fightCommand.equalsIgnoreCase("befriend")) {
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
		}
		else {
			System.out.println("Invalid command. Fleeing from the Troll!");
		}
	}
}
		

	


