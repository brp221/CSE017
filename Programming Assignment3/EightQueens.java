import java.util.InputMismatchException;
import java.util.*;
/*
CSE017 Fall 2019
@Bratislav Petkovic 
Programming Assingment 3
Program: EightQueens
*/

// Backtracking recursion
// Exception Handling
// NO Scanner class


import java.util.*;
/**
 * creates a board of n*n size and places n queens on it.
 */
public class EightQueens{
  private boolean[][] board;
  private boolean[] colEmpty;
  private boolean[] upDiagEmpty;
  private boolean[] downDiagEmpty;
  /**
   * one-arg constructor for EightQueens
   * @param n
   */
  public EightQueens(int n){
    this.board = new boolean[n][n];
    this.colEmpty = new boolean[n];
    this.upDiagEmpty = new boolean[2*n-1];
    this.downDiagEmpty = new boolean[2*n-1];
    //fill arrays with true values
    Arrays.fill(this.upDiagEmpty, true);
    Arrays.fill(this.colEmpty, true);
    Arrays.fill(this.downDiagEmpty, true);
  }
  /**
   * main method where all other methods are implemented
   * @param args
   */    
  public static void main(String[] args){
    int input ;
    int n = 0;
    try{
      //parse integer input from command line
      input = Integer.parseInt(args[0]);
    }
    catch(InputMismatchException exc){
        System.out.println();
        System.out.println("Please enter an integer value for n.");
        System.out.println();
        System.exit(0);
    }
    catch(NumberFormatException exc){
        System.out.println();
        System.out.println("Please enter an integer value for n.");
        System.out.println();
        System.exit(0);
    }
    catch(ArrayIndexOutOfBoundsException exc){
        System.out.println();
        System.out.println("You did not provide input. Enter an integer val for n");
        System.out.println();
        System.exit(0);
      }
    try{
      n = Integer.parseInt(args[0]);
      if(n < 1 || n > 8){
        throw new IllegalArgumentException();
      }
    }
    catch(IllegalArgumentException exc){
        System.out.println();
        System.out.println("Please enter an n value between 1 and 8.");
        System.out.println();
        System.exit(0);
    }
    EightQueens instance = new EightQueens(n);
    instance.findSolution(0);
    if(n == 2 || n == 3){
      System.out.println("Solution for n = " + n + " does not exist.");
    }
  }
  /**
   * checks to see if it is safe to place the queen at the board[col][row] position
   * @param row
   * @param col
   * @return
   */
  public boolean isSafe(int row, int col){
    if(this.colEmpty[col] == true && this.upDiagEmpty[row + col] == true && this.downDiagEmpty[(this.board.length - 1) + row - col] == true){
      return true;
    }
    else{
      return false;
    }
  }
  /**
   * places the queen at the row and col spot by changing the value to true 
   * changes all the other values for which the queen is not safe into false
   * @param row
   * @param col
   */
  public void placeQueen(int row, int col){
    this.board[row][col] = true;
    this.colEmpty[col] = false;
    this.upDiagEmpty[row + col] = false;
    this.downDiagEmpty[(this.board.length - 1) + row - col] = false;
  }
  /**
   * Backtracking: removes queen if needed  
   * @param row
   * @param col
   */
  public void removeQueen(int row, int col){
    this.board[row][col] = false;
    this.colEmpty[col] = true;
    this.upDiagEmpty[row + col] = true;
    this.downDiagEmpty[(this.board.length - 1) + row - col] = true;
  }
  /**
   * finds the solution recursively
   * @param row
   */
  public void findSolution(int row){
    //base case
    if(row == this.board.length){
      printSolution();
      System.out.println();
      return;
    }
    else{
      for(int col = 0; col < this.board.length; col++){
        if(this.isSafe(row, col)){
          this.placeQueen(row, col);
          //recursive call findSolution
          findSolution(row + 1);
          this.removeQueen(row, col);
        }
      }
    }
  }
    
  public void printSolution(){
    for(int i = 0; i < this.board.length; i++){
      for(int j = 0; j < this.board.length; j++){
        if(this.board[i][j] == true){
          System.out.print(" Q ");
        }
        else{
          System.out.print(" * ");
        }
      }
      System.out.println();
    }
  }
}