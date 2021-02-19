/*
CSE017 Fall 2019
@Bratislav Petkovic 
IBL 4
Program: WordWrapperUpdated
*/
import java.util.Scanner ;
import java.io.File;
import java.io.PrintWriter ;
//When running your code, you should use the 
//command “java WordWrapper 1st text 2nd text 
public class WordWrapperUpdated{
    public static void main(String[] args) throws Exception{
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the length of the desired line :");
        int LINE_MAX = scnr.nextInt();
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
            wrapOneLine(inLine,output,LINE_MAX);
        }
        input.close();
        output.close();
        System.exit(2);
    }

    public static void wrapOneLine(String inLine, PrintWriter output,int LINE_MAX){
        int inLineLen = inLine.length();
        int numbOfLoops = inLineLen / LINE_MAX ;
        LINE_MAX = LINE_MAX -1 ;
        for(int j=0; j<=LINE_MAX;j++){ //1-30
            output.write(inLine.charAt(j));
        }
        output.println("");
        //1,2,3,4,5,6,7
        for(int i=1; i<=(numbOfLoops-1);i++){ 
            for(int k=(LINE_MAX*i)+1;k<=(LINE_MAX*(i+1));k++){
                output.write(inLine.charAt(k));
            }
            output.println("");
            }
        for(int m=((LINE_MAX*numbOfLoops)+1);m<(inLineLen -1);m++){
            output.write(inLine.charAt(m));
        }
        output.println("");
        

        }
        /*
        j = 0 0<50
        j = 1 50<100
        j = 2 100<150
        j = 3 150<200
        j = 4 200<219
        */

    }