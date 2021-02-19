public class StackOfIntegers{
    private int[] elements ; 
    private int size ;

    public StackOfIntegers(){
        this.elements = new int[16] ;
    }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
    }

    public void push(int value){
        elements[size++] = value ;
    }

    public int pop(){
        return elements[--size];
    }
    
    public int peek(){
        return elements[size - 1];
    }

    public boolean empty(){
        return size == 0 ;
    }

    public int getSize(){
        return this.size ;
    }


    }