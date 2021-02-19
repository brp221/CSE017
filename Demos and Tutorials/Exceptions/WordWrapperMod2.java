import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;


public class WordWrapperMod2 {
  
  public final static int LINE_MAX = 50;
  
  public static void main(String[] args){ //throws Exception {
    
    if (args.length != 2) {
      System.out.println("Usage: java WordWrapper source target");
      System.exit(1);
    }
    
    File sourceFile = new File(args[0]);
    if(!sourceFile.canRead()){
      System.out.println("Error: Cannot read from source " +  
                         args[0]); 
      System.exit(1); 
    } 
    
    File targetFile = new File(args[1]);
    if (targetFile.exists() && !targetFile.canWrite()) { 
      // canWrite() is always false if the file does not exist… 
      System.out.println("Error: Cannot write to target " + args[1]); 
      System.exit(1); 
    } 
    
    Scanner input = null;
  
    try{
      input = new Scanner(sourceFile);
    }
    catch(FileNotFoundException ex){
      System.out.println("Error: Cannot read from source " + args[0]); 
      System.exit(0);
      
    }
    PrintWriter output = null;
    try{
      output = new PrintWriter(targetFile);
    }
    catch(FileNotFoundException ex){
      System.out.println("Error: Cannot write to target " + args[1]); 
      System.exit(1); 
      
    }
    
    // Scanner's hasNextLine() method is true if there is another line (empty or not) to read in the file
    while (input.hasNextLine()) {            
      String inLine = input.nextLine();
      wrapOneLine(inLine, output);
    } 
    
    input.close();
    output.close();
  }
  
  /** Given one input line, will output it in its entirety, inserting line
    * breaks to ensure that no line is longer than LINE_MAX, such that
    * no breaks occur in the middle of a word, unless the word is longer than
    * an output line. */
  public static void wrapOneLine(String inLine, PrintWriter output) {
    
    int startPoint = 0;
    // breakPoint is index of first character that doesn't fit on output line
    int breakPoint = LINE_MAX;  
    while (breakPoint < inLine.length()) {   // as long as breakPoint is inside line
      char c = inLine.charAt(breakPoint);
      // must work back from breakpoint to find beginning of current word
      while (Character.isWhitespace(c) == false && breakPoint > startPoint) {
        breakPoint--;
        c = inLine.charAt(breakPoint);
      }
      if (breakPoint > startPoint) {         // break line before this word
        output.println(inLine.substring(startPoint, breakPoint));
        startPoint = breakPoint + 1;           // skip the space before the word
      }
      else {                 // word is too long for a line, break in its middle
        breakPoint = startPoint + LINE_MAX;
        output.println(inLine.substring(startPoint, breakPoint));
        startPoint = breakPoint;             // no space to skip
      }
      breakPoint = startPoint + LINE_MAX;
    }
    output.println(inLine.substring(startPoint));
  }
}  