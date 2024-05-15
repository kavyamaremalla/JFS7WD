package com.java.training;

import java.nio.file.*;

public class AdvancedFile {

    public static void main(String[] args) throws Exception {

        // Create a FileSystem object for the local file system
        FileSystem fileSystem = FileSystems.getDefault();

        // Create a Path object for the current directory
        Path currentDirectory = Paths.get(".");
        // Print the current directory
        System.out.println(currentDirectory);

        // Create a Path object for the file "person.txt"
        Path filePath = Paths.get("person2.txt");

        // Check if the file exists
        if (Files.exists(filePath)) {
            // The file exists
            System.out.println("The file exists");
        } else {
            // The file does not exist
            System.out.println("The file does not exist");
        }

        // Create a new file
        Files.createFile(filePath);

        // Write some data to the file
        Files.write(filePath, "Hello, world!".getBytes());

        // Read the data from the file
        byte[] data = Files.readAllBytes(filePath);

        // Print the data
        System.out.println(new String(data));

    }
}
