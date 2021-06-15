package ui;


import java.text.NumberFormat;

import com.util.Console;

public class BattingAverageCalcApp {

	public static void main(String[] args) {
		//REBUILT DURING CLASS
		System.out.println("Welcome to the Batting Average Calculator");
		System.out.println();

        String anotherPlayer = "y";
        while (anotherPlayer.equals("y")) {
            
            int atBats = Console.getInt("Enter number of times at bat: ", 1, 30);
            System.out.println();
            
            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");

            //Result array (atBat vs bases)
            int[] results = new int[atBats];    
            for (int i = 0; i < atBats; i++) {
                int atBat = i + 1;
                results[i] = Console.getInt("Result for at-bat " +atBat+ ": ", -1, 5);
            }
            System.out.println();

            //stating/processing results.
            int successfulAtBats = 0;
            int totalBases = 0;
            for (int result : results) {
                if (result > 0) {
                    successfulAtBats++;
                }
                totalBases = totalBases+result;
            }


            // calculating averages
            // NOTE: cast one operand to double to avoid integer result (Something I didn't know before)
            double battingAverage = successfulAtBats / (double) atBats;
            double sluggingPercent = totalBases / (double) atBats;

            // format results
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMinimumFractionDigits(3);
            number.setMaximumFractionDigits(3);
            System.out.println("Batting average: " +number.format(battingAverage));
            System.out.println("Slugging percent: " +number.format(sluggingPercent));
            System.out.println();



	// End of player. Begin again?	
		anotherPlayer = Console.getString("Another player? (y/n)  ", true);
        }
		System.out.println("Thanks for using the batting average app!");
	}

}


// Putting this old code here for future reference.


//System.out.println("Welcome to the batting average app!");
//String choice = "y";
//while (choice.equalsIgnoreCase("y")) {
//
//
////Over complicated this by using BD and intValue.
//BigDecimal hit = new BigDecimal("0");
//int hits = hit.intValue();
//BigDecimal bases = new BigDecimal("0");
//int base = bases.intValue();
//
//
//int atBa = Console.getInt("How many at-bat opportunities?   ", 0, 30);
////More overcomplication with BigDecimal.valueOf
//BigDecimal atBat = BigDecimal.valueOf(atBa);
//
////Initializing array for bat(each at-bat opportunity
//int bat[] = new int [atBa];
////for loop to put int into array
//for (int i = 0; i < atBa; i++) {
//bat[i] = Console.getInt("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run   ", -1, 5);
//base += bat[i];
//bases = BigDecimal.valueOf(base);
//if (bat[i] < 0) {
//	hits += bat[i];
//	hit = BigDecimal.valueOf(hits);
//				}
//		}
////	batAvg (Not working)
//BigDecimal batAvg = hit.divide(atBat,3, RoundingMode.HALF_UP);
//System.out.println("Batting Average:   " +batAvg);
//
//// slugAvg (Working)
//BigDecimal slugAvg = bases.divide(atBat,3, RoundingMode.HALF_UP);		
//System.out.println("Slugging Average:   " +slugAvg);
//
//
//
//
//
