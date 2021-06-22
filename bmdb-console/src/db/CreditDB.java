package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor; 
import business.Credit;
import business.Movie;
import interfaces.DAO;

public class CreditDB extends BaseDB implements DAO<Credit> {

	

	@Override
	public Credit get(int id) {
		Credit credit = null;
		String sql = "select * from credit c "
				+ "join actor a on ActorID = a.id "
				+ "join movie m on MovieID = m.id where c.id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				credit = getCreditFromRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return credit;
	}

	@Override
	public List<Credit> getAll() {
		// changed to join to inlude actor, movie, and credit.
		List<Credit> credits = new ArrayList<>();
		try (Statement stmt = getConnection().createStatement()) {
			ResultSet rs = stmt.executeQuery("select * from credit c "
					+ "join actor a on ActorID = a.id "
					+ "join movie m on MovieID = m.id");
			while (rs.next()) {
				Credit credit = getCreditFromRow(rs);
				credits.add(credit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return credits;
	}

	@Override
	public boolean add(Credit cred) {
		boolean success = false;
		String sql = "insert into credit (actorId, movieId, role) values (?,?,?)";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, cred.getActor().getId());
			stmt.setInt(2, cred.getMovie().getId());
			stmt.setString(3, cred.getRole());
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
	public boolean update(Credit cred) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Credit cred) {
		boolean success = false;
		String sql = "delete from credit where id = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, cred.getId());
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
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	private Credit getCreditFromRow(ResultSet rs) throws SQLException {
		// For each row, parse a credit, actor and movie
		// parse actor
		int actorId = rs.getInt(5);
		String firstName = rs.getString(6);
		String lastName = rs.getString(7);
		String gender = rs.getString(8);
		String bdStr = rs.getString(9);
		LocalDate birthDate = LocalDate.parse(bdStr);
		Actor actor = new Actor(actorId, firstName, lastName, gender, birthDate);
		
		int movieId = rs.getInt(10);
		String title = rs.getString(11);
		int year = rs.getInt(12);
		String rating = rs.getString(13);
		String director = rs.getString(14);
		Movie movie = new Movie(movieId, title, year, rating, director);
		
		int creditId = rs.getInt(1);
		String role = rs.getString(4);
		
		Credit credit = new Credit(creditId, actor, movie, role);
		return credit;
	}
	
	
	public List<Credit> getCreditsForMovie(Movie movie) {
		List<Credit> credits = new ArrayList<>();
		String sql = "select * from credit"
				+ "  join actor on actorid = actor.ID"
				+ "  join movie on movieid = movie.ID"
				+ "  where movieid = ?";
		try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
			stmt.setInt(1, movie.getId());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Credit credit = getCreditFromRow(rs);
				credits.add(credit);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return credits;
	}
	
}
