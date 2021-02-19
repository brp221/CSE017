//Bratislav Petkovic 
//EightQueens One Solution
//November 8th 2019
import java.util.*;

public class EightQueensOneSoln{
  private boolean[][] board;
  private boolean[] colEmpty;
  private boolean[] upDiagEmpty;
  private boolean[] downDiagEmpty;
  
  public EightQueensOneSoln(int n){
    this.board = new boolean[n][n];
    this.colEmpty = new boolean[n];
    this.upDiagEmpty = new boolean[2*n-1];
    this.downDiagEmpty = new boolean[2*n-1];
    //fill the arrays with true values
    Arrays.fill(this.colEmpty, true);
    Arrays.fill(this.downDiagEmpty, true);
    Arrays.fill(this.upDiagEmpty, true);
  }
  
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Input the size of the board.");
    int n = scnr.nextInt();
    EightQueensOneSoln query = new EightQueensOneSoln(n);
    boolean solnExists = query.findSolution(0);
    if(!solnExists){
      System.out.println("No solution exists for n = " + n);
    }
  }
  
  public boolean isSafe(int row, int col){
    if(this.colEmpty[col] == true && this.upDiagEmpty[row + col] == true && this.downDiagEmpty[(this.board.length - 1) + row - col] == true){
      return true;
    }
    else{
      return false;
    }
  }
  /**
   * Places the queen on the board in the row,col spot
   * @param row
   * @param col
   */
  public void placeQueen(int row, int col){
    this.board[row][col] = true;
    this.colEmpty[col] = false;
    this.upDiagEmpty[row + col] = false;
    this.downDiagEmpty[(this.board.length - 1) + row - col] = false;
  }
  
  public void removeQueen(int row, int col){
    this.board[row][col] = false;
    this.colEmpty[col] = true;
    this.upDiagEmpty[row + col] = true;
    this.downDiagEmpty[(this.board.length - 1) + row - col] = true;
  }
  
  public boolean findSolution(int row){
    //when the row reaches n, the program has found a solution  
    if(row == this.board.length){
      //print the solved board
      printSolution();
      // the solution does exist
      return true;
    }
    else{
      for(int col = 0; col < this.board.length; col++){
        if(this.isSafe(row, col)){
          this.placeQueen(row, col);
          //recursive call
          if(this.findSolution(row + 1)){
            return true;
          }
          this.removeQueen(row, col);
        }
      }
      //if the solution is not found return false
      return false;
    }
  }






  /**
   * Prints the board with the solution
   * If the val at i j is true prints a queen
   */
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
