package JavaAutoFilesGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SecondClass {

	public static void main(String[] args) {
		String mainFile = "Main.txt";

		System.out.println("---------------------");

		try (BufferedReader reader = new BufferedReader(new FileReader(mainFile))) {
			String line;
			StringBuilder currentFileContent = new StringBuilder();
			String filename = null;

			while ((line = reader.readLine()) != null) {
				if (line.startsWith("<<<<<=")) {
					// Extract filename
					filename = line.substring(6, line.indexOf(".java") + 5);
					currentFileContent.setLength(0); // Clear previous content
					System.err.println("File created " + filename);
				} else if (line.startsWith(">>>>>")) {
					// End of file marker, write content
					if (filename != null) {
						writeFile(filename, currentFileContent.toString().trim());
						filename = null;
					}
				} else if (filename != null) {
					// Append content to current file
					currentFileContent.append(line).append("\n");
				}

			}
		} catch (IOException e) {
			System.err.println("Error reading or writing files: " + e.getMessage());
		}
	}

	private static void writeFile(String filename, String content) throws IOException {
		try (FileWriter writer = new FileWriter(filename)) {
			writer.write(content);
		}
	}
}
