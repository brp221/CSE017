/*
CSE017 Fall 2019
@Bratislav Petkovic 
IBL10
Program: GenericArrayDemo
*/


import java.util.*;

public class GenericArrayDemo<E extends  Comparable<E>>{
    private E[] demoArr ;
    public GenericArrayDemo(E[] array){
        demoArr = array ;
    }
    public E[] getArray(){
        return this.demoArr;
    }
    public static void main(String[] args){
        Integer[] myArray1 = new Integer[10];
        for(int i = 0; i<10;i++){
            myArray1[i] = i;
        }

        GenericArrayDemo<Integer> demo1 = new GenericArrayDemo<Integer>(myArray1);
        System.out.println(Arrays.toString(demo1.getArray()));

        Double[] myArray2 = new Double[10];
        for(int i = 0; i<10;i++){
            myArray2[i] = i * Math.PI ;
        }

        GenericArrayDemo<Double> demo2 = new GenericArrayDemo<Double>(myArray2);
        System.out.println(Arrays.toString(demo2.getArray()));
    }
}
