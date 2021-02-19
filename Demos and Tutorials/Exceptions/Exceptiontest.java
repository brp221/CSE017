public class ExceptionTest { 
  private int hour; 
  public void setHour(int hour) throws IllegalArgumentException { 
    if (hour <= 0) {
      throw new IllegalArgumentException("Hour must be > 0"); 
    }  
    if (hour == 42){
      throw new AnswerFoundException();
    }
    if (hour > 12) {
      throw new IllegalArgumentException("Hour must be <= 12"); 
    }
    
    this.hour = hour; 
  } 
  
  public static void main(String[] args) { 
    java.util.Scanner in = new java.util.Scanner(System.in); 
    ExceptionTest t = new ExceptionTest(); 
    System.out.println("Enter an hour (>0 and <= 12):"); 
    //int i = in.nextInt(); 
    int i = -1;
    try { 
      i = in.nextInt();
      t.setHour(i); 
      System.out.println("Hour successfully set to " + t.hour); 
    } 
    catch (AnswerFoundException ex) { 
      System.out.println("Congratulations! " + ex.getMessage()); 
    }
    catch (IllegalArgumentException ex) { // Subclass of RunTimeException so this is optioanl
      System.out.println(ex.getMessage()); 
    } 
    catch (java.util.InputMismatchException ex) { 
      System.out.println("You must enter an integer!"); 
    } 

    System.out.println("End of program!"); 
  } 
  
  class AnswerFoundException extends IllegalArgumentException { 
    
    public AnswerFoundException() { 
      super("You have found the answer to the ultimate question of life, the universe and everything."); 
    } 
  } 
}


