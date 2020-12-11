// BinaryTreeNode.java
// demonstrates and creates binary tree nodes as well as method for traversal
// to run this program: C>java BinaryTree.java
///////////////////////////////////////////////////////////////////////////////

public class BinaryTreeNode {
   public  int data;
   private BinaryTreeNode left;
   private BinaryTreeNode right;
   BinaryTreeNode( int d ) {
       data = d;
       left = null;
       right = null;
   }
// -------------------------------------------------------------
   public void add( int s, String child ) {
      child = child.toUpperCase();
      if( child.equals( "L" ) ) {
         left = new BinaryTreeNode( s );
      } else if( child.equals( "R" ) ) {
         right = new BinaryTreeNode( s );
      } else {
         throw new IllegalArgumentException();
      }
   }
// -------------------------------------------------------------
   public BinaryTreeNode getChild( String child ) {
      child = child.toUpperCase();
      if( child.equals("L") || child.equals("R") ) {
         return (child.equals("L") ? left : right);
      } else {
         throw new IllegalArgumentException();
      }
   }
// -------------------------------------------------------------
   public int getString() {
       return data;
   }
// -------------------------------------------------------------
   public static void inOrderTraversal( BinaryTreeNode node ) {
      if( node == null ) {
         return;
      }
      inOrderTraversal( node.getChild( "L" ) );
      System.out.print( "[" + node.data + "]" );
      inOrderTraversal( node.getChild( "R" ) );
   }
} // end class BinaryTreeNode
////////////////////////////////////////////////////////////////
