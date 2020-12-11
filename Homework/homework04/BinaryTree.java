// BinaryTree.java
// demonstrates a binary tree and in-order traversal
// to run this program: C>java BinaryTree.java
///////////////////////////////////////////////////////////////////////////////

// importing packages
import java.util.Scanner;
// -------------------------------------------------------------

public class BinaryTree {
   public static void pressReturn() {
      System.out.print( "        [press 'enter' to see the result]... <=" );
      Scanner myInput = new Scanner( System.in );
      myInput.nextLine();
   }
// -------------------------------------------------------------

   public static void main( String[] args ) {
      BinaryTreeNode root = new BinaryTreeNode( 0 );
      root.add( 1, "L" );
      root.add( 2, "R" );
      BinaryTreeNode one = root.getChild( "L" );
      BinaryTreeNode two = root.getChild( "R" );
      one.add( 3, "L" );
      one.add( 4, "R" );
      two.add( 5, "L" );
      two.add( 6, "R" );
      BinaryTreeNode six = two.getChild( "R" );
      six.add( 7, "L" );
      six.add( 8, "R" );

// Printlines to visualize what the trees will look like
      System.out.println( "\n\n  ==== the tree looks like this [sorta]: \n\n" );
      System.out.println( "                   (0)" );
      System.out.println( "                   / \\" );
      System.out.println( "                  /   \\" );
      System.out.println( "                 /     \\" );
      System.out.println( "                /       \\" );
      System.out.println( "              (1)       (2)" );
      System.out.println( "              / \\       / \\" );
      System.out.println( "             /   \\     /   \\" );
      System.out.println( "           (3)   (4) (5)   (6)" );
      System.out.println( "                           / \\" );
      System.out.println( "                          /   \\" );
      System.out.println( "                        (7)   (8)" );

// Showcasing how an in-order traversal will go through the tree nodes
      System.out.println( "\n\n   Results for what an in-order traversal looks like!\n" );
      pressReturn();
      System.out.print( "        " );
      BinaryTreeNode.inOrderTraversal( root );
      System.out.print( "\n\n\n" );
   }
} // end class BinaryTree
////////////////////////////////////////////////////////////////
