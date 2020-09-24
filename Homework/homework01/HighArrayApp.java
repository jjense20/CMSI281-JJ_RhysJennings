////////////////////////////////////////////////////////////////
class HighArrayApp
   {
   public static void main(String[] args)
   {
   int maxSize = 100; // array size
   HighArray arr; // reference to array
   HighArray arr2; // reference to array
   HighArray arr3; // reference to array
   HighArray arr4; // reference to array
   HighArray arr5; // reference to array
   arr = new HighArray(maxSize); // create the array

   arr.insert(77); // inserting Items
   arr.insert(99);
   arr.insert(44);
   arr.insert(55);
   arr.insert(22);
   arr.insert(88);
   arr.insert(11);
   arr.insert(00);
   arr.insert(66);
   arr.insert(33);
   arr.insert(77);
   arr.insert(44);
   arr.insert(11);
   arr.insert(66);
   arr.insert(33);
   arr.insert(11);
   arr.insert(35);
   arr.insert(33);
   arr.insert(8);
   arr.insert(8);
   arr.insert(0);
   arr.insert(8);



   System.out.println("Test 1");
   arr.display(); // display items

   int searchKey = 35; // search for item
   if( arr.find(searchKey) )
      System.out.println("Found " + searchKey);
   else
      System.out.println("Can't find " + searchKey);
   System.out.println("Deleting three numbers");
   arr.delete(00); 
   arr.delete(55);
   arr.delete(99);

   arr.display();
   arr.noDupes();
   arr.getMax(); //  prints max value in the long array
   arr.display(); // display items again
//Test 2
   System.out.println("");
   System.out.println("Test 2");
   arr2 = new HighArray(maxSize);
   arr2.insert(77); // inserting Items
   arr2.insert(99);
   arr2.insert(44);
   arr2.insert(55);
   arr2.insert(22);
   arr2.insert(88);
   arr2.insert(11);
   arr2.insert(00);
   arr2.insert(66);
   arr2.insert(33);
   arr2.insert(77);
   arr2.insert(44);
   arr2.insert(11);
   arr2.insert(66);
   arr2.insert(33);
   arr2.insert(23);
   arr2.insert(66);
   arr2.insert(33);
   arr2.insert(8);
   arr2.insert(8);
   arr2.insert(0);
   arr2.insert(8);

   arr2.display();
   arr2.getMax(); //  prints max value in the long array
   arr2.delete(99);
   System.out.println("Deleting 99");
   arr2.getMax(); 
   arr2.display();

//Test 3
   System.out.println("");
   System.out.println("Test 3");
   arr3 = new HighArray(maxSize);
   arr3.insert(12); // Inserting Items
   arr3.insert(12);
   arr3.insert(43);
   arr3.insert(57);
   arr3.insert(789);
   arr3.insert(345);
   arr3.insert(43);
   arr3.insert(04);
   arr3.insert(64);
   arr3.insert(0);
   arr3.insert(21);
   arr3.insert(44);
   arr3.insert(11);
   arr3.insert(66);
   arr3.insert(33);
   arr3.insert(23);
   arr3.insert(66);
 

   arr3.display();
   arr3.getMax(); //  prints max value in the long array
   arr3.delete(789);
   System.out.println("Deleting 789");
   arr3.getMax(); 
   arr3.noDupes();
   arr3.display();

//Test 4
   System.out.println("");
   System.out.println("Test 4");
   arr4 = new HighArray(maxSize);
   arr4.insert(16); // Inserting Items
   arr4.insert(12);
   arr4.insert(43);
   arr4.insert(16);
   arr4.insert(4239);
   arr4.insert(31);
   arr4.insert(31);
   arr4.insert(31);
   arr4.insert(20);
   arr4.insert(20000);
   arr4.insert(21);
   arr4.insert(44);
   arr4.insert(11);
   arr4.insert(11);
   arr4.insert(4);
   arr4.insert(23);
   arr4.insert(66);
 

   arr4.display();
   arr4.getMax(); //  prints max value in the long array
   arr4.delete(20000);
   System.out.println("Deleting 20,000");
   arr4.getMax(); 
   arr4.noDupes();
   arr4.display();
//Test 5
   System.out.println("");
   System.out.println("Test 5");
   arr5 = new HighArray(maxSize);
   arr5.insert(12); // Inserting Items
   arr5.insert(12);
   arr5.insert(54);
   arr5.insert(54);
   arr5.insert(439);
   arr5.insert(12);
   arr5.insert(76);
   arr5.insert(76);
   arr5.insert(2078);
   arr5.insert(20);
   arr5.insert(21);
   arr5.insert(4);
   arr5.insert(1);
   arr5.insert(113);
   arr5.insert(4);
   arr5.insert(23);
   arr5.insert(66);
 

   arr5.display();
   arr5.getMax(); //  prints max value in the long array
   arr5.delete(2078);
   System.out.println("Deleting 2078");
   arr5.getMax(); 
   System.out.println("Inserting a new max");
   arr5.insert(5001);
   arr5.getMax(); 
   arr5.noDupes();
   arr5.display();
   } // end main()
} // end class HighArrayApp
////////////////////////////////////////////////////////////////
