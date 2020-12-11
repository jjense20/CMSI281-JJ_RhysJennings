// PriorityQApp.java
// demonstrates a main to run a Priority Queue in descending order
// to run this program implemented in Priority Queues: C>java PriorityQApp.java
////////////////////////////////////////////////////////////////

// Using Priority Queue code provided from the Lafore textbook 4.6, implemented with heaps
public class PriorityQApp {
   public static void main(String[] args) {
      PriorityQ thePQ = new PriorityQ(5);
// inserting items into the queue
      thePQ.insert(30);
      thePQ.insert(50);
      thePQ.insert(10);
      thePQ.insert(40);
      thePQ.insert(20);
// will remove the largest value from the queue
      thePQ.remove();
      while( !thePQ.isEmpty() ) {
        long item = thePQ.remove();
        System.out.print(item + " "); // 10, 20, 30, 40, 50
      } // end while
      System.out.println(""); // 40, 30, 20, 10
    } // end main()
//-------------------------------------------------------------
} // end class PriorityQApp
