// class DigitFolderApp.java 
// An app that creates test tables for FoldingHashTable
// Answer to the array size question in print output


import java.io.*;

public class DigitFolderApp {
  public static void main( String args[]) {
    FoldingHashTable theHashTable = new FoldingHashTable(50);
    int itemsToInsert[] = {1, 5, 15, 30};
    for (int i : itemsToInsert) {
      System.out.println("Time to insert the following data items: " + i);
      theHashTable.insert(new DataItem(i));
    }
    System.out.println("Expecting:\n _ 1  _  _  _ 5  _  _  _  _  _  _  _  _  _ 15  _  _  _  _  _  _  _  _  _  _  _  _  _  _ 30  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ ");
    System.out.println("\n\n\nHere's your resulting table: ");
    theHashTable.displayTable();
    System.out.println("\nCreating new table with array size that is not a multiple of 10 and has numbers greater than array size");

        FoldingHashTable theHashTable2 = new FoldingHashTable(35);
    int itemsToInsert2[] = {1, 5, 15,109, 112,456, 58, 214, 789, 453213};
    for (int i : itemsToInsert2) {
      System.out.println("Time to insert the following data items: " + i);
      theHashTable2.insert(new DataItem(i));
    }
    
    System.out.println("Expecting:\n _ 1  _  _  _ 5  _  _  _  _ 109  _  _ 112  _ 15 214  _  _  _ 453213  _  _ 58  _ 456 789  _  _  _  _  _  _  _  _ ");
    System.out.println("\n\n\nHere's your resulting table: ");
    theHashTable2.displayTable();
    System.out.println("\nIt can handle an array size that is not multiple of 10 by using the mods. \nIf the number is less than the array size it will be inserted at that index\nFor example: 112 goes at index 13 because 1+12=13");

  } // end main
} // end class DigitFolderApp

