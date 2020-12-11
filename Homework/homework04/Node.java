// Node.java
// demonstrates and creates data nodes and integer keys
// to run this program implemented in Priority Queues: C>java HeapApp
///////////////////////////////////////////////////////////////////////////////

import java.io.*;
////////////////////////////////////////////////////////////////
public class Node {
   private int iData; // data item (key)
// -------------------------------------------------------------
   public Node(int key) { // constructor
     iData = key;
   }
// -------------------------------------------------------------
   public int getKey() {
     return iData;
   }
// -------------------------------------------------------------
   public void setKey(int id) {
     iData = id;
   }
// -------------------------------------------------------------
} // end class Node
////////////////////////////////////////////////////////////////
