// class FoldingHashTable.java
// Implementing a hash function that does digital folding for any array size or key size.
// Using Base code from figure 11.1 in textbook (Orignally Hash.java)
// Question: Does it matter if the array is not a multiple of 10? Answered In output of DigitFolderApp.java
import java.io.*;
public class FoldingHashTable {
  private DataItem[] hashArray; // array holds hash table
  private int arraySize;
  private DataItem nonItem;     // for deleted items
  private int mod;
// -------------------------------------------------------------
  public FoldingHashTable(int size) { // constructor
    arraySize = size;
    hashArray = new DataItem[arraySize];
    nonItem = new DataItem(-1); // deleted item key is -1
    mod = 1;
    while (size > 0) {// Caluclating Mod based on the arraySize
      size /= 10; 
      mod *= 10; 
    }
  }
// -------------------------------------------------------------
  public void displayTable() {
      for(int j = 0; j < arraySize; j++) {
      if(hashArray[j] != null)
        System.out.print(hashArray[j].getKey() + " "); 
    else
        System.out.print(" _ "); // Indicates an empty index
      }
      System.out.println(""); // Adds a line between table and cmd line
    }
// -------------------------------------------------------------
  public int hashFunc(int key) {
    int hashVal = 0;
    while (key > 0) { // Grouping Numbers if necessary
      hashVal+= key % mod;
      key /= mod;
    }
    return hashVal % arraySize; // hash function
  }
// -------------------------------------------------------------
  public void insert(DataItem item) { // insert a DataItem
// (assumes table not full)
    int key = item.getKey(); // extract key
    int hashVal = hashFunc(key); // hash the key
// until empty cell or -1,
    while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
      ++hashVal; // go to next cell
      hashVal %= arraySize; // wraparound if necessary
    }
    hashArray[hashVal] = item; // insert item
  } // end insert()
// -------------------------------------------------------------
  public DataItem delete(int key) { // delete a DataItem
    int hashVal = hashFunc(key); // hash the key
    while(hashArray[hashVal] != null) { // until empty cell,
// found the key?
      if(hashArray[hashVal].getKey() == key) {
        DataItem temp = hashArray[hashVal]; // save item
        hashArray[hashVal] = nonItem; // delete item
        return temp; // return item
      }
      ++hashVal; // go to next cell
      hashVal %= arraySize; // wraparound if necessary
    }
    return null; // can’t find item
  } // end delete()
// -------------------------------------------------------------
  public DataItem find(int key) { // find item with key
    int hashVal = hashFunc(key); // hash the key
    while(hashArray[hashVal] != null) { // until empty cell,
// found the key?
    if(hashArray[hashVal].getKey() == key)
      return hashArray[hashVal]; // yes, return item
      ++hashVal; // go to next cell
      hashVal %= arraySize; // wraparound if necessary
    }
    return null; // can’t find item
  }
// -------------------------------------------------------------
} // end class FoldingHashTable
////////////////////////////////////////////////////////////////
