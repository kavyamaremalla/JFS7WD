package com.java.training;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        String personFile = "C:\\Users\\kavya\\JFS7WD\\Java\\Training_Demo\\src\\com\\java\\training\\Person2.txt";
        Path path = Paths.get(personFile);
//        Files.createFile(path);

        File file = new File(personFile);
//        file.createNewFile();

//        String content = "Welcome to Java updated!";
//       Files.write(Paths.get(personFile), content.getBytes());
//        BufferedWriter writer = new BufferedWriter(new FileWriter(personFile));
//        writer.write(content);
//        writer.close();

//        String updateContent = "Welcome to Java updated! newly";
//        BufferedWriter updateWriter = new BufferedWriter(new FileWriter(personFile,true));
//        updateWriter.write(updateContent);
//        updateWriter.close();

       /* BufferedReader reader = new BufferedReader(new FileReader(personFile));
        String line = reader.readLine();
        while (line!=null){
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();*/

        File delteFile = new File(personFile);
        delteFile.delete();

        System.out.println(delteFile.exists());
        //apache poi, xmlbeans, commons-collection
    }
}
