import java.util.*;
/**
 * a class which prints the number of combinations of n letters
 */
public class Combinations{
  /**
   * prints the number of combinations of n letters
   * @param combo
   * @param word
   */
  public static void combination(String combo, String word) {
    
    if(word.isEmpty()){
      //if string is empty print ""
      System.out.println(combo + word);
    }
    else{
      for(int i = 0; i <= 1; i++){
        if(i == 0){
          for(int j = 0; j < word.length(); j++){
            //recursively calls combination by subseting the word length
            combination(combo + word.charAt(j), word.substring(j + 1, word.length()));
          }
        } 
        else{
          combination(combo, "");
        }
      }
    }
  }

  public static void main(String[] args){
    boolean invalidInputN = true;
    int n = 0;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a value between 0 and 26.");
    //exception handling by means of the Scanner class  
    while(invalidInputN){
      if(scnr.hasNextInt()){
        n = scnr.nextInt();
        // the desired condition
        if(n > 0 && n <= 26){
          invalidInputN = false;
          break;
        }
        // if the user provides a value not between 0 and 26.
        else{
          System.out.println("Enter a value between 0 and 26.");
          scnr.nextLine();
        }
      }
      //if user doesn't provide an integer
      else{
        System.out.println("Enter an integer value for n.");
        scnr.nextLine();
      }
    }
    /**
     * the following lines of code create a char array and then convert 
     * the array elements into the 26 letters of the alphabet.
     */
    char[] alphabet = new char[26];
    char[] temp = new char[n];
    for(int i = 97; i < 123; i++){
       alphabet[i-97] = (char)(i);
    }
    for(int i = 0; i < n; i++){
      temp[i] = alphabet[i];
    }
    String word = new String(temp);
    System.out.println(word);
    String combo = "";
    combination(combo, word);
  }
}