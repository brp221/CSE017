
public class BinarySearchTree extends BinaryTree  {
  /** Return boolean value from the public add method. */ 
  protected boolean addReturn;
  /** Return Integer value from the public delete method. */
  protected Integer deleteReturn;
  
  /**
   * 1-arg constructor for the binary search tree. 
   * @param root
   */
  public BinarySearchTree(Node root){
    super(root);
  }
  
  /** Starter method add.
    @param item The Integer being inserted
    @return true if the object is inserted, false
    if the object already exists in the tree
    */
  public boolean add(Integer item) {
    root = add(root, item);
    return addReturn;
  }
  /**
   *  Recursive add method
   * @param localRoot
   * @param item
   * @return a Node
   */
  private Node add(Node localRoot, Integer item) {
    if (localRoot == null) {
      addReturn = true;
      return new Node(item);
    } 
    else if (item.compareTo(localRoot.data) == 0) { 
      addReturn = false;
      return localRoot;
    } 
    else if (item.compareTo(localRoot.data) < 0) { 
      localRoot.left = add(localRoot.left, item); return localRoot;
    } 
    else {
      
      localRoot.right = add(localRoot.right, item); return localRoot;
    } 
  }
  /**
   * finds the target Integer
   * @param target
   * @return Integer
   */
  public Integer find(Integer target) {
    return find(root, target);
  }
  /**
   * recursive method add
   * @param localRoot
   * @param target
   * @return
   */
  private Integer find(Node localRoot, Integer target) {
    if (localRoot == null)
      return null;
    int compResult = target.compareTo(localRoot.data);
    if (compResult == 0)
      return localRoot.data;
    else if (compResult < 0)
      return find(localRoot.left, target);
    else
      return find(localRoot.right, target);
  }
  /**
   * deletes target Integer 
   * @param target
   * @return Integer
   */
  public Integer delete(Integer target) {
    root = delete(root, target);
    return deleteReturn;
  }
  /**
   * recursive delete method
   * @param localRoot
   * @param item
   * @return
   */
  private Node delete(Node localRoot, Integer item) {
    if (localRoot == null) {
      
      deleteReturn = null;
      return localRoot;
    }
    
    int compResult = item.compareTo(localRoot.data); if (compResult < 0) {
      
      localRoot.left = delete(localRoot.left, item); 
      return localRoot;
    } 
    else if (compResult > 0) {
      
      localRoot.right = delete(localRoot.right, item); 
      return localRoot;
    } 
    else {
      
      if (localRoot.left == null) {
        
        return localRoot.right;
      } 
      else if (localRoot.right == null) {
        
        return localRoot.left;
      } 
      else {
        
        if (localRoot.left.right == null) {
          
          localRoot.data = localRoot.left.data;
          
          localRoot.left = localRoot.left.left;
          return localRoot;
        } 
        else {
          
          localRoot.data = findLargestChild(localRoot.left); 
          return localRoot;
        } 
      }
    } 
  }
  /**
   * finds the largest child.
   * @param parent
   * @return
   */
  private Integer findLargestChild(Node parent) {
    
    if (parent.right.right == null) {
      Integer returnValue = parent.right.data; parent.right = parent.right.left; return returnValue;
    } else {
      return findLargestChild(parent.right);
    } 
  }
  /**
   * does the tree contain the element
   * @param elem
   * @return boolean
   */
  public boolean contains(Integer elem){
    return elem.equals(find(elem));
  }
  
  
  
}