import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
CSE017 Fall 2019
@Bratislav Petkovic 
Homework # 6
Program: PermutationsK
*/

/**
 * Takes an integers n,k from the command line and returns all permutations 
 * of the first n letters of size k 
 */
public class PermutationsK{
    public static void main(String[] args){
        System.out.println(" ");
        //creating an character arraylist from which permutations
        //will be printed, alphabetical order 0-25
        ArrayList<Character> alphabet = new ArrayList<Character>(26);
        for(char i = 'a'; i <= 'z' ; i++){
            alphabet.add(i);
        }
        try{
            int n = Integer.parseInt(args[0]);
            int r = Integer.parseInt(args[1]);  
            int numPermutations1 =  (int) possPermutations(n, r) ;
            System.out.println("Numb of permutations: " + numPermutations1);
            System.out.println("");
            ArrayList<ArrayList<Character>> perms = new ArrayList<>();
            ArrayList<Character> useableLetters = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Character letter = alphabet.get(i);
                useableLetters.add(letter);
                ArrayList<Character> set = new ArrayList<>();
                set.add(letter);
                perms.add(set);
            }

            ArrayList<ArrayList<Character>> lettersForPerm = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Character> set = new ArrayList<>(useableLetters);
                set.remove(i);
                lettersForPerm.add(set);
            }

            for (Character c : useableLetters) {
                System.out.print(c);
            }
            System.out.println();

            for (int i = 0; i < perms.size(); i++) {
                ArrayList<Character> perm = perms.get(i);
                ArrayList<Character> letters = lettersForPerm.get(i);
                permutations(perm,letters,r);
            }
                
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
            System.out.println("Invalid Input, cannot be a string: must be an integer 0-26");
            System.exit(0);
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("No Input provided: must be an integer 0-26");
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
        return (factorial(n))/(factorial(n-r)) ;
    }
    public static void permutations(ArrayList<Character> perm, ArrayList<Character> charLeft, int max) {
        if (perm.size() < max) {
          int size = charLeft.size();
          for (int i = 0; i < size; i++) {
            ArrayList<Character> updatedCharLeft = new ArrayList<>(charLeft);
            ArrayList<Character> updatedPerm = new ArrayList<>(perm);
            Character c = updatedCharLeft.get(i);
            updatedCharLeft.remove(i);
            updatedPerm.add(c);
            permutations(updatedPerm, updatedCharLeft, max);
          }
          return;
        }
    
        for (int i = 0; i < perm.size(); i++) {
          System.out.print(perm.get(i));
        }
        System.out.println();
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