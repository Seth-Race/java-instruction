package ui;

import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import business.Movie;
import business.MovieCollection;


public class MovieRatingsApp {

	public static void main(String[] args) {

 

				//initialize stuff
				MovieCollection mc = new MovieCollection();
				mc.add(new Movie("Avengers Infinity War", 2018, 4.0));
				mc.add(new Movie("Star Wars Episode 5 - Empire Strikes Back", 1980, 5.0));
				mc.add(new Movie("Sixteen Candles", 1984, 4.5));
				mc.add(new Movie("Happy Gilmore", 1996, 4.3));
				mc.add(new Movie("The Jerk", 1979, 3.9));
				mc.add(new Movie("Superbad", 2007, 3.9));
				mc.add(new Movie("Back to the Future Part III", 1990, 2.1));
				mc.add(new Movie("Entourage", 2015, 1.5));
				
				System.out.println("Welcome to the Movie Ratings application!\n");
				int choice = 0;
				
				while (choice!=6) {
					displayMenu();
				
					choice = Console.getInt("Choose a menu option:  ", 1, 6);
				
					List<Movie> filteredMovies;
					switch (choice) {
						case 1:		// Enter a movie
							int nbr = Console.getInt("How many movies do you want to enter?  ", 0, 11);
							for (int i = 1; i <= nbr; i++) {
								Console.println("Movie # "+i);
								Console.println("===========");
								String title = Console.getString("Enter title:  ");
								int year = Console.getInt("Enter year:  ", 1900, LocalDate.now().getYear());
								double rating = Console.getDouble("Enter rating:  ", 1.0, 5.0);
								Movie m = new Movie(title, year, rating);
								mc.add(m);
							}
							break;
						case 2:		// View top rated movies
							Console.println("Movies rated 4.0 or higher");
							Console.println("==========================");
							break;
						case 3:		// View most recent movies (movies released within last 10 years)
							Console.println("Movies released in last 10 years");
							Console.println("================================");
							break;
						case 4:
							Console.println("All movies");
							Console.println("==========");
							break;
						case 5:		// View ratings
							Console.println("Movie rating data");
							Console.println("=================");
							Console.println("# of movies:  ");
							Console.println("lowest rating:  ");
							Console.println("highest rating:  ");
							Console.println("average rating:  ");
							break;
						case 6:
							Console.println("Goodbye!");
							break;
					}
				
				}
				

			}

			public static void displayMenu() {
		        Console.println("-----------------------");
		        Console.println("What do you want to do?");
		        Console.println("-----------------------");
		        Console.println("1 - Enter a movie");
		        Console.println("2 - View top rated movies");
		        Console.println("3 - View most recent movies");
		        Console.println("4 - View all movies");
		        Console.println("5 - View ratings");
		        Console.println("6 - Quit application");
		        
		        System.out.println();
			}
			
		}

	}

}
