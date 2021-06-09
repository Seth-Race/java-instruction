
public class Album extends Product {
	private String bandName;
	private int	releaseYear;  
	
	
	public Album() {
		super();
		bandName = "";
		releaseYear = 0;
		count ++;
	}


	public String getBandName() {
		return bandName;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	@Override
	public String toString() {
		return super.toString()+ " (" + bandName + ", " + releaseYear + ")";
	}

	
	
	

	
}
