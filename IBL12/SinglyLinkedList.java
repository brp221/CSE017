

/*
CSE 17 Fall 2019
@author Bratislav Petkovic 
IBL#12  	
Program: SinglyLinkedList
*/
public class SinglyLinkedList{
  
  public Node head;
  public int size;
  
  public SinglyLinkedList(){
    head = null;
  }
  
  public void addStart(int data){
    Node n = new Node(data);
    n.next = head;
    head = n;
    size++;
  }
  
  public void addEnd(int data){
    if(head == null){
      addStart(data);
    }
    else{
      Node n = new Node(data);
      Node currNode = head;
      while(currNode.next != null){
        currNode = currNode.next;
      }
      currNode.next = n;
      size++;
    }
  }
  
  public int deleteStart(){
    if(head == null){
      return -1;
    }
    
    Node n = head;
    head = head.next;
    return n.data;
  }
  
  public void deleteEnd(){
    Node currNode = head;
    if(head.next == null){
      head = null;
    }
    else{
      while(currNode.next.next != null){
        currNode = currNode.next;
      }
      int temp = currNode.next.data;
      currNode.next = null;
      size--;
    }
  }
  
  public int elementAt(int index){
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
  
  public int getSize(){
    return size;
  }
  
  public int search(int data){
    int index = 0;
    Node currNode = head;
    if(head.data == data){
      return index;
    }
    else{
      while(currNode.next != null){
        currNode = currNode.next;
        index++;
        if(currNode.data == data){
          return index;
        }
      }
    }
    return -1;
  }
  
  public void addAtIndex(int data, int position){
    if(position == 1){
      addStart(data);
    }
    int len = size;
    if(position > len + 1 || position < 1){
      System.out.println("\nINVALID POSITION");
    }
    if(position == len + 1){
      addEnd(data);
    }
    if(position <= len && position > 1){
      Node n = new Node(data);
      Node currNode = head;
      while((position - 2) > 0){
        System.out.println(currNode.data);
        currNode = currNode.next;
        position--;
      }
      n.next = currNode.next;
      currNode.next = n;
      size++;
    }
  }
  
  @Override
  public String toString(){
    String list = "";
    Node currNode = head;
    while(currNode != null){
      list += currNode.data;
      currNode = currNode.next;
    }
    return "List: " +list;
  }
}

class Node{
  public int data;
  public Node next;
  
  public Node(int data){
    this.data = data;
  }
}
