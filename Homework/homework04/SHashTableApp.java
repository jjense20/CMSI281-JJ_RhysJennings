// class SHashTableApp.java
// demonstrates a main to run and test the linear probing hash table
// to run this program: C<java SHashTableApp.java
///////////////////////////////////////////////////////////////////////////////

import java.io.*; // importing packages
public class SHashTableApp {
  public static void main(String[] args) throws IOException {
    StringData aStringData;
    String aKey;
    int  size, n, keysPerCell;
// get sizes
    System.out.print("Enter size of hash table: ");
    size = getInt();
    System.out.print("Enter initial number of items: ");
    n = getInt();
    keysPerCell = 10;
// make table
    SHashTable theSHashTable = new SHashTable(size);
    for(int j=0; j<n; j++) {                            // insert data
      aKey = Double.toString(java.lang.Math.random() * keysPerCell * size);
      aStringData = new StringData(aKey);
      theSHashTable.insert(aStringData);
    }
    while(true) {                                       // interact with user
      System.out.print("Enter first letter of ");
      System.out.print("show, insert, delete, or find: ");
      char choice = getChar();
      switch(choice) {
        case 's':
          theSHashTable.displayTable();
          break;
        case 'i':
        System.out.print("Enter key value to insert: ");
          aKey = getString();
          aStringData = new StringData(aKey);
          theSHashTable.insert(aStringData);
          break;
        case 'd':
          System.out.print("Enter key value to delete: ");
          aKey = getString();
          theSHashTable.delete(aKey);
          break;
        case 'f':
          System.out.print("Enter key value to find: ");
          aKey = getString();
          aStringData = theSHashTable.find(aKey);
          if(aStringData != null) {
            System.out.println("Found " + aKey);
          } else
          System.out.println("Could not find " + aKey);
          break;
        default:
        System.out.print("Invalid entry\n");
      } // end switch
    } // end while
  } // end main()
//--------------------------------------------------------------
  public static String getString() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }
//--------------------------------------------------------------
  public static char getChar() throws IOException {
    String s = getString();
    return s.charAt(0);
  }
//-------------------------------------------------------------
  public static int getInt() throws IOException {
    String s = getString();
    return Integer.parseInt(s);
  }
//--------------------------------------------------------------
} // end class SHashTableApp
////////////////////////////////////////////////////////////////
