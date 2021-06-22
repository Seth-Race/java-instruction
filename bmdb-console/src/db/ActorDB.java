package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import interfaces.DAO;

public class ActorDB extends BaseDB implements DAO<Actor>{


	
	
	
	
	@Override
	public Actor get(int id) {
		Actor actor = null;
		String sql = "select * from actor where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				actor = getActorFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return actor;
	}

	@Override
	public List<Actor> getAll() {
		List<Actor> actors = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from actor order by id");
			while (rs.next()) {
				Actor actor = getActorFromRow(rs);
				actors.add(actor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actors;
	}

	@Override
	public boolean add(Actor act) {
		boolean success = false;
		String sql = "insert into actor (FirstName, LastName, Gender, BirthDate) values (?,?,?,?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setString(1, act.getFirstName());
			stmt.setString(2, act.getLastName());
			stmt.setString(3, act.getGender());
			stmt.setString(4, act.getBirthDate().toString());
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
	public boolean update(Actor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Actor act) {
		boolean success = false;
		String sql = "delete from actor where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, act.getId());
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
	
	
	
	
	private Actor getActorFromRow(ResultSet rs) throws SQLException {
		// For each row, parse an item
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		String birthDateStr = rs.getString(5);
		LocalDate birthDate = LocalDate.parse(birthDateStr);
		Actor actor = new Actor(id, firstName, lastName, gender, birthDate);
		return actor;
	}
	
	
}
