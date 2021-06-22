package business;

public class Movie {

		private int id;
		private String title;
		private int year;
		private String rating;
		private String director;
		
		public Movie(int id, String title, int year, String rating, String director) {
			super();
			this.id = id;
			this.title = title;
			this.year = year;
			this.rating = rating;
			this.director = director;
		}
		
		public Movie(String title, int year, String rating, String director) {
			this.title = title;
			this.year = year;
			this.rating = rating;
			this.director = director;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getRating() {
			return rating;
		}

		public void setRating(String rating) {
			this.rating = rating;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		@Override
		public String toString() {
			return "ID:"+ id + " | Title:" + title + " | Year:" + year + " | Rating:" + rating + " | Director:"
					+ director;
		}
		
		
	}


