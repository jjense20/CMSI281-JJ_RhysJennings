// class QueueApp to test Queue.java file
class QueueApp {
  public static void main(String[] args) {
    Queue theQueue1 = new Queue(5); // constructing queue1 that holds 5 items
    System.out.println("\nConstructing Queue1");
    System.out.println("Testing insert method for QueueApp: ");
    System.out.println("\nShould display 10, 20, 30, 40, 50\n");
    System.out.println("Executing code...\n");

    theQueue1.insert(10);
    theQueue1.insert(20);
    theQueue1.insert(30);
    theQueue1.insert(40);
    theQueue1.insert(50); // inserting 5 items into Queue1

    theQueue1.display(); // should print 10, 20, 30, 40 ,50

    System.out.println("\n------------------------------------------------------------------------------------------------\n");

    Queue theQueue2 = new Queue(5);
    System.out.println("\nConstructing Queue2");
    System.out.println("Testing remove method for QueueApp: ");
    System.out.println("\nShould display 60, 70, 80, 90, 10 before items have been removed\n");
    System.out.println("Executing code...\n");

    theQueue2.insert(60);
    theQueue2.insert(70);
    theQueue2.insert(80);
    theQueue2.insert(90);
    theQueue2.insert(10); // inserting 5 items into Queue2

    theQueue2.display(); // should print 60, 70, 80, 90, 10

    System.out.println("\nShould display the last two items in Queue: 90, 10\n");
    System.out.println("Executing code...\n");

    theQueue2.remove();
    theQueue2.remove();
    theQueue2.remove(); // removing 3 items from fornt of Queue2

    theQueue2.display();

    System.out.println("\n------------------------------------------------------------------------------------------------\n");

    Queue theQueue3 = new Queue(5);
    System.out.println("\nConstructing Queue3");
    System.out.println("Testing error output when trying to add values to empty Queue for QueueApp: ");
    System.out.println("\nShould output error message when trying to remove value from empty Queue\n");
    System.out.println("Executing code...\n");

    theQueue3.insert(10);
    theQueue3.remove();
    theQueue3.display(); // initializing methods

    theQueue3.remove();
    theQueue3.display(); // removing from empty Queue

    System.out.println("\n------------------------------------------------------------------------------------------------\n");

    Queue theQueue4 = new Queue(5);
    System.out.println("\nConstructing Queue4");
    System.out.println("Testing error output when trying to add values to full Queue for QueueApp: ");
    System.out.println("\nShould display a full Queue with 1, 2, 3, 4, 5\n");
    System.out.println("Executing code...\n");

    theQueue4.insert(1);
    theQueue4.insert(2);
    theQueue4.insert(3);
    theQueue4.insert(4);
    theQueue4.insert(5); // inserting 5 items into Queue4
    theQueue4.display();

    System.out.println("\nShould output error message when trying to insert value into a full Queue\n");
    System.out.println("Executing code...\n");

    theQueue4.insert(6); // inserting item into full Queue

    System.out.println("\nThese are the items that are still left in the Queue:\n"); // should output previous items
    theQueue4.display();

    System.out.println("\n------------------------------------------------------------------------------------------------\n");

    Queue theQueue5 = new Queue(5);
    System.out.println("\nConstructing Queue5");
    System.out.println("Testing display method when there are no values in Queue for QueueApp: ");
    System.out.println("\nShould display an error message\n");
    System.out.println("Executing code...\n");

    theQueue5.display(); // should output error message for empty Queue

    System.out.println("\nTesting display method when there is one value in Queue for QueueApp: ");
    System.out.println("\nShould display a Queue with one item, 99\n");
    System.out.println("Executing code...\n");

    theQueue5.insert(99); // inserting 99 into Queue
    theQueue5.display(); // should display 99

    System.out.println("\n------------------------------------------------------------------------------------------------\n");

    System.out.println("End of Test Cases for QueueApp!!!");

  } // end main()
} // end class QueueApp
