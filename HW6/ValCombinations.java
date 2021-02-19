

import java.util.*;

/*
CSE017 Fall 2019
@ Valentine Perevalov 
Homework #6
Program: CombinationsK
*/

/**
 * Takes integers n and k from user input and returns all combinations 
 * of the first n letters of size k. 
 */
public class ValCombinations{
  public static void main (String[] args){
    boolean invalidInputN = true;
    boolean invalidInputK = true;
    int n = 0;
    int k = 0;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter an n value between 0 and 26.");
    
    // Check input for n value.
    while(invalidInputN){
      if(scnr.hasNextInt()){
        n = scnr.nextInt();
        if(n > 0 && n <= 26){
          invalidInputN = false;
          break;
        }
        else{
          System.out.println("Enter an n value between 0 and 26.");
          scnr.nextLine();
        }
      }
      else{
        System.out.println("Enter an integer value for n.");
        scnr.nextLine();
      }
    }
    System.out.println("Enter a k value between 0 and n.");
    
    // Check input for k value.
    while(invalidInputK){
      if(scnr.hasNextInt()){
        k = scnr.nextInt();
        if(k > 0 && k < n){
          invalidInputK = false;
          break;
        }
        else{
          System.out.println("Enter a k value between 0 and n.");
          scnr.nextLine();
        }
      }
      else{
        System.out.println("Enter an integer value for k.");
        scnr.nextLine();
      }
    }
    char[] alphabet = new char[26];
    char[] elements = new char[n];
    for(int i = 97; i < 123; i++){
       alphabet[i-97] = (char)(i);
    }
    for(int i = 0; i < n; i++){
      elements[i] = alphabet[i];
    }
    System.out.println("When n = " + n + " and k = " + k);
    comboAlphabet(elements, n, k); 
  }
  /**
   * Creates an array of length k to output the combinations.
   * @param elements The array of the first n letters of the alphabet.
   * @param n The number of letters to be combined.
   * @param k The number of letters in a single combination.
   */
  public static void comboAlphabet(char elements[], int n, int k){
    char data[] = new char[k]; 
    comboCreator(elements, data, 0, n-1, 0, k);
  }
  
  /**
   * Recursive method that creates all the combinations of length k with n elements.
   * @param elements The initial array of n elements.
   * @param data The combination array of k elements.
   * @param begin The index from which to start incrementing.
   * @param end The last index of the elements array.
   * @param index The current index of the data array.
   * @param k The k value inputted by the user.
   */
  public static void comboCreator(char elements[], char data[], int begin, int end, int index, int k){ 
    if(index == k){ 
      for(int i = 0; i < k; i++){ 
        System.out.print(data[i]);
      }
        System.out.println();
        return;
    } 
    for(int i = begin; i <= end; i++){ 
      data[index] = elements[i]; 
      comboCreator(elements, data, i+1, end, index+1, k); 
    }
  } 
}