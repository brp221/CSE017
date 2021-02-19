/*
CSE017 Fall 2019
@Bratislav Petkovic 
IBL 6
Program: ExceptionIBL
*/
import java.io.*; 
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class ExceptionIBL{

    public static void inputSearch(int count) throws IllegalArgumentException{
        //case for integer not existing
        if(count ==0){
            throw new NoIntFoundException();
        }
        //case for there being a special char
        else if(count==2){
            throw new IllegalArgumentException("Your file contains a special character");
        }
    }
    

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        if(args.length != 1){
            System.out.println("Invalid input. Need a file to read from");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        File outputFile = new File("outputFile.txt");
        FileWriter writer = new FileWriter(outputFile);
        //declare input
        Scanner input = null;
        try{
            input = new Scanner(sourceFile);
        }
        catch(FileNotFoundException exc){
            System.out.println("Cannot read from " + args[0]);
            System.exit(0);
        }

        int fileInteger = -1;
        String inLine = input.nextLine();
        char[] specChar = {'!', '#', '$', '%', ',', '(', ')', '*','+' } ;
        int count = 0;
        for(int i =0; i<inLine.length();i++){
            //if int does exist
            if(Character.isDigit(inLine.charAt(i))){
                count=1;
                fileInteger = inLine.charAt(i);
                break;
            }
            for(int j =0; j<specChar.length;j++){
                char charAtj = specChar[j];
                if(inLine.charAt(i) == charAtj ){
                    count = 2;
                    break;
                }
            }           
        }
        try{
            inputSearch(count);
            System.out.println("The integer " + (fileInteger-48) + " has been found");
            
        }
        catch(NoIntFoundException exc){
            System.out.println(exc.getMessage());
        }
        catch(IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
        finally{    
            //
            if(count ==0){
                writer.write("Your file doesn't contain integers");
            }
            else if(count ==2){
                writer.write("Your file contains a special character");
            }
            else if(count ==1){
                writer.write("The integer " + (fileInteger-48) + " has been found");
            }
            writer.close();
        }
    }
}
class NoIntFoundException extends IllegalArgumentException{
    public NoIntFoundException(){
    //this message should be printed to a separate output file
    //This separate file should be created in your program 
    //(it is not supplied by the user).
    super("Your file doesn't contain integers");
    }
}
