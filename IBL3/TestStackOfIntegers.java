
import java.util.*;

public class TestStackOfIntegers{
    public static void main(String[] args){
        //initialize StackOfIntegers class
        StackOfIntegers testStack = new StackOfIntegers() ;
        testStack.push(1); // push method adds a member at the last index 
        testStack.push(2);
        testStack.push(5);
        int a = testStack.pop(); //pop method returns the last member of array : 5 
        int b = testStack.pop(); // 2
        int c = testStack.pop(); // 1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Stack is empty, right?" );
        System.out.println(testStack.empty());
    }
}