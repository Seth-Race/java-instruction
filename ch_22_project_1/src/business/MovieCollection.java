package business;

import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {

	//instance variable that's a list of Movie objects.
	private List<Movie> movies;
	
	
	//methods to add and create
	
	public void add(Movie movie) {
		// add Movie object to internal list
		movies.add(movie);
	}
	public List<Movie> filterMovies(Predicate<Movie> condition)()
	public double getLowestRating(){
		//use map and reduce to get ratings
	}
	public double getHighestRating(){
		//map and reduce to get ratings
	}
	public double getAverageRating(){
		//map and reduce to get ratings
	}
	public void int getSize()    {
		//return number of items in internal list
	}
}
