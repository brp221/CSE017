

public class TestDouble{  
public static void main(String[] args) {
    DoublyLinkedList d = new DoublyLinkedList();
    Node x = d.add(0, 1);
    d.addStart(1);
    d.toString();
    d.addEnd(3);
    d.toString();
    //d.add(4,x);
    d.toString();
    d.deleteEnd();
    d.toString();
    System.out.println("Element at index 2: "+ d.getElement(1));
    d.addStart(1);
    d.toString();
    d.deleteEnd();
    d.toString();
    System.out.println("Size of the Linked List: " + d.size);
  }
}