package copiersupport;

import java.io.File;  // Package to import file classes
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Scanner class imports to read files
import java.io.IOException;  // Importing IOExpection pacakge to handle errors

public class SourceFile {
  public static void read(String [] args) {
    try {
      File myFile = new File("input.txt");
      Scanner reader = new Scanner(myFile);
      while (reader.hasNextLine()) {
        String txt = reader.nextLine();
        System.out.println(txt);
    }
    reader.close();
    } catch (FileNotFoundException e) {
    System.out.println("Sorry, something went wrong on this end.");
    }
  }
}
