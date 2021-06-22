package ui;

import java.time.LocalDate;
import java.util.List;

import com.util.Console;

import business.Actor;
import business.Credit;
import business.Movie;
import db.ActorDB;
import db.CreditDB;
import db.MovieDB;
import interfaces.DAO;

public class MovieManagerApp {
	private static final String MOVIE_NOT_FOUND = "No movie found for ID: ";
	private static final String ACTOR_NOT_FOUND = "No actor found for ID: ";
	private static final String CREDIT_NOT_FOUND = "No credit found for ID: ";

	private static DAO<Movie> MoviesDAO = new MovieDB();
	private static CreditDB creditsDB = new CreditDB();
	private static DAO<Actor> ActorsDAO = new ActorDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the BMDB Console App! Cincinnati's finest Hollywood file formatter!");
		System.out.println();

		// creating instance of MovieTextFile. Should create if it doesn't already
		// exist.

		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Please enter command:   ");
			System.out.println();

			switch (command) {
			case 1:
				// get all
				System.out.println("Displaying All Movies");
				System.out.println("=====================");
				for (Movie movie : MoviesDAO.getAll()) {
					System.out.println(movie);
				}
				System.out.println();
				break;
			case 2:
				// get movie by ID
				System.out.println("Displaying Movie by ID");
				System.out.println("======================");
				int id = Console.getInt("Enter Movie ID:   ");
				Movie movie = MoviesDAO.get(id);
				if (movie != null) {
					System.out.println("Movie found!");
					System.out.println(movie);
					System.out.println();
				} else {
					System.out.println(MOVIE_NOT_FOUND + id);
				}
				break;
			case 3:
				// adding movie
				System.out.println("Adding a Movie");
				System.out.println("==============");
				// id = Console.getInt("ID: ");
				String title = Console.getLine("Title:   ");
				int year = Console.getInt("Year:   ");
				String rating = Console.getLine("Rating:   ");
				String director = Console.getLine("Director:   ");
				if (MoviesDAO.add(new Movie(title, year, rating, director))) {
					System.out.println("Movie Added.");
					System.out.println();
				} else {
					System.out.println("Error Adding Movie");
				}
				break;
			case 4:
				// update a movie - Not implemented yet.
				// calls a new method with switch statements to select what to update
				break;
			case 5:
				// delete a movie
				System.out.println("Delete Movie");
				System.out.println("============");
				id = Console.getInt("ID:   ");
				movie = MoviesDAO.get(id);
				if (movie != null) {
					MoviesDAO.delete(movie);
					System.out.println("Deleted " + movie);
				} else {
					System.out.println(MOVIE_NOT_FOUND + id);
				}
				break;
			case 6:
				// clear entire file
				System.out.println("Clearing Movie File");
				System.out.println("===================");
				MoviesDAO.clear();
				System.out.println();
				break;
			case 7:
				actorManager();
				break;
			case 8:
				creditManager();
				break;
			case 9:
				// get credits for a movie
				System.out.println();
				System.out.println("Get Credits by Movie:");
				System.out.println("=============================\n");
				id = Console.getInt("Movie ID: ");
				movie = MoviesDAO.get(id);
				System.out.println();
				if (movie != null) {
					List<Credit> credits = creditsDB.getCreditsForMovie(movie);
					System.out.println("Credits for \"" + movie.getTitle() + "(" + movie.getYear() + ")\":");
					System.out.println("==========================================");
					for (Credit c : credits) {
						System.out.println(c.getActor().getName() + " - " + c.getRole());
					}
				} else {
					System.out.println(CREDIT_NOT_FOUND + id);
				}
				break;
			case 99:
				// exiting program
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
		System.out.println();
		System.out.println("COMMAND MENU:");
		System.out.println("==================");
		System.out.println("1 - List all movies");
		System.out.println("2 - Get a movie");
		System.out.println("3 - Add new movie");
		System.out.println("4 - Update a movie");
		System.out.println("5 - Delete a movie");
		System.out.println("6 - Clear entire file");
		System.out.println("7 - Switch to Actor");
		System.out.println("8 - Switch to Credit");
		System.out.println("9 - Credits per Movie");
		System.out.println("99 - Exit");
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
		System.out.println("9 - Return to Movie");
		System.out.println();
	}

