/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  IBL8
 *  Program : RecursiveCalls
 */ 


public class RecursiveCalls{
    public static void backwardsAlphabet(char currLetter){
        if(currLetter=='a'){
            System.out.println(currLetter);
        }
        else{
            System.out.println(currLetter+ " ");
            backwardsAlphabet(--currLetter);
        }
    }

    public static void main(String[] args){
        char startingLetter;
        startingLetter = 'z' ;
        /*The GRAND SOLUTION */
        backwardsAlphabet(startingLetter);

    }
}