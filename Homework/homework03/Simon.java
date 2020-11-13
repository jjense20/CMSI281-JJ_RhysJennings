// Simon.java
// demostrates Simon game
// to run this program: C>java Simon
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;                                           // importing packages for user prompts
import java.util.Random;                                            // importing packages for randomizing array

public class Simon {
  public static void main(String[] args) throws InterruptedException {
    int size = 1;                                                   // initializing starting sequence size of 1
    boolean b = false;
    char[] a = {'R','G','B','Y'};                                   // initializing colors for Simon game
    Random randomizer = new Random();                               // initializing randomizer for next color
    StringBuilder sequence = new StringBuilder();                   // creating sequence of colors to append to
    Scanner myInput = new Scanner(System.in);                       // creating user prompt

    while(!b) {
      for(int i = 0; i < size; i++) {
        int color = randomizer.nextInt(4);                          // creating a random index between R, G, B, Y
        System.out.print(a[color]);                                 // outputting array of random index
        sequence.append(a[color]);                                  // appending another random index to array
        Thread.sleep(500);                                          // timer for 1 second measured in milliseconds
      }
      Thread.sleep(1000);                                           // timer for 1 second measured in milliseconds

      for(int i = 0; i < size; i++) {                               // for each element
        System.out.print("\b");                                     // erasing displayed string
      }
      System.out.println("Take a guess! (Queue the Jeopardy theme song...)");
      String input = myInput.nextLine();                            // creating user prompt

      if(input.toUpperCase().equals(sequence.toString())) {         // checking whether player input is same as random sequence (not checking for capitals)
        size++;                                                     // increment size if user guesses correct
      } else {
        System.out.println("\nNeed to work on your memory there...\nCome back when you're ready for more action!");
        System.exit(0);                                             // exit program if user guesses wrong
      }
      sequence = new StringBuilder();
    }
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
