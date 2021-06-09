
public class BmdbConsoleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the BMDB Console App!");
		System.out.println();
		
		int id = Console.getInt("Please enter Movie ID:   ");
		String title = Console.getLine("Please enter title:   ");
		int year = Console.getInt("Please enter year:   ");
		String rating = Console.getString("Please enter rating:   ");
		String director = Console.getLine("Please enter Director:   ");
	
		
		
		
		
		
		Movie m1 = new Movie(id, title, year, rating, director);
		
		
		movieSummary(m1);
		System.out.println();
		System.out.println(m1);
		
		
		
		
		
		System.out.println();
		System.out.println("Thanks for choosing the Console App of the stars!");
	}

	
	
	
	private static void movieSummary(Movie m) {
		System.out.println();
		System.out.println("Movie Detail:");
		System.out.println("ID:       " +m.getId());
		System.out.println("Title:    " +m.getTitle());
		System.out.println("Year:     " +m.getYear());
		System.out.println("Rating:   " +m.getRating());
		System.out.println("Director: " +m.getDirector());
		
	}
	
	
	
}
