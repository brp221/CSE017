/*
CSE017 Fall 2019
@Bratislav Petkovic 
IBL 4
Program: WordWrapper
*/
import java.util.Scanner ;
import java.io.File;
import java.io.PrintWriter ;
//When running your code, you should use the 
//command “java WordWrapper longLine.txt brokenLine.txt”. 
public class WordWrapper{

    public final static int LINE_MAX = 50;
    
    public static void main(String[] args) throws Exception{
        // if the user doesnt provide two arguments(two files- a source and a target file)
        if( args.length !=2){
            System.out.println("Usage: java WordWrapper source target ");
            //stop the program
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        File targetFile = new File(args[1]);
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);

        while(input.hasNextLine()){
            String inLine = input.nextLine();
            wrapOneLine(inLine,output);
        }
        input.close();
        output.close();
        System.exit(2);
    }

    public static void wrapOneLine(String inLine, PrintWriter output){
        for(int i = 0; i<=50 ;i++){output.write(inLine.charAt(i));}
        output.println("");
        for(int i = 51; i<=100 ;i++){output.write(inLine.charAt(i));}
        output.println("");
        for(int i = 101; i<=150 ;i++){output.write(inLine.charAt(i));}
        output.println("");
        for(int i = 151; i<=200 ;i++){output.write(inLine.charAt(i));}
        output.println("");
        for(int i = 201; i<=218 ;i++){output.write(inLine.charAt(i));}
        /*
        j = 0 0<50
        j = 1 50<100
        j = 2 100<150
        j = 3 150<200
        j = 4 200<219
        */

    }
}