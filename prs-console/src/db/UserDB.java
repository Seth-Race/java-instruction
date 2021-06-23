package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.User;
import interfaces.DAO;

public class UserDB extends BaseDB implements DAO<User>{

	@Override
	public User get(int id) {
		User user = null;
		String sql = "select * from user where id = ";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				user = getUserFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from user order by id");
			while (rs.next()) {
				User user = getUserFromRow(rs);
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "insert into user (username, password, lastName, firstName, email, phone, reviewer, admin) values (?,?,?,?,?,?,?,?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, u.getUsername());
			stmt.setString(2, u.getPassword());
			stmt.setString(3, u.getLastName());
			stmt.setString(4, u.getFirstName());
			stmt.setString(5, u.getEmail());
			stmt.setString(6, u.getPhone());
			stmt.setString(7, u.getPhone());
			stmt.setBoolean(8, u.getReviewer());
			stmt.setBoolean(9, u.getAdmin());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}
	

	@Override
	public boolean update(User u) {
		//Not implemented yet. Per instructor.
		return false;
	}

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "delete from user where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, u.getId());
			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected == 1) {
				success = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean clear() {
			boolean success = false;
			return success;
	}
	
	private User getUserFromRow(ResultSet rs) throws SQLException {
		// For each row, parse an item
		//getting ID and username by column name. rest by column number (p. 681)
		//normally you'd never mix styles.
		int id = rs.getInt("ID");
		String userName = rs.getString("Username");
		String password = rs.getString(3);
		String lastName = rs.getString(4);
		String firstName = rs.getString(5);
		String email = rs.getString(6);
		String phone = rs.getString(7);
		boolean reviewer = rs.getBoolean(8);
		boolean admin = rs.getBoolean(9);
		User user = new User(id, userName, password, lastName, firstName, email, phone, reviewer, admin);
		return user;
	}
	


}
