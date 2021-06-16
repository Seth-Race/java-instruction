package business;

public class Item implements Comparable{
	
	private int number;
	private String description;
	
	public Item(int number, String description) {
		super();
		this.number = number;
		this.description = description;
	}

	public Item() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [number=" + number + ", description=" + description + "]";
	}

	@Override
	public int compareTo(Object o) {
		Item i = (Item)o;
		int comp = 0;
		if (this.getNumber() < i.getNumber()) {
			comp = -1;
		}
		else if (this.getNumber() > i.getNumber()) {
			comp = 1;
		}
		return comp;
	}

	
}
