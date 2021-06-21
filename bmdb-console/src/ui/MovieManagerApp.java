package ui;

import java.time.LocalDate;

import com.util.Console;

import business.Actor;
import business.Movie;
import interfaces.DAO;
import text.ActorTextFile;
import text.MovieTextFile;

public class MovieManagerApp {
	private static final String MOVIE_NOT_FOUND = "No movie found for ID: ";
	private static final String ACTOR_NOT_FOUND = "No actor found for ID: ";

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
				System.out.println();
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
			//calls a new method with switch statements to select what to update
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
		case 7:
			actorManager();
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
		System.out.println("7 - Switch to Actor");
		System.out.println("9 - Exit");
		System.out.println();
	}
	
	
	private static void actorMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("===================");
		System.out.println("1 - List all actors");
		System.out.println("2 - Get an actor");
		System.out.println("3 - Add new actor");
		System.out.println("4 - Update an actor");
		System.out.println("5 - Delete an actor");
		System.out.println("6 - Clear entire file");
		System.out.println("9 - Exit");
		System.out.println();
	}
	
	private static void actorManager() {
		DAO<Actor> ActorsDAO = new ActorTextFile();
		int actCommand = 0;
		while (actCommand !=9) {
			actorMenu();
			actCommand = Console.getInt("Please enter command:   ");
			System.out.println();
			
			switch(actCommand) {
			case 1:
				//get all
				System.out.println("Displaying All Movies");
				System.out.println("=====================");
				for (Actor actor : ActorsDAO.getAll()) {
					System.out.println(actor);
				}
				System.out.println();
				break;
			case 2:
				//get actor by ID
				System.out.println("Displaying Actor by ID");
				System.out.println("======================");
				int id = Console.getInt("Enter Actor ID:   ");
				Actor actor = ActorsDAO.get(id);
				if (actor != null) {
					System.out.println("Actor found!");
					System.out.println(actor);
					System.out.println();
				}
				else {
					System.out.println(ACTOR_NOT_FOUND +id);
				}
				break;
			case 3:
				//adding actor
				System.out.println("Adding an Actor");
				System.out.println("==============");
				id = Console.getInt("ID:   ");
				String firstName = Console.getLine("First Name:   ");
				String lastName = Console.getLine("Last Name:   ");
				String gender = Console.getLine("Gender:   ");
				String birthDateStr = Console.getLine("birthDate:   (XXXX-XX-XX)");
				LocalDate birthDate = LocalDate.parse(birthDateStr);
				if (ActorsDAO.add(new Actor(id, firstName, lastName, gender, birthDate))) {
					System.out.println("Actor Added.");
					System.out.println();
				}
				else {
					System.out.println("Error Adding Actor");
				}
				break;
			case 4:
				break;
			case 5:
				//delete a movie
				System.out.println("Delete Actor");
				System.out.println("============");
				id = Console.getInt("ID:   ");
				actor = ActorsDAO.get(id);
				if (actor != null) {
					ActorsDAO.delete(actor);
					System.out.println("Deleted " +actor);
				}
				else {
					System.out.println(ACTOR_NOT_FOUND +id);
				}
				break;
			case 6:
				break;
			case 9:
				break;
				
			
			
			
			}
		}
		
	}
	
	
}
