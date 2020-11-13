// class HuffmanApp.java
// demonstrates huffman encoding using user prompted string statements
// to run this program: C<java HuffmanApp
///////////////////////////////////////////////////////////////////////////////
import java.util.Scanner; // importing packages for user prompts

//--------------------------------------------------------------------------------------------------------------
public class HuffmanApp {
  public static void main(String[] args) { // main
    System.out.println("\nEnter your message:\n");
    Scanner myInput = new Scanner(System.in);                           // user prompt for String
		String input = myInput.nextLine();
    System.out.println("\nInitial string statement: " + input + "\n" + "-------------------------------------------------");
    String s = Huffman.encode(input);                                   // call on encode method in Huffman.java
    Huffman.decode(s);                                                  // call on decode method in Huffman.java
  } // end main()
} // end class HuffmanApp

//--------------------------------------------------------------------------------------------------------------
