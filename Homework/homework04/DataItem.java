// class DataItem.java
// demonstrates and stores DataItem as well as creating an int key
// to run this program: C<java HashTableApp.java
///////////////////////////////////////////////////////////////////////////////

import java.io.*;
////////////////////////////////////////////////////////////////
public class DataItem
  { // (could have more data)
    public int iData; // data item (key)
//--------------------------------------------------------------
  public DataItem(int ii) { // constructor
    iData = ii; }
//--------------------------------------------------------------
  public int getKey() {
    return iData; }
//--------------------------------------------------------------
} // end class DataItem
////////////////////////////////////////////////////////////////
