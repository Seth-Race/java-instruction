package text;

import java.io.*;
import java.nio.file.*;
import java.util.List;

import business.Item;
import interfaces.DAO;

public class ItemTextFile implements DAO<Item> {
	
	private List<Item> items = null;
	private Path itemsPath = null;
	private File itemsFile = null;
	private final String FIELD_SEP = "\t";
	
	

	public ItemTextFile() {
		super();
		itemsPath = Paths.get("items.txt");
		itemsFile = itemsPath.toFile();
		items = this.getAll();
	}

	@Override
	public Item get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Item item) {
		boolean success = false;
		items.add(item);
		success = saveAll();
		return success;
	}

	@Override
	public boolean update(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * Overwrite items file with all items in items list.
	 */
	private boolean saveAll() {
		boolean success = false;
		try (PrintWriter out = new PrintWriter(
							   new BufferedWriter(
							   new FileWriter(itemsFile)))){
			for (Item item : items) {
				out.println(item.getId() +FIELD_SEP);
				out.println(item.getDescription() +FIELD_SEP);
			}
			success = true;
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		return success;
	}
	
	
}
