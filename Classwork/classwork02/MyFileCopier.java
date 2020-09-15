import copiersupport.SourceFile;
import copiersupport.TargetFile;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.File;  // Package to import file classes
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Scanner class imports to read files
import java.io.IOException;  // Importing IOExpection pacakge to handle errors

public class MyFileCopier {
   public static void main(String args[]) throws java.io.IOException {
      java.io.SourceFile in = null;
      java.io.TargetFile out = null;

      try {
        in  = new java.io.SourceFile("input.txt");
        out = new java.io.TargetFile("output.txt");

        int c;
        while ((c = in.read()) != -1) {
           out.write(c);
        }
     } catch( java.io.IOException ioe ) {
        System.out.println( "\n  Sorry, an I/O error occurred." );
     } finally {
        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
      }
  }
}
