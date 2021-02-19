/*
CSE017 Fall 2019
@Bratislav Petkovic 
IBL10
Program: LinearSearch
*/


public class LinearSearch{

    public static <E> int LinearSearchIter(E[] list, E key,int startIndex){
        //base case
        if (list[startIndex].equals(key)){
            return startIndex;
        }
        if(startIndex==list.length-1){
            return -1;
        }
        return LinearSearchIter(list, key, startIndex+1);
    }

    public static void main(String[] args){
        Integer[] intArr = {0,3,2,1,6};
        Double[] dubArr = {0.1,0.4,0.5,0.6,0.9};
        Character[] charArr = {'a','c','d','z','x'};
        System.out.println();
        System.out.println("Value 3, from Integer array is found at index " + (LinearSearchIter(intArr,3 , 0)+1));
        System.out.println("Value 0.4, from Double array is found at index " + (LinearSearchIter(dubArr, 0.4, 0)+1));
        System.out.println("Value 'd', from Character array is found at index " +LinearSearchIter(charArr, 'd', 0));
        System.out.println();   
        System.out.println("Value 123, from Integer array is found at index " +LinearSearchIter(intArr, 123, 0));
        System.out.println("Value 0.5, from Double array is found at index " +LinearSearchIter(dubArr, 0.5, 0));
        System.out.println("Value 'x', from Character array is found at index " +LinearSearchIter(charArr, 'x', 0));
        System.out.println();
    }

}