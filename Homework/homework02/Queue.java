// queue.java
// demonstrates queue
// to run this program: C>java QueueApp
// Dual-programmed with JJ and Rhys Jennings :)
////////////////////////////////////////////////////////////////

class Queue
  {
  private int maxSize;
  private long[] queArray;
  private int front;
  private int rear;
  private int nItems;

//--------------------------------------------------------------
  public Queue(int s) // constructor
    {
    maxSize = s;
    queArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
    }

//--------------------------------------------------------------
  public void insert(long j) { // put item at rear of queue
    if(!isFull()) {
    if(rear == maxSize-1) // deal with wraparound
      rear = -1;
    queArray[++rear] = j; // increment rear and insert
    nItems++; // one more item
  } else
  System.out.println("The Queue is full!\n");
}

//--------------------------------------------------------------
  public long remove() // take item from front of queue
    {
    long temp = queArray[front++]; // get value and incr front
    if(front == maxSize) // deal with wraparound
      front = 0;
    nItems--; // one less item
    return temp;
    }

//--------------------------------------------------------------
  public void display() {
    if (!isEmpty()){
      for (int i = 0; i < nItems; i++) {
        System.out.println(queArray[(front + i) % maxSize]);
      }
    } else {
      System.out.println("The Queue is empty, some values need to be added!\n");
    }
  }

//--------------------------------------------------------------
  public long peekFront() // peek at front of queue
    {
    return queArray[front];
    }

//--------------------------------------------------------------
  public boolean isEmpty() // true if queue is empty
    {
    return (nItems==0);
    }

//--------------------------------------------------------------
  public boolean isFull() // true if queue is full
    {
    return (nItems==maxSize);
    }

//--------------------------------------------------------------
  public int size() // number of items in queue
    {
    return nItems;
    }

//--------------------------------------------------------------
  } // end class Queue
////////////////////////////////////////////////////////////////
