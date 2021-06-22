package business;

public class Credit {
	private int id;
	private Actor actor;
	private Movie movie;
	private String role;
	
	
	public Credit(int id, Actor actor, Movie movie, String role) {
		super();
		this.id = id;
		this.actor = actor;
		this.movie = movie;
		this.role = role;
	}
	
	
	public Credit(Actor actor, Movie movie, String role) {
		super();
		this.actor = actor;
		this.movie = movie;
		this.role = role;
	}


	public Credit() {
		super();
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Actor getActor() {
		return actor;
	}
	public void setActor(Actor actor) {
		this.actor = actor;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	
	
	public String toString() {
		return "Credit [id=" + id + ", actor=" + actor + ", movie=" + movie + ", role=" + role + "]";
	}

	
	public String getCreditString() {
		return "Movie: " +movie.getTitle()+ " (" +movie.getYear()+ ") Rated: " +movie.getRating()+ "\n" +
		"Actor: " +actor.getName()+ ", as " +role+ "\n----------------------------------------------------------------";
	}
	

}
