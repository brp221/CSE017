/*
CSE 17 Fall 2019
@author Bratislav Petkovic 
Programming Assignment #4  	
Program: DoublyLinkedList
*/

//deleteStart
//deleteEnd
//addAtIndex
//getElement
//toString

/**
 * Represents a circular linked list.
 */
class DoublyLinkedList{
    /** 
     * Head of the list.
    */
    private Node head;
    /** 
     * Head of the last.
    */
    private Node last;
    /*
    * size of the list.
   */
    public int size;
    /**
    * No-arg constructor for DoublyLinkedList.
    */
    public DoublyLinkedList(){
        this.size = 0;
    }
    /**
     * represents the node class 
     */
    class Node{
        /**
         * integer type to represent data 
         */
        int data;
        /**
         * previous node
         */ 
        Node prev;
        /**
         * next node
         */ 
        Node next;

        /**
         * one arg constructor for Node 
         * @param d
         */
        public Node(int d){
            data = d;
        }        
    }   
        /**
         * adds a node at the head of the list
         * @param newData
         */
        public void addStart(int newData){
            // allocate node and put the data in
            Node newNode = new Node(newData);
            //the next of new node is the head and the previous is null
            newNode.next = head;
            newNode.prev = null;
            //change prev of head node to the new code
            if(head != null){
                head.prev = newNode;
            }
            // make the head point to the new node
            head = newNode;
            size++;
        }
        /**
         * adds a node at the tail of the list
         * @param new_data
         */
        public void addEnd(int new_data) 
        { 
            // allocate node  and  put in the data 
            Node newNode = new Node(new_data); 
            // used down in step 5
            Node last = head; 
            //the newNode's next is going to be a null
            newNode.next = null; 
        
            //If the Linked List is empty, make the new node the head
            if (head == null) { 
                newNode.prev = null; 
                head = newNode; 
                return; 
            } 
        
            //Else traverse till the last node 
            while (last.next != null) 
                last = last.next; 
        
            // Change the next of last node 
            last.next = newNode; 
        
            //make last node the previous of this one since its a DLL
            newNode.prev = last; 
        } 
        /**
         * adds a node at the tail of the list
         * @param newData
         */
        public void add(int newData) {
            Node temp = new Node(newData);
            if (head == null) {
                head = temp;
                last = head;
            } else {
                last.next = temp;
                temp.prev = last;
                last = temp;
            }
            size++;
        } 
        /**
         * returns the element at the specified index 
         * @param index
         * @return element 
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
         * adds a node at the specified index  
         * @param index
         * @param element
         */
        public void add(int index, int element) {
            Node newNode = new Node(element);
            if (index < 0 || index > size){
                throw new IndexOutOfBoundsException();
            }
            else if (index == 0) {			// insert before head
                addStart(element);
            }
            else if (index == size) { 	// insert after tail
                add(element);
            }
            else {					    // general case
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                Node previous = current.prev;
                previous.next = newNode;
                newNode.prev = previous;
                newNode.next = current;
                current.prev = newNode;
                size++;
            }
        }
        /**
         * prints the list out starting from the given node 
         * @param node
         */
        public void toString(Node node){
        
        Node last = null; 
        while (node != null) { 
            System.out.print(node.data + " "); 
            last = node; 
            node = node.next; 
        } 
  
        System.out.println(); 
    } 
        /**
         * deletes the node at the head of the list and shifts the other nodes 
         */
        public void deleteStart() {  
            //Checks whether list is empty  
            if(head == null) {  
                return;  
            }  
            else {  
                //Checks whether the list contains only one element  
                if(head != last) {  
                    //head will point to next node in the list  
                    head = head.next;  
                    //Previous node to current head will be made null  
                    head.prev = null;  
                }  
                //If the list contains only one element  
                //then, it will remove node and now both head and tail will point to null  
                else {  
                    head = last = null;  
                }  
            }  
        }  
        /**
         * deletes the tail of the node 
         */
        public void deleteEnd(){
            //Checks whether list is empty  
            if(head == null) {  
                return;  
            }  
            else {  
                //Checks whether the list contains only one node  
                if(head != last) {  
                    //Previous node to the tail will become new tail  
                    last = last.prev;  
                    //Node next to current tail will be made null  
                    last.next = null;  
                }  
                //If the list contains only one element  
                //Then it will remove node and now both head and tail will point to null  
                else {  
                    head = last = null;  
                }  
            }  
        }  
}
