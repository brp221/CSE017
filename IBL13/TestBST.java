/*
CSE017 Fall 2019
@ Bratislav Petkovic 
IBL 13
Program: TestBST
*/

/** Test class for BinarySearchTree class */
public class TestBST {
  public static void main(String[] args){
    Node root = new Node(4); // Creates a root with integer value 4.
    BinarySearchTree bin = new BinarySearchTree(root); // Creates a new BinarySearchTree object to be modified with nodes. 
    bin.add(7); 
    bin.add(2);
    bin.add(4);
    bin.add(1);
    bin.add(3);
    bin.add(6); // Adds nodes with these integer values to a binary tree structure.
    System.out.println("Root: " +root);
    System.out.print("Left Subtree: "); // Read subtrees up-down, left-right.
    System.out.print(root.left+ " ");
    System.out.print(root.left.left+ " ");
    System.out.print(root.left.right+ " ");
    System.out.println();
    System.out.print("Right Subtree: "); // Read subtrees up-down, left-right.
    System.out.print(root.right+ " ");
    System.out.print(root.right.left+ " ");
    System.out.print(root.right.right+ " ");
    System.out.println();
    // Everything to the left of the root is less than the root.
    // Everything to the right of the root is greater than the root.
    System.out.println(bin.find(4));
    System.out.println(bin.find(8)); // Find method returns the integer if in the tree, returns null if not in the tree.
    bin.delete(7); // Deletes the node with integer value 7 from the tree.
    System.out.println(root.right.right); // root.right.right now returns null because 7 was deleted from the tree.
  }
}