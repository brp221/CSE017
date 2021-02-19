import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
CSE017 Fall 2019
@Bratislav Petkovic 
Homework # 6
Program: Combinations
*/

/**
 * Takes an integers n,k from the command line and returns all permutations 
 * of the first n letters of size k 
 */
public class CombinationsK{
    public static void main(String[] args){
        System.out.println(" ");

        try{
            int n = Integer.parseInt(args[0]);
            int r = Integer.parseInt(args[1]);
            //creating an character arraylist from which permutations
            //will be printed, alphabetical order 0-25
            char[] alphabet = new char[26];
            char[] elements = new char[n];
            for(int i = 97; i < 123; i++){
            alphabet[i-97] = (char)(i);
            }
            for(int i = 0; i < n; i++){
            elements[i] = alphabet[i];
            }
            double numPermutations =  possPermutations(n, r) ;
            int numPermutations1 =  (int) possPermutations(n, r) ;
            System.out.println("Numb of permutations for C("+n+","+r+"): " + numPermutations1);
            System.out.println(" ");  
            comboAlphabet(elements, n, r); 
            System.out.println(" ");  

        }
        catch(InvalidValN exc){
            System.out.println(exc.getMessage());
            System.exit(0);
        }
        catch(InvalidNorR exc){
            System.out.println(exc.getMessage());
            System.exit(0);
        }
        catch(InputMismatchException exc){
            System.out.println("Invalid Input: must be an integer 0-26");
            System.exit(0);
        }
        catch(NumberFormatException exc){
            System.out.println("Invalid Input: must be an integer 0-26");
            System.exit(0);
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Insufficient input: must enter an integer 0-26");
            System.exit(0);
        }
        
    }
    public static double factorial(int x){
        if(x>26 | x<0){
            throw new InvalidValN() ;
        }
        if(x==0){
            return 1;
        }
        return x * factorial(x-1); 
    }
    public static double possPermutations(int n, int r){
        if(n>26 | n<0){
            throw new InvalidValN() ;
        }
        else if(r>26 | r<0){
            throw new InvalidValN() ;
        }
        else if(r>n){
            throw new InvalidNorR() ;
        }
        return (factorial(n))/(factorial(r) *factorial(n-r)) ;
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
   * @param begin Index of first element to increment from
   * @param end Index of last element
   * @param index The current index of the data array.
   * @param k The k value user inputted
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
      //recursive call to its own method
      comboCreator(elements, data, i+1, end, index+1, k); 
    }
  } 
}
class InvalidValN extends IllegalArgumentException{
    public InvalidValN(){
        super("N must be between 0 and 26");
    }
}

class InvalidNorR extends IllegalArgumentException{
    public InvalidNorR(){
        super("N must be bigger than or equal to R");
    }
}