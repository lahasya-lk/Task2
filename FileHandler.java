package student;

import java.io.FileWriter;
import java.io.IOException;

// Handles all file-related operations
public class FileHandler {
    private static final String FILE_NAME = "scores.csv";

    // Synchronized 
    public synchronized void writeToFile(Person student) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(student.toString());
            System.out.println("Written to file: " + student.getName());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

