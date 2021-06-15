package ui;

import java.util.Arrays;

import business.Item;

public class ArraysDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the array demos");
		
		//p. 355 - basic arrays
		
		double[] prices = new double[4];
		prices[0]= 11.12;
		prices[1]= 2.35;
		prices[2]= 4.7;
		prices[3]= 20.22;
		
		// p. 359 compute average price.
		double total = 0.0;
		
		for (int i=0;i<prices.length;i++) {
			total += prices[i];
			System.out.println(i+": " +prices[i]);
		}

		
		System.out.println("prices total:" +total);
		System.out.println("Prices avg: " +total/prices.length);
		
		
		//p.360 (jumping ahead) enhanced for/foreach loop
		//this method cannot pull index (i in last example)
		//p and name show as variables within FOR loop. REMEMBER THAT.
		
		System.out.println("Enhanced for loop...");
		for (double p: prices) {
			System.out.println(p);
		}
		
		
		String[] names = {"Sean", "Dylan", "Linda", "Michelle", "Seth", "Nick", "Matt"};
		
		
		for (String name: names) {
			System.out.println(name);
		}
		
		
		//an array of items
		Item i1 = new Item(5, "headphones");
		Item i2 = new Item(2, "amplifier");
		Item i3 = new Item(4, "speakers");
		Item i4 = new Item(1, "headphones");
		Item i5 = new Item(3, "microphone");
		
		Item[] items = {i1, i2, i3, i4, i5};
		
		for (Item item: items) {
			System.out.println(item);
		}
		// p. 362-363 Arrays Class
		//is 2.35 in array of prices?
		// what posistion if so?
		System.out.println(Arrays.binarySearch(prices, 2.35));
		
		//sorting
		for (String n: names) {
			System.out.println(n);
		}
		System.out.println("Sort the names");
		Arrays.sort(names); //didn't work
		for (String n: names) {
			System.out.println(n);
		}
		System.out.println("sort items");
		Arrays.sort(items);
		for (Item item: items) {
			System.out.println(item);
		}
		System.out.println("Peace out, home fry.");

	}

}