	private static void creditMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("===================");
		System.out.println("1 - List all credits");
		System.out.println("2 - Get a credit");
		System.out.println("3 - Add new credit");
		System.out.println("4 - Update a credit");
		System.out.println("5 - Delete a credit");
		System.out.println("6 - Clear entire file");
		System.out.println("9 - Return to Movie");
		System.out.println();
	}

	private static void creditManager() {
		int credCommand = 0;
		while (credCommand != 9) {
			creditMenu();
			credCommand = Console.getInt("Please enter command:   ");
			System.out.println();

			switch (credCommand) {
			case 1:
				System.out.println("Displaying All Credits");
				System.out.println("=====================");
				for (Credit credit : creditsDB.getAll()) {
					System.out.println(credit.getCreditString());
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Displaying Credit by ID");
				System.out.println("======================");
				int id = Console.getInt("Enter Credit ID:   ");
				Credit credit = creditsDB.get(id);
				if (credit != null) {
					System.out.println("Credit found!");
					System.out.println(credit.getCreditString());
					System.out.println();
				} else {
					System.out.println(CREDIT_NOT_FOUND + id);
				}
				break;
			case 3:
				System.out.println("Adding a Credit");
				System.out.println("==============");
				Actor actor = ActorsDAO.get(Console.getInt("Actor ID:   "));
				Movie movie = MoviesDAO.get(Console.getInt("Movie ID:   "));
				String role = Console.getString("Role:   ");
				if (creditsDB.add(new Credit(actor, movie, role))) {
					System.out.println("Credit Added.");
					System.out.println();
				} else {
					System.out.println("Error Adding Actor");
				}
				break;
			case 4:
				// update not yet implemented
				break;
			case 5:
				System.out.println("Delete Credit");
				System.out.println("============");
				id = Console.getInt("ID:   ");
				credit = creditsDB.get(id);
				if (credit != null) {
					creditsDB.delete(credit);
					System.out.println("Deleted " + credit);
				} else {
					System.out.println(CREDIT_NOT_FOUND + id);
				}
				break;
			case 6:
				System.out.println("Clearing Credit File");
				System.out.println("===================");
				creditsDB.clear();
				System.out.println();
				break;
			case 9:
				break;
			}
		}
	}

	private static void actorManager() {
		int actCommand = 0;
		while (actCommand != 9) {
			actorMenu();
			actCommand = Console.getInt("Please enter command:   ");
			System.out.println();

			switch (actCommand) {
			case 1:
				// get all
				System.out.println("Displaying All Actors");
				System.out.println("=====================");
				for (Actor actor : ActorsDAO.getAll()) {
					System.out.println(actor);
				}
				System.out.println();
				break;
			case 2:
				// get actor by ID
				System.out.println("Displaying Actor by ID");
				System.out.println("======================");
				int id = Console.getInt("Enter Actor ID:   ");
				Actor actor = ActorsDAO.get(id);
				if (actor != null) {
					System.out.println("Actor found!");
					System.out.println(actor);
					System.out.println();
				} else {
					System.out.println(ACTOR_NOT_FOUND + id);
				}
				break;
			case 3:
				// adding actor
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
				} else {
					System.out.println("Error Adding Actor");
				}
				break;
			case 4:
				break;
			case 5:
				// delete a movie
				System.out.println("Delete Actor");
				System.out.println("============");
				id = Console.getInt("ID:   ");
				actor = ActorsDAO.get(id);
				if (actor != null) {
					ActorsDAO.delete(actor);
					System.out.println("Deleted " + actor);
				} else {
					System.out.println(ACTOR_NOT_FOUND + id);
				}
				break;

			// clear entire file
			case 6:
				System.out.println("Clearing Actor File");
				System.out.println("===================");
				ActorsDAO.clear();
				System.out.println();
				break;
			case 9:
				break;

			}
		}

	}

}
