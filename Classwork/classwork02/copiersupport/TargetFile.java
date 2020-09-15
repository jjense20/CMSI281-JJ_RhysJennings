package copiersupport;

import java.io.File;  // Package to import file classes
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Scanner class imports to read files
import java.io.IOException;  // Importing IOExpection pacakge to handle errors

public class TargetFile {
  public static void write(String args[]) {
    try {
      FileWriter myFile = new FileWriter("output.txt");
      myFile.write("Java transfer is being completed right now!");
      myFile.close();
    } catch (IOException e) {
      System.out.println("Sorry, something went wrong on this end.");
    }
  }
}
