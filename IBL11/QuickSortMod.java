

/**
 CSE017 Fall 2019
 @ Bratislav Petkovic 
 IBL11
 Program: QuickSortMod
*/

import java.util.*;

public class QuickSortMod{
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter number of elements in array: ");
    int n = scnr.nextInt();
    int[] elements = new int[n];
    randomFill(elements);
    System.out.println("Original Array: ");
    System.out.println(Arrays.toString(elements));
    System.out.println();
    
    if(n > 20){
      QuickSortLast quick = new QuickSortLast();
      quick.sort(elements, 0, n-1);
    }
    else{
      InsertionSort ins = new InsertionSort();
      ins.sort(elements);
    }
    System.out.println("Sorted Array: ");
    System.out.println(Arrays.toString(elements));
  }
  
  
  public static void randomFill(int[] elements){
    Random rand = new Random();
    for(int i = 0; i < elements.length; i++){
      elements[i] = rand.nextInt(1000);
    }
  }
}

  
class InsertionSort{
  void sort(int elements[]){ 
    int n = elements.length; 
    for (int i = 1; i < n; ++i){ 
      int key = elements[i]; 
      int j = i - 1; 
      while (j >= 0 && elements[j] > key){ 
        elements[j + 1] = elements[j]; 
        j = j - 1; 
      } 
      elements[j + 1] = key; 
    } 
  } 
}
  
class QuickSortLast{
  int partition(int arr[], int low, int high){ 
    int pivot = arr[high];  
    int i = (low-1); // index of smaller element 
    for (int j = low; j < high; j++){
      if (arr[j] <= pivot){ 
        i++; 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
      } 
    } 
    
    // swap arr[i+1] and arr[high] (or pivot) 
    int temp = arr[i+1]; 
    arr[i+1] = arr[high]; 
    arr[high] = temp; 
    return i+1; 
  } 
  
  void sort(int arr[], int low, int high){ 
    if (low < high){
      int pi = partition(arr, low, high); 
      sort(arr, low, pi-1); 
      sort(arr, pi+1, high); 
    } 
  }
}
 
