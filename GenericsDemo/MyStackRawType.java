import java.util.ArrayList;

/** A class for storing objects in a stack. The stack
  * is modelled using an ArrayList which allows it to
  * expand when the capacity is reached. Taken from
  * Listing 11.10, p. 439. */
public class MyStackRawType {
  
  private ArrayList list = new ArrayList();
  
  /** Return true if there are no elements in the stack,
    * otherwise return false. */
  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  /** Return the number of elements in the stack. */
  public int getSize() {
    return list.size();
  }
  
  /** Return the top element of the stack without altering
    * the stack. */
  public Object peek() {
    return list.get(getSize() - 1);
  }
 
  /** Remove the top element from the stack and return it. */
  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }
  
  /** Adds an object to the top of the stack and
    * return a reference to it. */
  public Object push(Object o) {
    list.add(o);
    return o;
  }
  
  /** Return the index of the first match of the object,
    * starting from the top of the stack and working down. 
    * This is not a standard stack operation, but is easy
    * to do if the stack is an ArrayList. */
  public int search(Object o) {
    return list.lastIndexOf(o);
  }
  
  /** Override Object's toString() method  */
  public String toString() {
    return "stack: " + list.toString();
  }
}
  
  
  