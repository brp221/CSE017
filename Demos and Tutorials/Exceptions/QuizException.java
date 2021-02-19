public class QuizException { 
  private int grade; 
  public void setGrade(int grade) throws IllegalArgumentException { 
    if (grade < 0) 
      throw new IllegalArgumentException("Grade must be >= 0");  
    if (grade == 11){
      this.grade = grade;
      throw new ExtraCreditEarned();
    }
    if (grade > 10) 
      throw new IllegalArgumentException("Grade must be <= 10");   
      this.grade = grade; 
  }  
  
  public static void main(String[] args) { 
    java.util.Scanner scnr = new java.util.Scanner(System.in); 
    QuizException quiz = new QuizException(); 
    System.out.println("Enter a grade between 0 and 10:"); 
    int score = scnr.nextInt(); 
    try { 
      quiz.setGrade(score); 
      System.out.println("Grade successfully entered as " + quiz.grade + " out of 10."); 
    } 
    catch (ExtraCreditEarned ex) { 
      System.out.println("NOTE: " + ex.getMessage()); 
    }
    catch (IllegalArgumentException ex) { 
      System.out.println(ex.getMessage()); 
    } 
    
    System.out.println("End of grade input"); 
  }  
}
class ExtraCreditEarned extends IllegalArgumentException { 
  public ExtraCreditEarned() { 
    super("This student earned the extra credit point for today's quiz."); 
  } 
} 


