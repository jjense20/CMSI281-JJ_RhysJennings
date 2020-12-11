// PriorityQApp.java
// demonstrates a priority queue in descending order
// to run this program implemented in Priority Queues: C>java PriorityQ.java
///////////////////////////////////////////////////////////////////////////////

public class PriorityQ {
// array in sorted order, from max at 0 to min at size-1
  private int maxSize;
  private long[] queArray;
  private int nItems;
  private Heap newHeap;
//-------------------------------------------------------------
  public PriorityQ(int s) { // constructor
    maxSize = s;
    queArray = new long[maxSize];
    nItems = 0;
    newHeap = new Heap(s);
  }
//-------------------------------------------------------------
  public void insert(int item) { // insert item
    newHeap.insert(item);
    nItems++;// end else (nItems > 0)
  } // end insert()
//-------------------------------------------------------------
  public long remove() { // remove minimum item
    Node root = newHeap.remove();
    nItems--;
    return root.getKey();
  }
//-------------------------------------------------------------
  public long peekMin() { // peek at minimum item
    return queArray[nItems-1]; }
//-------------------------------------------------------------
  public boolean isEmpty() { // true if queue is empty
    return (nItems==0);
  }
//-------------------------------------------------------------
  public boolean isFull() { // true if queue is full
    return (nItems == maxSize);
  }
//-------------------------------------------------------------
} // end class PriorityQ
