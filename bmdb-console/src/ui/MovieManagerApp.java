package ui;

import com.util.Console;

import business.Movie;
import interfaces.DAO;
import text.MovieTextFile;

public class MovieManagerApp {
	private static final String MOVIE_NOT_FOUND = "No movie found for ID: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the BMDB Console App! Cincinnati's finest Hollywood file formatter!");
		System.out.println();
		
		//creating instance of MovieTextFile. Should create if it doesn't already exist.
		DAO<Movie> MoviesDAO = new MovieTextFile();
		
		int command = 0;
	while (command !=9) {
		displayMenu();
		command = Console.getInt("Please enter command:   ");
		System.out.println();
		
		switch(command) {
		case 1:
			//get all
			System.out.println("Displaying All Movies");
			System.out.println("=====================");
			for (Movie movie : MoviesDAO.getAll()) {
				System.out.println(movie);
			}
			System.out.println();
			break;
		case 2:
			//get movie by ID
			System.out.println("Displaying Movie by ID");
			System.out.println("======================");
			int id = Console.getInt("Enter Movie ID:   ");
			Movie movie = MoviesDAO.get(id);
			if (movie != null) {
				System.out.println("Movie found!");
				System.out.println(movie);
			}
			else {
				System.out.println(MOVIE_NOT_FOUND +id);
			}
			break;
		case 3:
			//adding movie
			System.out.println("Adding a Movie");
			System.out.println("==============");
			id = Console.getInt("ID:   ");
			String title = Console.getLine("Title:   ");
			int year = Console.getInt("Year:   ");
			String rating = Console.getLine("Rating:   ");
			String director = Console.getLine("Director:   ");
			if (MoviesDAO.add(new Movie(id, title, year, rating, director))) {
				System.out.println("Movie Added.");
				System.out.println();
			}
			else {
				System.out.println("Error Adding Movie");
			}
			break;
		case 4:
			//update a movie - Not implemented yet.
			break;
		case 5:
			//delete a movie
			System.out.println("Delete Movie");
			System.out.println("============");
			id = Console.getInt("ID:   ");
			movie = MoviesDAO.get(id);
			if (movie != null) {
				MoviesDAO.delete(movie);
				System.out.println("Deleted " +movie);
			}
			else {
				System.out.println(MOVIE_NOT_FOUND +id);
			}
			break;
		case 6:
			//clear entire file
			System.out.println("Clearing Movie File");
			System.out.println("===================");
			MoviesDAO.clearMovies();
			System.out.println();
			break;
		case 9:
			//exiting program
			System.out.println("Exiting Application");
			break;
		default:
			System.out.println("Invalid entry. Please try again");
			break;
		}
		
		
		
	}
		System.out.println();
		System.out.println("Thanks for choosing the BMDB Console App!");

	}
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - List all movies");
		System.out.println("2 - Get a movie");
		System.out.println("3 - Add new movie");
		System.out.println("4 - Update a movie");
		System.out.println("5 - Delete a movie");
		System.out.println("6 - Clear entire file");
		System.out.println("9 - Exit");
		System.out.println();
	}
	
}
