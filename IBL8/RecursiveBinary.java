/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  IBL8
 *  Program : RecursiveBinary 
 */ 

public class RecursiveBinary{
  public static int binarySearch(int[] list, int key, int low, int high){
    int mid = (low + high)/2;
    
    if(low > high){
      return -1;
    }
    
    if(list[mid] == key){
      return mid;
    }
    else if(list[mid] > key){
      return binarySearch(list, key, low, mid-1);
    }
    else{
      return binarySearch(list, key, mid+1, high);
    }
  }
  
  public static void main(String[] args){
    int[] myList = {2, 4, 7, 9, 10, 11, 19, 29, 30};
    int key1 = 29;
    int key2 = 0;
    int findKey1 = binarySearch(myList, key1, 0, myList.length-1);
    System.out.println(findKey1);
    int findKey2 = binarySearch(myList, key2, 0, myList.length-1);
    System.out.println(findKey2);
  }
}