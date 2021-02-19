
/*
CSE 17 Fall 2019
@author Bratislav Petkovic 
Programming Assignment #4   
Program: CircularLinkedList
*/

/**
 * Represents a circular linked list.
 */
public class CircularLinkedList{
  
  /*
   * Head of the list.
   */
  private Node head;
  
  /**
   * Tail of the list.
   */
  private Node tail;
  
  /**
   * Size of the list.
   */
  private int size;
  
  /**
   * No-arg constructor for CircularLinkedList.
   */
  public CircularLinkedList(){
    head = null;
    tail = null;
  }
  
  /**
   * Adds a node at the start of the list.
   * @param data The numerical data associated with the node.
   */
  public void addStart(int data){
    Node n = new Node(data);
    if(size == 0){
      head = n;
      tail = n;
      n.next = head;
    }
    else{
      Node currNode = head;
      n.next = currNode;
      head = n;
      tail.next = head;
    }
    size++;
    System.out.println("Adding node " +data+ " at the start");
  }
  
  /**
   * Adds a node at the end of the list.
   * @param data The numerical data associated with the node.
   */
  public void addEnd(int data){
    if(size == 0){
      addStart(data);
    }
    else{
      Node n = new Node(data);
      tail.next = n;
      tail = n;
      tail.next = head;
      size++;
      System.out.println("Adding node " +data+ " at end");
    }
  }
 
  /**
   * Deletes a node from the start of the list.
   */
  public void deleteStart(){
    if(size == 0){
      return;
    }
    System.out.println("Deleting node " +head.data+ " at start");
    if(head != tail){
      head = head.next;
      tail.next = head;
    }
    else{
      head = tail = null;
    }
    size--;
  }
  
  /**
   * Deletes a node from the end of the list.
   */
  public void deleteEnd(){
    if(size == 0){
      return;
    }
    System.out.println("Deleting node " +tail.data+ " at end");
    if(head != tail){
      Node temp = head;
      while(temp.next != tail){
        temp = temp.next;
      }
      tail = temp;
      tail.next = head;
    }
    else{
      head = tail = null;
    }
    size--;
  }
  
  /**
   * Adds a node at a specified index within the list.
   * @param data The numerical data associated with the node.
   * @param position The index where the node will be inserted.
   */
  public void addAtIndex(int data, int position){
    if(position == 1){
      addStart(data);
    }
    int len = size;
    if(position > len + 1 || position < 1){
      System.out.println("INVALID POSITION\n");
    }
    if(position == len + 1){
      addEnd(data);
    }
    if(position <= len && position > 1){
      System.out.println("Adding node " +data+ " at index " +position);
      Node n = new Node(data);
      Node currNode = head;
      for(int i = 1; i < position-1; i++){
        currNode = currNode.next;
      }
      n.next = currNode.next;
      currNode.next = n;
      size++;
    }
  }
  
  /**
   * Returns the element contained at a certain index of the list.
   * @param index The index to be examined within the list.
   */
  public int getElement(int index){
    if(index > size){
      return -1;
    }
    Node n = head;
    while(index - 1 != 0){
      n = n.next;
      index--;
    }
    return n.data;
  }

  /**
   * Overrides the toString method to print the list.
   */
  @Override
  public String toString(){
    if(head == null){
      return "EMPTY LIST";
    }
    else{
      String list = "";
      Node currNode = head;
      do{
        list += currNode.data;
        list += " ";
        currNode = currNode.next;
      }
      while(currNode != head);
      return "Circular Linked List: " +list;
    }
  }
}

/**
 * Node behavior associated with a circular linked list.
 */
class Node{
  int data;
  Node next;
  
  /**
   * 1-arg constructor for Node.
   * @param data The numerical data associated with the node.
   */
  public Node(int data){
    this.data = data;
    this.next = next;
  }
}