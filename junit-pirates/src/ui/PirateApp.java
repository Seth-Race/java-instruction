package ui;

import java.util.ArrayList;
import java.util.List;
import business.Pirate;

public class PirateApp {
	
	private static List<Pirate> pirates = new ArrayList<>();

	public static void main(String[] args) {
	
		System.out.println("Welcome to the Pirate App...  AARGH!!");
		Pirate p1 = new Pirate("Jack Sparrow");
		Pirate p2 = new Pirate("Will Turner");
		Pirate p3 = new Pirate("Stubby", 3);
		Pirate p4 = new Pirate("James Hook");
		pirates.add(p1);		
		pirates.add(p2);		
		pirates.add(p3);		
		pirates.add(p4);
		printPirateStats();
		System.out.println("Pirate Fight!!!");
		// 10 limbs will be lost in this fight
		for (int i = 0; i < 10; i++) {
			// generate a random index of the pirates array
			int ridx = (int)(Math.random() * pirates.size());
			pirates.get(ridx).loseALimb();
		}
		printPirateStats();
		System.out.println("Bye");
	}
	private static void printPirateStats() {
		System.out.println("============================================");
		System.out.println("Pirate stats:");
		for (Pirate p: pirates) {
			System.out.println(p);
		}
		System.out.println("Total Pirates: "+Pirate.getNumPirates());
		System.out.println("Total Limbs Lost: "+Pirate.getTotalLimbsLost());	
	}
}