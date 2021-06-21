package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Item;
import interfaces.DAO;

public class ItemDB implements DAO<Item> {

	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/item_db";
		String username = "item_user";
		String pwd = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, pwd);
		return conn;
	}

	@Override
	public Item get(int id) {
		Item item = null;
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("Select * from item where id = " + id);
			if (rs.next()) {
				item = getItemFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return item;
	}

	@Override
	public List<Item> getAll() {
		List<Item> items = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from item order by id");
			while (rs.next()) {
				Item item = getItemFromRow(rs);
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;

	}

	private Item getItemFromRow(ResultSet rs) throws SQLException {
		// For each row, parse an item
		int id = rs.getInt(1);
		String desc = rs.getString(2);
		Item item = new Item(id, desc);
		return item;
	}

	@Override
	public boolean add(Item t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Item t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Item t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean clearItems() {
		// TODO Auto-generated method stub
		return false;
	}

}
