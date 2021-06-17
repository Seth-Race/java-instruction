package ui;

import java.io.IOException;
import java.nio.file.*;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
			System.out.println("Welcome to the FileIO Demo app.");
			System.out.println();
			//p.463
			//Create a directory if it doesn't exist.
			String dirString = "c:/temp/subfolder2";
			Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("Directories Created.");
				
			}
			
			// creates a file if it doesn't exist.
			String fileString = "items.txt";
			Path filePath = Paths.get(dirString, fileString);
			if (Files.notExists(filePath)) {
				Files.createFile(filePath);
				System.out.println("File created.");
			}
			
			//create a file using a relative path.
			fileString = "test-file.txt";
			filePath = Paths.get(fileString);
			if (Files.notExists(filePath)) {
				Files.createDirectories(filePath);
				System.out.println("Relative path file created.");
			}
			
			//info about a file.
			System.out.println("File Name: "+filePath.getFileName());
			System.out.println("Absolute Path: "+filePath.toAbsolutePath());
			System.out.println("Is Writeable: "+Files.isWritable(filePath));
			
			//displaying files in a directory.
			if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
				System.out.println();
				System.out.println("Directory: " +dirPath.toAbsolutePath());
				System.out.println();
				System.out.println("Files: ");
				DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
				for (Path p:dirStream) {
					if (Files.isRegularFile(p)) {
						System.out.println("   " +p.getFileName());
					}
				}
			}
			
			System.out.println();
			System.out.println("Peace out, girlscout.");

	}

}
