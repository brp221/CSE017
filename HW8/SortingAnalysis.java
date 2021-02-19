/*
CSE 17 Fall 2019
@author Bratislav Petkovic 
Homework #8  	
Program: SortingAnalysis
*/

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class SortingAnalysis{
    public static void main(String[] args) throws IOException {
        //try{FileWriter writer = new FileWriter("SortingStats.txt");}
        //catch(IOException exc){exc.getMessage();}
        FileWriter writer = new FileWriter("SortingStats.txt");
        BubbleSort bSort = new BubbleSort(); 
        HeapSort hSort = new HeapSort();
        //ob.sort(arr1); 
        InsertionSort iSort = new InsertionSort();
        //ob.sort(arr1); 
        MergeSort mSort = new MergeSort();
        //ob.sort(arr1,0, arr1.length-1); 
        QuickSort qSort = new QuickSort();
        //ob.sort(arr3,0,n-1);
        SelectionSort selSort = new SelectionSort();
        //ob.sort(arr2); 

        //creating array in ascending order. Size 10k
        int arr1[] = new int[10000];
        for(int i=0; i<arr1.length;i++){
            arr1[i] = i;
        }
        //System.out.println(arr1[0] +" " + arr1[5000] +" "+ arr1[9999]);
        //creating array in random order. Size 10k
        int arr2[] = new int[10000];
        Random rand = new Random();
        for(int i=0; i<arr2.length;i++){
            arr2[i] = rand.nextInt(10000);
        }
        //System.out.println(arr2[0] +" " + arr2[5000] +" "+ arr2[9999]);
        //creating array in descending order. Size 10k
        int arr3[] = new int[10000];
        int max = 10000;
        for(int i=0; i<arr3.length;i++){
            arr3[i] = max;
            max--;
        }
        //System.out.println(arr3[0] +" "+arr3[100] +" "+arr3[2000] +" " + arr3[5000] +" "+ arr3[9999]);
        long startTime1;
        long startTime2;
        long startTime3;
        long endTime1;
        long endTime2;
        long endTime3;
        long totTime1;
        long totTime2; 
        long totTime3; 
        long totSum1=0;
        long totSum2=0;
        long totSum3=0;
        long averageT1=0;
        long averageT2=0;
        long averageT3=0;

        writer.write("Name of   |Worst Case  |Best Case   | Wall Clock | Wall Clock| Wall Clock|");
        writer.write("\nSort      |Theoretical |Theoretical |Descending  | Ascending | Random    |");
        writer.write("\n----------------------------------------------------------------------------");

        //take average time of sorting the array 10 times.
        for(int i =0; i<10;i++){
            startTime1 = System.currentTimeMillis();
            bSort.sort(arr1); 
            endTime1 = System.currentTimeMillis();
            totTime1 = endTime1 - startTime1;
            totSum1 += totTime1 ;
        }
        averageT1=totSum1/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT1);

        for(int i =0; i<10;i++){
            startTime2 = System.currentTimeMillis();
            bSort.sort(arr2); 
            endTime2 = System.currentTimeMillis();
            totTime2 = endTime2 - startTime2;
            totSum2 += totTime2 ;
        }
        averageT2=totSum2/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT2);

        for(int i =0; i<10;i++){
            startTime3 = System.currentTimeMillis();
            bSort.sort(arr3); 
            endTime3 = System.currentTimeMillis();
            totTime3 = endTime3 - startTime3;
            totSum3 += totTime3;
        }
        averageT3=totSum3/10 ;
        writer.write("\nBubble    |   O(n^2)   |    O(n)    |     " +averageT3 +"     |    "+averageT1 +"     |     "+averageT2 +"    |");
        //System.out.println("Execution time(nanoseconds) : " + averageT3);

        //take average time of sorting the array 10 times.
        for(int i =0; i<10;i++){
            startTime1 = System.currentTimeMillis();
            hSort.sort(arr1); 
            endTime1 = System.currentTimeMillis();
            totTime1 = endTime1 - startTime1;
            totSum1 += totTime1 ;
        }
        averageT1=totSum1/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT1);

        for(int i =0; i<10;i++){
            startTime2 = System.currentTimeMillis();
            hSort.sort(arr2); 
            endTime2 = System.currentTimeMillis();
            totTime2 = endTime2 - startTime2;
            totSum2 += totTime2 ;
        }
        averageT2=totSum2/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT2);

        for(int i =0; i<10;i++){
            startTime3 = System.currentTimeMillis();
            hSort.sort(arr3); 
            endTime3 = System.currentTimeMillis();
            totTime3 = endTime3 - startTime3;
            totSum3 += totTime3;
        }
        averageT3=totSum3/10 ;
        writer.write("\nHeap      | O(n log(n))| O(n log(n))|     " +averageT3 +"     |    "+averageT1 +"     |     "+averageT2 +"    |");
        //System.out.println("Execution time(nanoseconds) : " + averageT3);
        
        //take average time of sorting the array 10 times.
        for(int i =0; i<10;i++){
            startTime1 = System.currentTimeMillis();
            iSort.sort(arr1); 
            endTime1 = System.currentTimeMillis();
            totTime1 = endTime1 - startTime1;
            totSum1 += totTime1 ;
        }
        averageT1=totSum1/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT1);

        for(int i =0; i<10;i++){
            startTime2 = System.currentTimeMillis();
            iSort.sort(arr2); 
            endTime2 = System.currentTimeMillis();
            totTime2 = endTime2 - startTime2;
            totSum2 += totTime2 ;
        }
        averageT2=totSum2/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT2);

        for(int i =0; i<10;i++){
            startTime3 = System.currentTimeMillis();
            iSort.sort(arr3); 
            endTime3 = System.currentTimeMillis();
            totTime3 = endTime3 - startTime3;
            totSum3 += totTime3;
        }
        averageT3=totSum3/10 ;
        writer.write("\nInsertion |    O(n^2)  |    O(n)    |     " +averageT3 +"     |    "+averageT1 +"     |     "+averageT2 +"    |");
        //System.out.println("Execution time(nanoseconds) : " + averageT3);
        
        //take average time of sorting the array 10 times.
        for(int i =0; i<10;i++){
            startTime1 = System.currentTimeMillis();
            mSort.sort(arr1,0,arr1.length-1); 
            endTime1 = System.currentTimeMillis();
            totTime1 = endTime1 - startTime1;
            totSum1 += totTime1 ;
        }
        averageT1=totSum1/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT1);

        for(int i =0; i<10;i++){
            startTime2 = System.currentTimeMillis();
            mSort.sort(arr2,0,arr2.length-1); 
            endTime2 = System.currentTimeMillis();
            totTime2 = endTime2 - startTime2;
            totSum2 += totTime2 ;
        }
        averageT2=totSum2/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT2);

        for(int i =0; i<10;i++){
            startTime3 = System.currentTimeMillis();
            mSort.sort(arr3,0,arr3.length-1); 
            endTime3 = System.currentTimeMillis();
            totTime3 = endTime3 - startTime3;
            totSum3 += totTime3;
        }
        averageT3=totSum3/10 ;
        writer.write("\nMerge     | O(nlog(n)) |  O(nlog(n))|     " +averageT3 +"     |    "+averageT1 +"     |     "+averageT2 +"    |");
        //System.out.println("Execution time(nanoseconds) : " + averageT3);

        //take average time of sorting the array 10 times.
        for(int i =0; i<10;i++){
            startTime1 = System.currentTimeMillis();
            qSort.sort(arr1,0,arr1.length-1); 
            endTime1 = System.currentTimeMillis();
            totTime1 = endTime1 - startTime1;
            totSum1 += totTime1 ;
        }
        averageT1=totSum1/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT1);

        for(int i =0; i<10;i++){
            startTime2 = System.currentTimeMillis();
            qSort.sort(arr2,0,arr2.length-1); 
            endTime2 = System.currentTimeMillis();
            totTime2 = endTime2 - startTime2;
            totSum2 += totTime2 ;
        }
        averageT2=totSum2/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT2);

        for(int i =0; i<10;i++){
            startTime3 = System.currentTimeMillis();
            qSort.sort(arr3,0,arr3.length-1); 
            endTime3 = System.currentTimeMillis();
            totTime3 = endTime3 - startTime3;
            totSum3 += totTime3;
        }
        averageT3=totSum3/10 ;
        writer.write("\nQuick     |   O(n^2)   |O(n log(n)) |     " +averageT3 +"     |    "+averageT1 +"     |     "+averageT2 +"    |");
        //System.out.println("Execution time(nanoseconds) : " + averageT3);

        //take average time of sorting the array 10 times.
        for(int i =0; i<10;i++){
            startTime1 = System.currentTimeMillis();
            selSort.sort(arr1); 
            endTime1 = System.currentTimeMillis();
            totTime1 = endTime1 - startTime1;
            totSum1 += totTime1 ;
        }
        averageT1=totSum1/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT1);

        for(int i =0; i<10;i++){
            startTime2 = System.currentTimeMillis();
            selSort.sort(arr2); 
            endTime2 = System.currentTimeMillis();
            totTime2 = endTime2 - startTime2;
            totSum2 += totTime2 ;
        }
        averageT2=totSum2/10 ;
        //System.out.println("Execution time(nanoseconds) : " + averageT2);

        for(int i =0; i<10;i++){
            startTime3 = System.currentTimeMillis();
            selSort.sort(arr3); 
            endTime3 = System.currentTimeMillis();
            totTime3 = endTime3 - startTime3;
            totSum3 += totTime3;
        }
        averageT3=totSum3/10 ;
        writer.write("\nSelection |   O(n^2)   |   O(n^2)   |     " +averageT3 +"    |    "+averageT1 +"     |     "+averageT2 +"    |");
        writer.close();

        
    }
}