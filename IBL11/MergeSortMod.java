
/**
 CSE017 Fall 2019
 @ Bratislav Petkovic 
 IBL11
 Program: MergeSortMod
*/


import java.util.*;

public class MergeSortMod{
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
      MergeSort merge = new MergeSort();
      merge.mergeSort(elements);
    }
    else{
      SelectionSort sel = new SelectionSort();
      sel.sort(elements);
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

  
class MergeSort { 
  public static void mergeSort(int[] list) { 
    if (list.length > 1){
      int[] firstHalf = new int[list.length / 2]; 
      System.arraycopy(list, 0, firstHalf, 0, list.length/2); 
      mergeSort(firstHalf);
      int secondHalfLength = list.length - list.length / 2;  
      int[] secondHalf = new int[secondHalfLength]; 
      System.arraycopy(list, list.length/2,  
                       secondHalf, 0, secondHalfLength); 
      mergeSort(secondHalf);
      merge(firstHalf, secondHalf, list); 
    } 
  } 
  
  public static void merge(int[] list1, int[] list2, int[] temp) { 
    int current1 = 0;   // index in list1 
    int current2 = 0;   // index in list2 
    int current3 = 0;   // index in temp 
    while (current1 < list1.length && current2 < list2.length) { 
      if (list1[current1] < list2[current2]) 
        temp[current3++] = list1[current1++]; 
      else 
        temp[current3++] = list2[current2++]; 
    } 
    while (current1 < list1.length) 
      temp[current3++] = list1[current1++]; 
    while (current2 < list2.length) 
      temp[current3++] = list2[current2++]; 
  }
}
  
class SelectionSort{ 
  void sort(int arr[]){ 
    int n = arr.length;  
    for (int i = 0; i < n-1; i++){
      int min = i; 
      for (int j = i+1; j < n; j++) 
        if (arr[j] < arr[min]){ 
        min = j;
      }
      int temp = arr[min]; 
      arr[min] = arr[i]; 
      arr[i] = temp; 
    } 
  }
}