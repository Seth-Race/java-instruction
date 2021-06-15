package ui;

import java.util.*;

public class CollectionsDemoApp {

	public static void main(String[] args) {
			System.out.println("Welcome to the Collections Demo App!");
			
			List<String> names = new ArrayList<>();
			names.add("Matt");
			names.add("Nick");
			names.add("Seth");
			names.add("Michelle");
			names.add("Linda");
			names.add("Dylan");
			names.add("Sean");
			
		//enhanced for loop pushing list of names
			for (String s:names) {
				System.out.println(s);
			}
		// adding Kevin to middle of list.
			names.add(3, "Kevin");
			System.out.println(names);
		// returning size of list.
			System.out.println("Size of list:  " +names.size());
			
			
			System.out.println("Getting 5th position:  " +names.get(5));
			
			
		// integers
			List<Integer> numbers = new ArrayList<>();
			numbers.add(5);
			numbers.add(20);
			numbers.add(17);
			numbers.add(3);
	
		//p.390-391
			
			System.out.println("Names contains Kevin?   " +names.contains("Kevin"));
			System.out.println("Kevin's index?   " +names.indexOf("Kevin"));
			System.out.println("Replacing Kevin!   " +names.set(3, "Newbie"));
			System.out.println(names);
		//test added to end
			names.add("test");
			System.out.println("Testing removal of name.");
			System.out.println(names);
			names.remove(names.size()-1);
			System.out.println(names);
			names.remove("Newbie");
			System.out.println(names);
			System.out.println();
			System.out.println("Sorting the list.");
			Collections.sort(names);
			System.out.println(names);
			System.out.println();
			System.out.println();
			
			
		// p.408-411 Creating a HashMap of months.
			Map<String, String> monthsMap = new HashMap<>();
			monthsMap.put("Jan", "January");
			monthsMap.put("Feb", "February");
			monthsMap.put("Mar", "March");
			monthsMap.put("Apr", "April");
			monthsMap.put("May", "May");
			monthsMap.put("Jun", "June");
			monthsMap.put("Jul", "July");
			monthsMap.put("Aug", "August");
			monthsMap.put("Sep", "September");
			monthsMap.put("Oct", "October");
			monthsMap.put("Nov", "November");
			monthsMap.put("Dec", "December");
			System.out.println(monthsMap.containsKey("Nov"));
			System.out.println(monthsMap.containsKey("Sea"));
			System.out.println("The current month is " +monthsMap.get("Jun"));
			
			
			System.out.println();
			System.out.println("Month   Name");
			System.out.println("=====   ========");
			
			for (Map.Entry<String, String> entry: monthsMap.entrySet()){
				System.out.println(entry.getKey()+ "     " +entry.getValue());
			}
	
			
			
			System.out.println("Thanks for using the Collections Demo App!");
	}

}
