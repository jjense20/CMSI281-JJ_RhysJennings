// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
import java.util.*;
//import java.lang.*;

class HighArray
  {
  private long[] a; // ref to array a
  private int nElems; // number of data items
  private int max;

//-----------------------------------------------------------
  public HighArray(int max) // constructor
    {
    a = new long[max]; // create the array
    nElems = 0; // no items yet
    }
//-----------------------------------------------------------
  public boolean find(long searchKey)
    { // find specified value
    int j;
    for(j = 0; j < nElems; j++) // for each element,
      if(a[j] == searchKey) // found item?
          break; // exit loop before end
      if(j == nElems) // gone to end?
        return false; // yes, can’t find it
      else
        return true; // no, found it
      } // end find()
//-----------------------------------------------------------
  public void insert(long value) // put element into array
    {
    a[nElems] = value; // insert it
    nElems++; // increment size
  }
//-----------------------------------------------------------
  public boolean delete(long value) {
    int j;
    for(j = 0; j < nElems - 1; j++) // look for it
      if( value == a[j] )
        break;
      if(j == nElems) // can’t find it
        return false;
      else { // found it
        for(int k = j; k<nElems; k++) // move higher ones down
          a[k] = a[k + 1];
        nElems--; // decrement size
        return true;
      }
    } // end delete()
//-----------------------------------------------------------
  public void display() { // displays array contents
    for(int j = 0; j < nElems; j++) // for each element,
      System.out.print(a[j] + " "); // display it
      System.out.println("");
  }
//-----------------------------------------------------------
  public void getMax() { //returns the value of the highest key in the array
    max = 0;
    for (int i = 1; i < a.length; i++) {
      if(a.length == 0) {
        max = -1;
      }
      else if (a[i] > max){
        max = (int)a[i];
      }
    } System.out.println("This is the max: "+max);
  }
//-----------------------------------------------------------
  public void noDupes() { // Removes the duplicates in an Array and reassigns them back to a
      Set<Long> b = new HashSet<Long>();
      for( long l : a ) {
         b.add( new Long( l ) );
      }
      a = new long[a.length];
      int i = 0;
      for( Long l : b ) {
         a[i++] = l.longValue();
      }
      nElems = b.size();
      System.out.println("Currently removing the Dupes!");
   }

  }

