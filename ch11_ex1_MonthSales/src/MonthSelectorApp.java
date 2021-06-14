import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", 
        		"September", "October", "November", "December"};
        double[] monthSales = new double[12];
        monthSales[0]= 3312.75;
        monthSales[1]= 5267.50;
        monthSales[2]= 14962.90;
        monthSales[3]= 2903.01;
        monthSales[4]= 6723.10;
        monthSales[5]= 2309.39;
        monthSales[6]= 10341.1;
        monthSales[7]= 25962.55;
        monthSales[8]= 50572.45;
        monthSales[9]= 19543.99;
        monthSales[10]= 15672.01;
        monthSales[11]= 14982.25;
        

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            
            int monthIndex = monthNumber - 1;
            Console.displayLine("Sales for " + monthName[monthIndex] +
                    ": " + currency.format(monthSales[monthIndex]) + "\n");

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        double sum = 0;
        for (double sales : monthSales) {
            sum += sales;
        }
        Console.displayLine("Total sales: " + currency.format(sum));
        Console.displayLine();
    }    

}
