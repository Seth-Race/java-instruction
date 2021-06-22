package text;

import java.util.List;

import business.Actor;
import interfaces.DAO;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class ActorTextFile implements DAO<Actor> {

	private List<Actor> actors = null;
	private Path actorsPath = null;
	private File actorsFile = null;
	private final String FIELD_SEP = "\t";

	public ActorTextFile() {
		super();
		actorsPath = Paths.get("actors.txt");
		actorsFile = actorsPath.toFile();
		actors = this.getAll();
	}

	@Override
	public Actor get(int id) {
		Actor actor = null;

		for (Actor a : actors) {
			if (a.getId() == id) {
				actor = a;
			}
		}

		return actor;
	}

	@Override
	public List<Actor> getAll() {
		if (actors != null) {
			return actors;
		}
		actors = new ArrayList<Actor>();
		if (Files.exists(actorsPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(actorsFile))) {
				// read actors from file into arraylist
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String idStr = fields[0];
					int id = Integer.parseInt(idStr);
					String firstName = fields[1];
					String lastName = fields[2];
					String gender = fields[3];
					String birthDateStr = fields[4];
					LocalDate birthDate = LocalDate.parse(birthDateStr);

					Actor actor = new Actor(id, firstName, lastName, gender, birthDate);
					actors.add(actor);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
				return null;
			}
		} else {
			System.out.println(actorsPath.toAbsolutePath() + " does not exist.");
			try {
				Files.createFile(actorsPath);
				System.out.println("Empty File created.");
			} catch (IOException e) {
				System.out.println("Error creating file.");
				e.printStackTrace();
			}
		}
		return actors;

	}

	@Override
	public boolean add(Actor actor) {
		boolean success = false;
		actors.add(actor);
		success = saveAll();
		return success;
	}

	@Override
	public boolean update(Actor actor) {
		Actor oldActor = this.get(actor.getId());
		int idx = actors.indexOf(oldActor);
		actors.set(idx, actor);
		return saveAll();
	}

	@Override
	public boolean delete(Actor actor) {
		actors.remove(actor);
		return saveAll();
	}

	@Override
	public boolean clear() {
		actors.clear();
		return saveAll();
	}


	private boolean saveAll() {
		boolean success = false;
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(actorsFile)))) {
			for (Actor actor : actors) {
				out.print(actor.getId() + FIELD_SEP);
				out.print(actor.getFirstName() + FIELD_SEP);
				out.print(actor.getLastName() + FIELD_SEP);
				out.print(actor.getGender() + FIELD_SEP);
				out.print(actor.getBirthDate() + FIELD_SEP);

			}
			success = true;
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return success;
	}

}
