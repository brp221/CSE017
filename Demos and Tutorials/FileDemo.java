import java.io.File; 
 
public class FileDemo { 
  
 public static void main(String[] args) { 
   // Check args.length to make sure there is input
  if (args.length != 1) { 
   System.out.println("Usage: java FileDemo filename"); 
   // if not, exit the program
   System.exit(1); 
  } 
   
  String filename = args[0]; 
  File file = new File(filename); 
  System.out.println("File:\t\t" + filename); 
  // Return the absolute file name
  System.out.println("Absolute Path:\t" + file.getAbsolutePath()); 
  System.out.println("Exists?\t\t" + file.exists()); 
  System.out.println("Can Read?\t\t" + file.canRead()); 
  System.out.println("Can Write?\t\t" + file.canWrite()); 
  System.out.println("Length:\t\t" + file.length()); 
 } 
} 