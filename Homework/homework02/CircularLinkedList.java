public class CircularLinkedList {

  private int nItems;
  private Link first;
  private Link last;
  private Link current;
  public CircularLinkedList getCurrent;

    public CircularLinkedList() {
      first = null;
      last = null;
      current = null;
      nItems = 0;
    }

//--------------------------------------------------------------
    public boolean isEmpty() {
      return first == null;
    }

//--------------------------------------------------------------
    public void step() {
      current = current.next;
    }

//--------------------------------------------------------------
    public Link getCurrent() {
      return current;
    }

    public int getCurrentInt() {
      return current.dataValue;
    }
//--------------------------------------------------------------
    public Link getFirst() {
      return first;
    }

//--------------------------------------------------------------
    public void insert(int d) {
      Link newLink = new Link(d);
      if (isEmpty()) {
          first = newLink;
          current = first;
      } else {
        current.next = newLink;
      }
      newLink.next = first;
      last = newLink;
      step();
      nItems++;
    }

//--------------------------------------------------------------
    public boolean searchFor(int d) {
      Link searchFor = first;
      int i = 0;
      while (searchFor.dataValue != d && i < nItems) {
        searchFor = searchFor.next;
        i++;
      }
      if(searchFor.dataValue == d) {
        System.out.println("Found the value: " + searchFor.dataValue);
        return true;
      } else {
        System.out.println("The value you are looking for is not in the Circular Linked List...");
        return false;
      }
    }

//--------------------------------------------------------------
    public void delete(int d) {
      Link prev = first;
      Link c = first.next;
      while (c.dataValue != d) {
        prev = c;
        c = c.next;
      }
      if (nItems == 1) {
        first = null;
        nItems--;
      } else if (c == first) {
        prev.next = c.next;
        first = c.next;
        nItems--;
      } else {
        prev.next = c.next;
        nItems--;
      }
      getBackToCurrent();
    }

//--------------------------------------------------------------
    public void displayList() {
      int d = 0;
      Link p = first;
        while (d < nItems) {
          p.displayLink();
          p = p.next;
          d++;
        }
        System.out.println("");
    }

//--------------------------------------------------------------
    public void getBackToCurrent(){
      Link p = first;
      for (int i = 0; i<nItems ;i++){
        step();
      }
    }

//--------------------------------------------------------------
    public static void main(String[] args) {
      CircularLinkedList list1 = new CircularLinkedList();
      System.out.println("\nConstructing Circular Linked List 1");
      System.out.println("Testing insert method for Circular Linked List: ");
      System.out.println("\nShould display a Cirular Linked List with 10, 20, 30, 40, 50\n");
      System.out.println("Executing code...\n");

      list1.insert(10);
      list1.insert(20);
      list1.insert(30);
      list1.insert(40);
      list1.insert(50);
      list1.displayList();

      System.out.println("\n------------------------------------------------------------------------------------------------");

      CircularLinkedList list2 = new CircularLinkedList();
      System.out.println("\nConstructing Circular Linked List 2");
      System.out.println("Testing removeAt method for Circular Linked List: ");
      System.out.println("\nShould display a Cirular Linked List with 10, 20, 30, 40, 50 before values are removed\n");
      System.out.println("Executing code...\n");

      list2.insert(10);
      list2.insert(20);
      list2.insert(30);
      list2.insert(40);
      list2.insert(50);
      list2.displayList();

      System.out.println("\nShould display 20, 30, 40, after removing the values 10 and 50\n");
      System.out.println("Executing code...\n");

      list2.delete(10);
      list2.delete(50);
      list2.displayList();

      System.out.println("\nShould display 20, 30, 40, 50, 60 after inserting values 50 and 60\n");
      System.out.println("Executing code...\n");

      list2.insert(50);
      list2.insert(60);
      list2.displayList();

      System.out.println("\n------------------------------------------------------------------------------------------------");

      CircularLinkedList list3 = new CircularLinkedList();
      System.out.println("\nConstructing Circular Linked List 3");
      System.out.println("Testing searchFor method for Circular Linked List: ");
      System.out.println("\nShould display a Circular Linked List with 10, 20, 30, 40, 50\n");
      System.out.println("Executing code...\n");

      list3.insert(10);
      list3.insert(20);
      list3.insert(30);
      list3.insert(40);
      list3.insert(50);
      list3.displayList();

      System.out.println("\nShould display the value 30 in the Circular Linked List\n");
      System.out.println("Executing code...\n");

      list3.searchFor(30);

      System.out.println("\nShould output an error when looking for a value that is not in the Circular Linked List\n");
      System.out.println("Executing code...\n");

      list3.searchFor(60);

      System.out.println("\n------------------------------------------------------------------------------------------------");

      System.out.println("End of Test Cases!!!");
    }
  } // end of CircularLinkedList class
