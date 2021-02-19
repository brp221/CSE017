
import java.util.*;

/**
 CSE017 Fall 2019
 @ Bratislav Petkovic
 Homework #7 
 Program: SparseGenericMatrix
 */

/**
 * Represents the ijk format of a sparse matrix
 */
public class SparseGenericMatrix<E extends Number>{
    private ArrayList<Integer> rowArray;
    private ArrayList<Integer> colArray;
    private ArrayList<E> valArray;
    public SparseGenericMatrix(E[][] arr){
        valArray = new ArrayList<E>();
        colArray = new ArrayList<Integer>();
        rowArray = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(!arr[i][j].equals(0) && !arr[i][j].equals(0.0)){
                    Integer intObj1 = new Integer(i);
                    Integer intObj2 = new Integer(j);
                    rowArray.add(intObj1);
                    colArray.add(intObj2);
                    valArray.add(arr[i][j]);
                }
            }
        }

    }

    /**
     * @return the colArray
     */
    public ArrayList<Integer> getColArray() {
        return colArray;
    }

    /**
     * @return the rowArray
     */
    public ArrayList<Integer> getRowArray() {
        return rowArray;
    }

    /**
     * @return the valArray
     */
    public ArrayList<E> getValArray() {
        return valArray;
    }
    /**
     * @param colArray the colArray to set
     */
    public void setColArray(ArrayList<Integer> colArray) {
        this.colArray = colArray;
    }
    /**
     * @param rowArray the rowArray to set
     */
    public void setRowArray(ArrayList<Integer> rowArray) {
        this.rowArray = rowArray;
    }
    /**
     * @param valArray the valArray to set
     */
    public void setValArray(ArrayList<E> valArray) {
        this.valArray = valArray;
    }
}