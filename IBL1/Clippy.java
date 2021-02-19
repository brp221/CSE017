import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.util.Arrays;

public class Clippy{

public static void main(String[] args){
    //create instance of scanner method
    Scanner scnr = new Scanner(System.in);
    //Assign the value of writeDocumment to a String so that it can be passed to clippyMenu
    String userString = writeDocument(scnr);
    //call Clippy Menu
    clippyMenu(scnr, userString);
  }
    
  public static String writeDocument(Scanner scnr){
    //Ask user for his/her desired input
    System.out.println("Enter your text: ");
    String userString = scnr.nextLine();
    return userString;
  }
    
  public static void clippyMenu(Scanner scnr, String userString){
    //create empty string
    String functionString = " ";
    do {
      System.out.println("nwc - Number of non-whitespace characters");
      System.out.println("wc - Number of all characters");
      System.out.println("w - number of words");
      System.out.println("f - find text");
      System.out.println("r - replace a word with another word");
      System.out.println("q - quit");
      functionString = scnr.nextLine();
      break;
    }while(functionString != "q");
   
    //for each case call upon the corresponding method.If the method requires further 
    //parameters ask the user for specific input within each specific case.
    switch (functionString){
      
      case "nwc":
       int numNonwhitespaceChar = numNonwhitespaceChar(userString);
       System.out.println(numNonwhitespaceChar);
       clippyMenu(scnr, userString);
       break;
        
      case "wc":
       int numAllChar = numAllChar(userString);
       System.out.println(numAllChar);
       clippyMenu(scnr, userString);
       break;
       
      case "w":
        int numWords = numWords(userString);
        System.out.println(numWords);
        clippyMenu(scnr, userString);
        break;
        
      case "f":
        System.out.println("Which word(s) are you looking for?");
        String findString = scnr.nextLine();
        boolean findText = findText(userString, findString);
        System.out.println(findText);
        clippyMenu(scnr, userString);
        break;
        
      case "r":
        System.out.println("Which word(s) are you looking for?");
        findString = scnr.nextLine();
        System.out.println("Which word(s) do you want to replace it with?");
        String replaceString = scnr.nextLine();
        findText(userString, findString);
        String replaceText = replaceText(userString, findString, replaceString);
        System.out.println(replaceText);
        clippyMenu(scnr, userString);
        break;
        
      case "q":
        boolean quit = quit(scnr);
        break;
        
      default:
        System.out.println("Please provide correct input.");
        clippyMenu(scnr, userString);
        break;
    }
  }
  
 public static int numNonwhitespaceChar(String userString){
   int stringLength = userString.length() ;
   int wsCount = 0 ;
   for(int i = 0;  i<stringLength; i++){
     if (userString.charAt(i) != ' ') { 
       wsCount++ ;
     }
   }
 return wsCount;
 }

  public static int numAllChar(String userString){
   int numAllChar = userString.length();
   return numAllChar;
}

  public static int numWords(String userString){
   if (userString == null || userString.isEmpty()) {
      return 0;
   }
    int wordCount = 0;
    boolean isWord = false;
    int endOfLine = userString.length() - 1;
    char[] characters = userString.toCharArray();
    for (int i = 0; i < characters.length; i++) {
      // if the char is a letter, word = true.
      if (Character.isLetter(characters[i]) && i != endOfLine) {
        isWord = true;
        // if char isn't a letter and there have been letters before,
        // counter goes up.
      }
       else if (!Character.isLetter(characters[i]) && isWord) {
        wordCount++;
        isWord = false;
        // last word of String; if it doesn't end with a non letter, it
        // wouldn't count without this.
       }
        else if (Character.isLetter(characters[i]) && i == endOfLine) {
        wordCount++;
      }
    }

    return wordCount;
  }

  public static boolean findText(String userString, String findString){
   boolean isFound;
   if (userString.contains(findString)){
     isFound = true;
   }
   else{
     isFound = false;
   }
   return isFound;
  }

  public static String replaceText(String userString, String findString, String replaceString){
    String returnString = " ";
    if(findText(userString, findString) == true){
      returnString = userString.replace(findString,replaceString);
    }
    else if(findText(userString, findString) == false){
      returnString = userString;
    }
    return returnString;
  }
  
  
  public static boolean quit(Scanner scnr){
     boolean quit = false;
     System.out.println("Are you sure you want to quit? Enter y for yes or anything else for no.");
     String quitString = scnr.nextLine();
     if (quitString.equals("y")){
       quit = true;
     }
      
     if (quit == true){
          System.out.println("Program terminated.");
        }
     else{
     	  //This will bring the user back to clippyMenu where the process begins again from the tar
          System.out.println("Enter your text again");
          String userString = scnr.nextLine();
          clippyMenu(scnr, userString);
     }
     return quit;
  }
}
  

  
     
     
       
         
       
       
     
     
     
  
  
        
      
    
    

    
    