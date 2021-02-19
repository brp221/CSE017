
/** Class to encapsulate a tree node. */
public class Node  {
  /** The information stored in this node. */ 
  protected Integer data;
  /** Reference to the left child. */ 
  protected Node left;
  /** Reference to the right child. */ 
  protected Node right;
    /** Construct a node with given data and no children.
    @param data The data to store in this node */
    public Node(Integer data) {
      this.data = data;
      left = null;
      right = null;
    }
      /** Return a string representation of the node.
      @return A string representation of the data fields */
      public String toString () {
        return data.toString();
      } 
}