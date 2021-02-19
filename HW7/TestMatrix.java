import java.util.*;

/**
 CSE017 Fall 2019
 @ Bratislav Petkovic
 Homework #7 
 Program: TestMatrix
 */

/*
 * Test Class
 */
public class TestMatrix{
  
    /**
     * Test code for adding and subtracting sparse matrices(ijk format).
     */
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter the number of rows in your matrices:");
    int row = scnr.nextInt();
    System.out.println("Enter the number of columns in your matrices:");
    int col = scnr.nextInt();
    
    System.out.println("Input the elements for the first integer matrix.");
    Integer[][] intArray1 = new Integer[row][col];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        while(!scnr.hasNextInt()){
          System.out.println("Enter an integer:");
          scnr.next();
        }
        intArray1[i][j] = scnr.nextInt();
      }
    }
    //array creation
    System.out.println("Input the elements for the second integer matrix.");
    Integer[][] intArray2 = new Integer[row][col];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        while(!scnr.hasNextInt()){
          System.out.println("Enter an integer:");
          scnr.next();
        }
        intArray2[i][j] = scnr.nextInt();
      }
    }
        
    System.out.println("Input the elements for the first double matrix.");
    Double[][] doubleArray1 = new Double[row][col];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        while(!scnr.hasNextDouble()){
          System.out.println("Enter a double:");
          scnr.next();
        }
        doubleArray1[i][j] = scnr.nextDouble();
      }
    }
        
    System.out.println("Input the elements for the second double matrix.");
    Double[][] doubleArray2 = new Double[row][col];
    for(int i = 0; i < row; i++){
      for(int j = 0; j < col; j++){
        while(!scnr.hasNextDouble()){
          System.out.println("Enter an integer:");
          scnr.next();
        }
        doubleArray2[i][j] = scnr.nextDouble();
      }
    }
        
    System.out.println();
    SparseGenericMatrix<Integer> genMatrix1 = new SparseGenericMatrix<Integer>(intArray1);
    SparseGenericMatrix<Double> genMatrix2 = new SparseGenericMatrix<Double>(doubleArray1);
    SparseGenericMatrix<Integer> genMatrix3 = new SparseGenericMatrix<Integer>(intArray2);
    SparseGenericMatrix<Double> genMatrix4 = new SparseGenericMatrix<Double>(doubleArray2);
    
    // genMatrix1
    System.out.println("Integer Matrix #1");
    printArr2D(intArray1);
    System.out.println();
    System.out.println("Integer Matrix #1 in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(genMatrix1.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(genMatrix1.getColArray());
    System.out.print("Value(k): ");
    printArr1D(genMatrix1.getValArray());
    System.out.println();
    
    // genMatrix2
    System.out.println("Double Matrix #1");
    printArr2D(doubleArray1);
    System.out.println();
    System.out.println("Double Matrix #1 in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(genMatrix2.getRowArray());
    System.out.print("Column(j: ");
    printArr1D(genMatrix2.getColArray());
    System.out.print("Value(k): ");
    printArr1D(genMatrix2.getValArray());
    System.out.println();
        
    // genMatrix3
    System.out.println("Integer Matrix #2");
    printArr2D(intArray2);
    System.out.println();
    System.out.println("Integer Matrix #2 in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(genMatrix3.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(genMatrix3.getColArray());
    System.out.print("Value(k): ");
    printArr1D(genMatrix3.getValArray());
    System.out.println();
    
    // genMatrix4
    System.out.println("Double Matrix #2");
    printArr2D(doubleArray2);
    System.out.println();
    System.out.println("Double Matrix #2 in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(genMatrix4.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(genMatrix4.getColArray());
    System.out.print("Value(k): ");
    printArr1D(genMatrix4.getValArray());
    System.out.println();
    
    // genMatrix1 + genMatrix3
    System.out.println("Integer Matrix Addition");
    GenericMatrixOperations matrixSum = new GenericMatrixOperations();
    Integer[][] result = matrixSum.addMatrices(genMatrix1, genMatrix3, row, col);
    printArr2D(matrixSum.addMatrices(genMatrix1, genMatrix3, row, col));
    SparseGenericMatrix<Integer> resultInt = new SparseGenericMatrix<Integer>(result);
    System.out.println();
    System.out.println("Integer Matrix in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(resultInt.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(resultInt.getColArray());
    System.out.print("Value(k): ");
    printArr1D(resultInt.getValArray());
    System.out.println();
    
    // genMatrix1 - genMatrix3
    System.out.println("Integer Matrix Subtraction");
    GenericMatrixOperations matrixDiff = new GenericMatrixOperations();
    Integer[][] resultDiff = matrixDiff.subMatrices(genMatrix1, genMatrix3, row, col);
    printArr2D(matrixDiff.subMatrices(genMatrix1, genMatrix3, row, col));
    SparseGenericMatrix<Integer> resultIntDiff = new SparseGenericMatrix<Integer>(resultDiff);
    System.out.println();
    System.out.println("Integer Matrix in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(resultIntDiff.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(resultIntDiff.getColArray());
    System.out.print("Value(k): ");
    printArr1D(resultIntDiff.getValArray());
    System.out.println();
        
    // genMatrix2 + genMatrix4
    System.out.println("Double Matrix Addition");
    GenericMatrixOperations matrixSumDoub = new GenericMatrixOperations();
    Double[][] resultD = matrixSumDoub.addMatricesDoub(genMatrix2, genMatrix4, row, col);
    printArr2D(matrixSumDoub.addMatricesDoub(genMatrix2, genMatrix4, row, col));
    SparseGenericMatrix<Double> resultDoub = new SparseGenericMatrix<Double>(resultD);
    System.out.println();
    System.out.println("Double Matrix in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(resultDoub.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(resultDoub.getColArray());
    System.out.print("Value(k): ");
    printArr1D(resultDoub.getValArray());
    System.out.println();
    
    // genMatrix2 - genMatrix4
    System.out.println("Double Matrix Subtraction");
    GenericMatrixOperations matrixDiffDoub = new GenericMatrixOperations();
    Double[][] resultDiffD = matrixDiffDoub.subMatricesDoub(genMatrix2, genMatrix4, row, col);
    printArr2D(matrixDiffDoub.subMatricesDoub(genMatrix2, genMatrix4, row, col));
    SparseGenericMatrix<Double> resultDiffDoub = new SparseGenericMatrix<Double>(resultDiffD);
    System.out.println();
    System.out.println("Double Matrix in i,j,k format: ");
    System.out.print("Row(i): ");
    printArr1D(resultDiffDoub.getRowArray());
    System.out.print("Column(j): ");
    printArr1D(resultDiffDoub.getColArray());
    System.out.print("Value(k): ");
    printArr1D(resultDiffDoub.getValArray());
    System.out.println();
    
    /*GenericMatrixOperations matrixSum1 = new GenericMatrixOperations();
     Integer[][] result1 = matrixSum1.addMatrices(genMatrix1, genMatrix2, 3, 3);
     printArr2D(matrixSum1.addMatrices(genMatrix1, genMatrix2, 3, 3));
     SparseGenericMatrix<Integer> resultInt1 = new SparseGenericMatrix<Integer>(result);
     System.out.println();
     System.out.println("Integer Array in i,j,k format :");
     System.out.print("Row(i)    :");
     printArr1D(resultInt1.getRowArray());
     System.out.print("Column(j) :");
     printArr1D(resultInt1.getColArray());
     System.out.print("Value(k)  :");
     printArr1D(resultInt1.getValArray());
     System.out.println();*/ 
    // Runtime Error: Double cannot be cast to Integer.
    
    /*GenericMatrixOperations matrixSumDoub1 = new GenericMatrixOperations();
     Double[][] resultD1 = matrixSumDoub1.addMatricesDoub(genMatrix1, genMatrix4, 3, 3);
     printArr2D(matrixSumDoub1.addMatricesDoub(genMatrix1, genMatrix4, 3, 3));
     SparseGenericMatrix<Double> resultDoub1 = new SparseGenericMatrix<Double>(resultD1);
     System.out.println();
     System.out.println("Double Array in i,j,k format :");
     System.out.print("Row(i)    :");
     printArr1D(resultDoub1.getRowArray());
     System.out.print("Column(j) :");
     printArr1D(resultDoub1.getColArray());
     System.out.print("Value(k)  :");
     printArr1D(resultDoub1.getValArray());
     System.out.println();*/
    // Runtime Error: Integer cannot be cast to Double.
  }

       
  /**
   * Prints a generic 2D matrix of a specified type.
   * @param array The generic 2D matrix.
   */
  public static <E> void printArr2D(E[][] array){
    for(int i=0; i < array.length;i++){
      System.out.println();
      for(int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j]+ " ");
      }
    }
    System.out.println();
  }
  
  /**
   * Prints the ijk format arrays for the corresponding matrix.
   * @param array The generic array type representing rows, columns, and nonzero values of the matrix.
   */
  public static <E> void printArr1D(ArrayList<E> array){
    System.out.print("[");
    for(int i = 0; i < array.size(); i++){
      System.out.print(array.get(i) + " ");
    }
    System.out.print("]");
    System.out.println();
  }
}