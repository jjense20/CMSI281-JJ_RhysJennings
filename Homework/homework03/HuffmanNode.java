// class HuffmanNode.java
// demonstrates creation of Huffman nodes
// to run this program: C<java HuffmanNode
////////////////////////////////////////////////////////////////////////
// Sample code for HuffmanNode class as shown in class
class HuffmanNode implements Comparable<HuffmanNode> {
  int count;          // initializing count
  char letter;        // initializing letters in String
  HuffmanNode right;  // intializing right HuffmanNode
  HuffmanNode left;   // initializing left HuffmanNode

//-----------------------------------------------------------------------------
  @Override
  public int compareTo(HuffmanNode h) {
    if(!(this.count == h.count)) {
      return this.count - h.count;
    } else {
      return this.letter - h.letter;
    }
  }
} // end method compareTo()

//-----------------------------------------------------------------------------
