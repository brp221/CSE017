import java.io.File; 
import java.io.PrintWriter;

public class FileDemoPrint { 
  public static void main(String[] args) throws Exception { 
    if (args.length != 1) { 
      System.out.println("Usage: java FileDemo filename"); 
      System.exit(1); 
    }   
    String filename = args[0]; 
    File file = new File(filename); 
    System.out.println("File:" + filename); 
    
    if (file.exists() == false) {  // (!file.exists()) 
      System.out.println("File doesn't exist yet."); 
      PrintWriter output = new PrintWriter(file); 
      output.println("I have opened a new file and written to it."); 
      output.close(); 
    } 
    else{
      System.out.println("File exists, so I'm going to overwrite it."); 
      PrintWriter output = new PrintWriter(file); 
      output.println("I have overwritten this file."); 
      output.close(); 
    }    
  } 
} 

