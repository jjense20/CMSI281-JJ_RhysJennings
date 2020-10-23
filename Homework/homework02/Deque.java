// importing packages for test cases
import java.io.IOException;

public class Deque {

     private int maxSize;
     private long[] queArray;
     private int first;
     private int last;
     private int nItems;

//----------------------------------------------------------------------------------
     //the contructor
     public Deque(int s) {
          maxSize = s;
          queArray = new long[maxSize];
          first = 1;
          last = 0;
          nItems = 0;
        }

//----------------------------------------------------------------------------------
     // insert item to the front of the queue
     public void insL(long j) {
          if(!isFull())
          {
            first--;
            if(first < 0) first = maxSize-1;
            queArray[first] = j;
            nItems++;
          }
          else
          System.out.println("\nThe Deuque is full :(");
        }

//----------------------------------------------------------------------------------
     // remove item from the front of the queue
     public long rmvL() { //
          if(!isEmpty())
          {
            long temp = queArray[first++];
            if(first >= maxSize)
              first = 0;
            nItems--;
            return temp;
          } else {
            System.out.println("\nThe Deque is empty :(");
            return -1;
          }
        }

//----------------------------------------------------------------------------------
     //insert item to the end of the queue
     public void insR(long j) {
          if(!isFull()) {
            last++;
            if(last >= maxSize) last = 0;
            queArray[last] = j;
            nItems++;
          } else {
            System.out.println("\nThe Deque is full :(");
        }
     }

//----------------------------------------------------------------------------------
     // remove item from the end of the queue
     public long rmvR() {
          if(!isEmpty()) {
              long temp = queArray[last--];
              if(last < 0)
                last = maxSize - 1;
              nItems--;
              return temp;
            } else {
              System.out.println("\nThe Deque is empty :(");
              return -1;
            }
          }

//----------------------------------------------------------------------------------
     // true if queue is empty
     public Boolean isEmpty() {
       return (nItems==0);
     }

//----------------------------------------------------------------------------------
     // true if queue is full
     public Boolean isFull() {
       return (nItems==maxSize);
     }

//----------------------------------------------------------------------------------
     // number of items in queue
     public int size() {
       return nItems;
     }

//----------------------------------------------------------------------------------
     // display items in queue
     public void display() {
      System.out.println("\nHere's what numbers you have:\n");
      for (int i = 0; i < nItems; i++) {
         System.out.print("[" + queArray[(first +i) % maxSize] + "] " );
       }
       System.out.println("\n");
     }

     // nothing to see here just running some test cases
     public static void main(String[] args) throws IOException {
        //creating an instance of deque
        System.out.println("Constructing Deque 1");
        System.out.println("Testing insert Left and insert right methods\n");
        System.out.println("Should Display [10], [30], [20], [50], [40]");
        Deque deque1 = new Deque(5);
        deque1.insL(20);
        deque1.insL(30);
        deque1.insL(10);
        deque1.insR(50);
        deque1.insR(40);
        deque1.display();
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Constructing Deque 2");
        System.out.println("Testing insert Left and insert right methods when list is full\n");
        System.out.println("Should tell you the list full and only display the first five items");
        System.out.println("[10], [30], [20], [50], [40]");
        System.out.println("\n");
        System.out.println("Executing Code...");
        Deque deque2 = new Deque(5);
        deque2.insL(20);
        deque2.insL(30);
        deque2.insL(10);
        deque2.insR(50);
        deque2.insR(40);
        deque2.insR(60);
        deque2.display();
        System.out.println("------------------------------------------------------------------------------");


        System.out.println("Constructing Deque 3");
        System.out.println("Testing remove Left and remove right methods\n");
        System.out.println("Should tell you the list full and only display the first five items");
        System.out.println("[10], [30], [20], [50], [40]");
        System.out.println("\nAfter removing right and left we should be left with:");
        System.out.println("[30], [20], [50]");
        System.out.println("\n");
        System.out.println("Executing Code...");
        Deque deque3 = new Deque(5);
        deque3.insL(20);
        deque3.insL(30);
        deque3.insL(10);
        deque3.insR(50);
        deque3.insR(40);
        deque3.display();
        System.out.println("Removing...");
        deque3.rmvR();
        deque3.rmvL();
        deque3.display();

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Constructing Deque 4");
        System.out.println("Testing remove methods to empy out a list\n");
        System.out.println("Should tell you the list is empty if you remove too many");
        System.out.println("Inserting: [30], [20]");
        System.out.println("\n");
        System.out.println("Executing Code...");
        Deque deque4 = new Deque(5);
        deque4.insL(20);
        deque4.insL(30);
        deque4.display();
        System.out.println("Removing...");
        deque4.rmvL();
        deque4.rmvL();
        deque4.rmvL();
        deque4.display();
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Constructing Deque 5");
        System.out.println("Testing diplay when there is zero items or only one item\n");
        System.out.println("Should display the one item or tell you the list is empty");
        System.out.println("Inserting: [20]");
        System.out.println("\n");
        System.out.println("Executing Code...");
        Deque deque5 = new Deque(5);
        deque5.insL(20);

        deque5.display();
        System.out.println("Removing...");
        deque5.rmvL();
        deque5.display();
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("End of Test Cases for Deque!!!");
    }
//----------------------------------------------------------------------------------
}
// end of class Deque
