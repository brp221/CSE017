import java.util.Scanner; 
public class IntegerTest  { 
  
  public static void main(String[] args){//throws Exception { 
    
    Scanner scnr = new Scanner(System.in); 
    int i = -1; 
    
    boolean gotInt = false; 
    System.out.println("Enter an integer:"); 
    //while (!gotInt)  
    //int userInt = scnr.nextInt();
    //Would using scnr.next() or .nextLine() fix the error?
      String s = scnr.next(); 
      try { 
        i = Integer.parseInt(s);  
        gotInt = true; 
      } catch (NumberFormatException ex) { 
        System.out.println("Sorry, but " + s + " is not an integer. Try again!"); 
      }           
    System.out.println(gotInt);
    System.out.println("You entered: " + i);
    //System.out.println("You entered: " + userInt);
  } 
} 
