// class SHashTable.java
// demonstrates a linear probing hash table that stores strings
// to run this program: C<java SHashTableApp.java
///////////////////////////////////////////////////////////////////////////////

import java.io.*; // importing packages
public class SHashTable
  {
  private StringData[] hashArray;   // array holds hash table
  private int arraySize;
  private StringData nonItem;       // for deleted items
// -------------------------------------------------------------
  public SHashTable(int size) {     // constructor
    arraySize = size;
    hashArray = new StringData[arraySize];
    nonItem = new StringData("_");  // deleted item key is _
    for(int i = 0; i < size; i++)
        hashArray[i] = new StringData(nonItem.getKey());
  }
// -------------------------------------------------------------
  public void displayTable() {
    System.out.print("Table: ");
    for(int j=0; j<arraySize; j++)
      {
      if(hashArray[j] != null)
        System.out.print(hashArray[j].getKey() + " ");
      else
        System.out.print("** ");
      }
      System.out.println("");
    }
// -------------------------------------------------------------
  public int hashFunc(String key) { // hasing function using String
    int hashVal = 0;
    for(int j = 0; j < key.length(); j++) {
      int letter = key.charAt(j);
      hashVal = (hashVal * 27 + letter) % arraySize;
    }
    return hashVal;
  }
// -------------------------------------------------------------
  public void insert(StringData item) { // insert a StringData
  // (assumes table not full)
    String key = item.getKey();         // extract key
    int hashVal = hashFunc(key);        // hash the key
  // until empty cell indicated by "_"
    while(hashArray[hashVal].getKey() != "_") {
      ++hashVal;                        // go to next cell
      hashVal %= arraySize;             // wraparound if necessary
    }
    hashArray[hashVal] = item;          // insert item
  } // end insert()
// -------------------------------------------------------------
  public StringData delete(String key) {      // delete a StringData
    int hashVal = hashFunc(key);              // hash the key
    while(hashArray[hashVal].getKey() != "_" && hashArray[hashVal].getKey() != null) { // until empty cell,
    // found the key?
      if(hashArray[hashVal].getKey().equals(key)) {
        StringData temp = hashArray[hashVal]; // save item
        hashArray[hashVal] = nonItem;         // delete item
        return temp;                          // return item
      }
      ++hashVal;                              // go to next cell
      hashVal %= arraySize;                   // wraparound if necessary
    }
    return null;                              // can’t find item
  } // end delete()
// -------------------------------------------------------------
  public StringData find(String key) {  // find item with key
    int hashVal = hashFunc(key);        // hash the key
    while(hashArray[hashVal] != null) { // until empty cell,
    // found the key?
    if(hashArray[hashVal].getKey() == key)
      return hashArray[hashVal];        // yes, return item
      ++hashVal;                        // go to next cell
      hashVal %= arraySize;             // wraparound if necessary
    }
    return null;                        // can’t find item
  }
// -------------------------------------------------------------
} // end class SHashTable
////////////////////////////////////////////////////////////////
