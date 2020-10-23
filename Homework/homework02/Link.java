public class Link {
  public int dataValue;
  public Link next;

//--------------------------------------------------------------
  public Link(int d) {
    dataValue = d;
  }

//--------------------------------------------------------------
  public void displayLink() {
    System.out.print("[" + dataValue + "] ");
  }
} // end of class Link
