package business;

public class Game {
	
	private int score;
	private int rollCount;
	
	public Game(int score, int rollCount) {
		super();
		this.score = score;
		this.rollCount = rollCount;
	}

	public Game() {
		super();
		score = 0;
		rollCount = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRollCount() {
		return rollCount;
	}

	public void setRollCount(int rollCount) {
		this.rollCount = rollCount;
	}
	
	// dieRoll increments score and roll count
	// and returns the current roll value
	public int dieRoll(Die d) {
		rollCount++;
		score += d.getValue();
		return d.getValue();
	}

}
