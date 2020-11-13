// OddEvenSortApp.java
// demonstrates odd and even sort
// to run this program: C>java OddEvenSortApp
////////////////////////////////////////////////////////////////
class ArrayBub {
  private long[] a;     // ref to array a
  private int nElems;   // number of data items

//--------------------------------------------------------------
   public ArrayBub(int max)  { // constructor
     a = new long[max];        // create the array
     nElems = 0;               // no items yet
   } // end constructor

//--------------------------------------------------------------
   public void insert(long value) { // put element into array
     a[nElems] = value;             // insert it
     nElems++;                      // increment size
   } // end method insert()

//--------------------------------------------------------------
   public void display() {           // displays array contents
     for(int j = 0; j < nElems; j++) // for each element,
     System.out.print(a[j] + " ");   // display it
     System.out.println("");
   } // end method display()

//--------------------------------------------------------------
   public void OddEvenSort() {
     boolean isSorted = false;  // initial array that is unsorted
     while (!isSorted) {
       isSorted = true;
       for (int i = 0; i < nElems - 1; i++) {
         if (a[i + 1] < a[i])
         isSorted = false;
       }
// Performing bubble sort on odd indexed element in the array
       for (int i = 1; i < nElems; i = i + 2) { // for every other element
         if (i + 1 < nElems) {
           if (a[i + 1] < a[i]) {               // check for greater value
             swap(i + 1, i);                    // calling swap method to move greater value to end
           }
         }
       }
// Performing bubble sort on even indexed element in the array
       for (int i = 0; i < nElems; i = i + 2) { // for every other element
         if (i + 1 < nElems) {
           if (a[i + 1] < a[i]) {               // check for greater value
             swap(i + 1, i);                    // calling swap method to move greater value to end
           }
         }
       }
     }
   } // end method OddEvenSort()

//--------------------------------------------------------------
   private void swap(int one, int two) {
     long temp = a[one];
     a[one] = a[two];
     a[two] = temp;
   }
//--------------------------------------------------------------
} // end class ArrayBub
////////////////////////////////////////////////////////////////
class OddEvenSortApp {
  public static void main(String[] args)
  {
    int maxSize = 100;            // array size
    ArrayBub arr;                 // reference to array
    arr = new ArrayBub(maxSize);  // create the array
    System.out.println("\nConstructing Array...\n");
    arr.insert(77);               // insert 10 items
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);
    System.out.println("Before Odd-Even Sort: ");
    arr.display();                // display items
    arr.OddEvenSort();            // odd even sort them
    System.out.println("\nAfter Odd-Even Sort: ");
    arr.display();                // display them again
  }   // end main()
} // end class BubbleSortApp
////////////////////////////////////////////////////////////////
