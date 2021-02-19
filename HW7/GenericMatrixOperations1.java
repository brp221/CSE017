import java.lang.reflect.Array;
import java.util.*;

/**
 CSE017 Fall 2019
 @ Bratislav Petkovic 
 Homework #7
 Program: GenericMatrixOperations
*/

/**
 * Class that allows matrix addition and subtraction to be performed.
 */
public class GenericMatrixOperations1<E extends Number>{
  
  /**
   * Method to add two Integer matrices.
   * @param mat1 The first matrix to be added.
   * @param mat2 The second matrix to be added.
   * @param row The number of rows in the matrices.
   * @param col The number of columns in the matrices.
   * @return The resulting Integer matrix. 
   */
  public Integer[][] addMatrices(SparseGenericMatrix<E> mat1, SparseGenericMatrix<E> mat2, int row, int col){
    Integer[][] sum = new Integer[row][col];  
    for(Integer i = 0; i < mat1.getValArray().size(); i++){
      sum[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Integer)(mat1.getValArray().get(i));
      for(Integer j = 0; j < mat2.getValArray().size(); j++){
        if((mat1.getColArray().get(i).equals(mat2.getColArray().get(j))) && (mat1.getRowArray().get(i).equals(mat2.getRowArray().get(j)))){
          sum[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Integer)(mat1.getValArray().get(i)) + (Integer)(mat2.getValArray().get(j)); 
        }
      }
    }
    for(int i = 0; i < sum.length; i++){
      for(int j = 0; j < sum[i].length; j++){
        if(sum[i][j] == null){
          sum[i][j] = 0;
        }
        for(Integer k = 0; k < mat2.getValArray().size(); k++){
          if((mat2.getColArray().get(k).equals(j)) && (mat2.getRowArray().get(k).equals(i)) && (sum[i][j].equals(0))){
            sum[i][j] = (Integer)mat2.getValArray().get(k);
          }
        }
      }
    }
    return sum;
  }
  
  /**
   * Method to add two Double matrices.
   * @param mat1 The first matrix to be added.
   * @param mat2 The second matrix to be added.
   * @param row The number of rows in the matrices.
   * @param col The number of columns in the matrices.
   * @return The resulting Double matrix. 
   */
  public Double[][] addMatricesDoub(SparseGenericMatrix<E> mat1, SparseGenericMatrix<E> mat2, int row, int col){
    Double[][] sum = new Double[row][col];  
    for(Integer i = 0; i < mat1.getValArray().size(); i++){
      sum[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Double)(mat1.getValArray().get(i));
      for(Integer j = 0; j < mat2.getValArray().size(); j++){
        if((mat1.getColArray().get(i).equals(mat2.getColArray().get(j))) && (mat1.getRowArray().get(i).equals(mat2.getRowArray().get(j)))){
          sum[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Double)(mat1.getValArray().get(i)) + (Double)(mat2.getValArray().get(j)); 
        }
      }
    }
    for(int i = 0; i < sum.length; i++){
      for(int j = 0; j < sum[i].length; j++){
        if(sum[i][j] == null){
          sum[i][j] = 0.0;
        }
        for(Integer k = 0; k < mat2.getValArray().size(); k++){
          if((mat2.getColArray().get(k).equals(j)) && (mat2.getRowArray().get(k).equals(i)) && (sum[i][j].equals(0.0))){
            sum[i][j] = (Double)mat2.getValArray().get(k);
          }
        }
      }
    }
    return sum;
  }
  
  /**
   * Method to subtract two Integer matrices.
   * @param mat1 The first matrix to be subtracted.
   * @param mat2 The second matrix to be subtracted.
   * @param row The number of rows in the matrices.
   * @param col The number of columns in the matrices.
   * @return The resulting Integer matrix. 
   */
 public Integer[][] subMatrices(SparseGenericMatrix mat1, SparseGenericMatrix mat2, int row, int col){
    Integer[][] diff = new Integer[row][col];
    
    for(Integer i = 0; i < mat1.getValArray().size(); i++){
      diff[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Integer)(mat1.getValArray().get(i));
      for(Integer j = 0; j < mat2.getValArray().size(); j++){
        if((mat1.getColArray().get(i).equals(mat2.getColArray().get(j))) && (mat1.getRowArray().get(i).equals(mat2.getRowArray().get(j)))){
          diff[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Integer)(mat1.getValArray().get(i)) - (Integer)(mat2.getValArray().get(j)); 
        }
      }
    }
    for(int i = 0; i < diff.length; i++){
      for(int j = 0; j < diff[i].length; j++){
        for(Integer k = 0; k < mat2.getValArray().size(); k++){
          if(diff[i][j] == null){
            // placeholder value
            diff[i][j] = -10000000;
          }
          if((mat2.getColArray().get(k).equals(j)) && (mat2.getRowArray().get(k).equals(i)) && (diff[i][j] == -10000000)){
            diff[i][j] = 0 - ((Integer)mat2.getValArray().get(k));
          }
        }
        if(diff[i][j] == -10000000){
          diff[i][j] = 0;
        }
      }
    }
    return diff;
  }
  
  /**
   * Method to subtract two Double matrices.
   * @param mat1 The first matrix to be subtracted.
   * @param mat2 The second matrix to be subtracted.
   * @param row The number of rows in the matrices.
   * @param col The number of columns in the matrices.
   * @return The resulting Double matrix. 
   */
  public Double[][] subMatricesDoub(SparseGenericMatrix mat1, SparseGenericMatrix mat2, int row, int col){
    Double[][] diff = new Double[row][col];
    for(Integer i = 0; i < mat1.getValArray().size(); i++){
      diff[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Double)(mat1.getValArray().get(i));
      for(Integer j = 0; j < mat2.getValArray().size(); j++){
        if((mat1.getColArray().get(i).equals(mat2.getColArray().get(j))) && (mat1.getRowArray().get(i).equals(mat2.getRowArray().get(j)))){
          diff[(int)mat1.getRowArray().get(i)][(int)mat1.getColArray().get(i)] = (Double)(mat1.getValArray().get(i)) - (Double)(mat2.getValArray().get(j)); 
        }
      }
    }
    for(int i = 0; i < diff.length; i++){
      for(int j = 0; j < diff[i].length; j++){
        for(Integer k = 0; k < mat2.getValArray().size(); k++){
          if(diff[i][j] == null){
            // placeholder value
            diff[i][j] = -10000000.0;
          }
          if((mat2.getColArray().get(k).equals(j)) && (mat2.getRowArray().get(k).equals(i)) && (diff[i][j] == -10000000.0)){
            diff[i][j] = 0 - ((Double)mat2.getValArray().get(k));
          }
        }
        if(diff[i][j] == -10000000.0){
          diff[i][j] = 0.0;
        }
      }
    }
    return diff;
  }
}