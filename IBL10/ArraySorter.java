
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArraySorter{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5 ;
        ArrayList<Integer> userInts = new ArrayList<Integer>();
        int i ;

        System.out.println("Enter " + NUM_ELEMENTS + "numbers...");
        for(i = 1;i<=NUM_ELEMENTS;i++){
            System.out.print(i + ": ");
            int j = scnr.nextInt();
            userInts.add(j);
        }

        Collections.sort(userInts);

        System.out.println("Sorted Numbers: ");
        for(i = 0;i<NUM_ELEMENTS;++i){
            System.out.print(userInts.get(i)+ " ");
        }
        System.out.println("");
    }
}