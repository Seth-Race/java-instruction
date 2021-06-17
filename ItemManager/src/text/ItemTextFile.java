package text;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
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
		Item item = null;
		
		for (Item i : items) {
			if (i.getId() == id) {
				item = i;
			}
		}
		
		return item;
	}

	@Override
	public List<Item> getAll() {
		// the items list should contain all items for the app.
		// First time here, he list will be null.
		// Initialize the list if so.
		// After init, just return list.
		if (items != null) {
			return items;
		}
		items = new ArrayList<Item>();
		if (Files.exists(itemsPath)) {
			try(BufferedReader in = new BufferedReader(
								    new FileReader(itemsFile))){
				//read items from file into arraylist
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String idStr = fields[0];
					int id = Integer.parseInt(idStr);
					String description = fields[1];
					Item item = new Item(id, description);
					items.add(item);
					line = in.readLine();
				}
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
				return null;
			}
		}
		else {
			System.out.println(itemsPath.toAbsolutePath()+ " does not exist.");
			try {
				Files.createFile(itemsPath);
				System.out.println("Empty File created.");
			} catch (IOException e) {
				System.out.println("Error creating file.");
				e.printStackTrace();
			}
		}
		return items;
		
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
		Item oldItem = this.get(item.getId());
		int idx = items.indexOf(oldItem);
//		items.remove(idx);
//		items.add(idx, item);
		items.set(idx,  item);
		return saveAll();
	}

	@Override
	public boolean delete(Item item) {
		items.remove(item);
		return saveAll();
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
