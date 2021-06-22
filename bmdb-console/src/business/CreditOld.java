package business;

public class CreditOld {
	private int id;
	private int actorID;
	private int movieID;
	private String role;

	public CreditOld(int id, int actorID, int movieID, String role) {
		super();
		this.id = id;
		this.actorID = actorID;
		this.movieID = movieID;
		this.role = role;
	}

	public CreditOld() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getActorID() {
		return actorID;
	}

	public void setActorID(int actorID) {
		this.actorID = actorID;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Credit [id=" + id + ", actorID=" + actorID + ", movieID=" + movieID + ", role=" + role + "]";
	}

}
