package ui;


import java.math.BigDecimal;
import java.math.RoundingMode;
import com.util.Console;

public class BattingAverageCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the batting average app!");
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        

     //Over complicated this by using BD and intValue.
        BigDecimal hit = new BigDecimal("0");
        int hits = hit.intValue();
        BigDecimal bases = new BigDecimal("0");
        int base = bases.intValue();
        
        
		int atBa = Console.getInt("How many at-bat opportunities?   ", 0, 30);
		BigDecimal atBat = BigDecimal.valueOf(atBa);
		
// Initializing array for bat(each at-bat opportunity
		int bat[] = new int [atBa];
// for loop to put int into array
		for (int i = 0; i < atBa; i++) {
		bat[i] = Console.getInt("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run   ", -1, 5);
		base += bat[i];
		bases = BigDecimal.valueOf(base);
		if (bat[i] < 0) {
			hits += bat[i];
			hit = BigDecimal.valueOf(hits);
		}
				}
	//	batAvg (Not working)
		BigDecimal batAvg = hit.divide(atBat,3, RoundingMode.HALF_UP);
		System.out.println("Batting Average:   " +batAvg);
		
	// slugAvg (Working)
		BigDecimal slugAvg = bases.divide(atBat,3, RoundingMode.HALF_UP);		
		System.out.println("Slugging Average:   " +slugAvg);
		
		
		
		
		
		
	// End of player. Begin again?	
		choice = Console.getString("Another player? (y/n)  ", true);
        }
		System.out.println("Thanks for using the batting average app!");
	}

}
