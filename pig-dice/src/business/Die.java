package business;

/*
 * A new die will be instantiated 
 * for every roll.
 */
public class Die {
	
	private final int value;

	// only need empty constructor
	// will never manually set value
//	public Die(int value) {
//		super();
//		this.value = value;
//	}

	public Die() {
		super();
		value = roll();
	}

	public int getValue() {
		return value;
	}

	// disabling setter to protect integrity of the roll
//	public void setValue(int value) {
//		this.value = value;
//	}
	
	private int roll() {
		return (int)(Math.random()*6)+1;
	}

}
