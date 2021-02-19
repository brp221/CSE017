import java.util.InputMismatchException;
import java.util.Scanner;

/*
CSE017 Fall 2019
@Bratislav Petkovic 
Homework # 6
Program: Permutations
*/

import java.util.Scanner;
/**
 * Takes an integer n from the command line and returns all permutations 
 * of the first n letters of the english alphabet 
 */
public class Permutations{
    public static void main(String[] args){
        try{
            int n = Integer.parseInt(args[0]);
            System.out.println(factorial(n));
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Invalid Input: Please provide an integer input 0-26");
            System.exit(0);
        }
        catch(NumberFormatException exc){
            System.out.println("Invalid Input: cannot be a String must be an Integer");
            System.exit(0);
        }
        catch(InvalidNVal exc){
            System.out.println(exc.getMessage());
            System.exit(0);
        }
        catch(InputMismatchException exc){
            System.out.println("Invalid Input: must be an integer 0-26");
            System.exit(0);
        }
        
    }
    public static double factorial(int x){
        if(x>26 | x<0){
            throw new InvalidNVal() ;
        }
        if(x==0){
            return 1;
        }
        return x * factorial(x-1); 
    }
}

class InvalidNVal extends IllegalArgumentException{
    public InvalidNVal(){
        super("N must be between 0 and 26");
    }
}