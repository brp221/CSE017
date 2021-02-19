
public class TestCircular{  
public static void main(String[] args) {
    CircularLinkedList c = new CircularLinkedList();
    c.addNodeAtStart(3);
    c.addNodeAtStart(2);
    c.addNodeAtStart(1);
    c.print();
    c.deleteNodeFromStart();
    c.print();
    c.addNodeAtEnd(4);
    c.print();
    System.out.println("Size of linked list: "+ c.getSize());
    System.out.println("Element at 2nd position: "+ c.elementAt(2));
  }
}