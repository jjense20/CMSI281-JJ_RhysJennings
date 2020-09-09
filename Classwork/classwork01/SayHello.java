import java.util.*;

public class SayHello {
  public static void main (String args[]) {
    Scanner myInput = new Scanner( System.in );
    System.out.print("Enter your character name: ");
    String inputName = myInput.nextLine();
    System.out.println("\n" + "Hello, " + inputName);
    myInput.close();
  }
}
