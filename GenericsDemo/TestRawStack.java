public class TestRawStack{  
  
  public static void main(String[] args) {
    // first, let's use the stack with Strings
    MyStack myStack = new MyStack();
    myStack.push("Easton");
    myStack.push("Bethlehem");
    String s = (String)myStack.pop();
    System.out.println(s);
    myStack.push(1);
    s = (String)myStack.pop();
    System.out.println(s);
    
  }
}