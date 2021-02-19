import java.util.ArrayList;

/** This class demonstrates how to use generics to create
  * a general stack class that can be instantiated to hold
  * elements of any specific concrete type. The <E> is
  * the formal generic type. */
public class GenericStack<E> {
  
  // store the stack using an ArrayList of E elements
  private ArrayList<E> list;
  
  /** Initialize an empty stack. */
  public GenericStack() {    // NOTE: <E> does not appear here!!!
    list = new ArrayList<E>();
  }
  
  /** Return the size of the stack. */
  public int getSize() {
    return list.size();
  }
  
  /** Retrieve the top element of the stack without
    * changing it. */
  public E peek() {
    return list.get(list.size() - 1);
  }
  
  /** Push an element onto the stack. */
  public void push(E o) {
    list.add(o);
  }
  
  /** Remove the top element from the stack and return
    * it. */
  public E pop() {
    E o = list.get(list.size() - 1);
    list.remove(list.size() - 1);
    return o;
  }
  
  /** Return true if the stack has no elements. */
  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  public static void main(String[] args) {
    // first, let's use the stack with Strings
    GenericStack<String> myStack = new GenericStack<String>();
    myStack.push("Easton");
    myStack.push("Bethlehem");
    String s = myStack.pop();
    //myStack.push(1);
    System.out.println(s);
    
    // now, let's use it with integers
//    GenericStack<Integer> myStack2 = new GenericStack<Integer>();
//    myStack2.push(8);
//    myStack2.push(6);
//    myStack2.push(4);
//    myStack2.push(2);    
//    int i = myStack2.peek();
//    System.out.println(i);
  }
  
}