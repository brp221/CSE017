//Bratislav Petkovic
//IBL 1
//September 2nd 2019

import java.util.Scanner;
import java.lang.Character;
import java.util.Arrays;
public class IBL1{

  public static void main(String[] args){
    // Making an instance of the Scanner class
    Scanner scnr = new Scanner(System.in);
    // Ask user for input
    System.out.println("Enter a string to search for in your input array.");
    String key = scnr.next();
    detectWord(args, key);
    
    containsNumber(args);

    readWrite(scnr);

    System.out.println("Enter two strings to put in alphabetical order:");
    String[] alphaArray = new String[2];
    System.out.println("Enter the first string:");
    alphaArray[0] = scnr.nextLine();
    System.out.println("Enter the second string:");
    alphaArray[1] = scnr.nextLine();
    alphaOrder(alphaArray);
    
    nameGame(scnr);
}

  
    public static void detectWord(String[] stringArr, String key){
     boolean input = false;
     int sentenceLngth = stringArr.length;
     for (int i = 0; i < sentenceLngth; i++){
       if (stringArr[i].equals(key)){
         System.out.println("Your word was found at index " + i + " in your String Array");
         input = true;
         break;
         }
     }
       if (input == false){
         System.out.println("Your word was not found in the sentence you provided.");
   
       }
     }
    public static void containsNumber(String[] stringArr){
      int numberOfDigits = 0;
      int sentenceLength = stringArr.length;
        for (int i = 0; i < sentenceLength; i++){
          String arr = stringArr[i];
          for (int j = 0; j < arr.length(); j++){
            char c = arr.charAt(j);
            if(Character.isDigit(c)){
                numberOfDigits++;
            }
            if(c == ' '){
              numberOfDigits = 0;
           }
        }
           if (numberOfDigits == 0){
            System.out.println("The pass code at index " + i + " does not contain any digits");
            }
           else if (numberOfDigits != 0){
             System.out.println("The pass code at index " + i + " contains a digit.");
        }
      }
    }
    
    
      public static void readWrite(Scanner scnr){
        boolean acceptableSentence = false;
        System.out.println("Enter a string containing at least one whitespace character");
        String inputString = scnr.nextLine();;
        int stringLength = inputString.length();
        //a while loop until the user inputs correct sentence 
        while(acceptableSentence == false){
        inputString = scnr.nextLine();
        stringLength = inputString.length();
        int numbOfWhiteSpcs = 0;
        //for each character in the string, check if its a whitespace
        for (int i = 0; i < stringLength; i++){
          char c = inputString.charAt(i);
          if (c == ' '){
            numbOfWhiteSpcs = numbOfWhiteSpcs + 1;
          }
        }
        //condition to exit out of the loop
        if(numbOfWhiteSpcs != 0){
          acceptableSentence = true;
          break;
        }
        //condition to keep in the loop
        else if(numbOfWhiteSpcs == 0){
          System.out.println("ERROR: INCLUDE A WHITESPACE!");
        }
        }
                               
 	//Now that the program is pout of the while loop, it can focus on getting rid of the whitespaces
      String editedString = inputString;
      //check each character index and get rid of any whitespaces
      for (int k = 0; k < stringLength; k++){
        if(inputString.charAt(k)==' '){
        editedString = inputString.replace(" ","");
        }
      }
      System.out.println("Your two strings with no whitespace characters");
      System.out.println(editedString);
        }
        
      
      public static String[] alphaOrder(String[] stringArr){
        
        //Initializing new string array to be returned
        String [] alphaStr = new String[1] ;
        // Check which string has higher lexalogical score
        if(stringArr[0].compareTo(stringArr[1]) < 0){
          alphaStr[0] = stringArr[0].concat(stringArr[1]); 
        }
        else if(stringArr[0].compareTo(stringArr[1])>=0){
          alphaStr[0] = stringArr[1].concat(stringArr[0]);
        }
        // converts the string array to a string to be printed out
        Arrays.toString(alphaStr);
        String finalString = String.join("", alphaStr);
        System.out.println(finalString);
        return alphaStr;
        
    }
      public static void nameGame(Scanner scnr){
        System.out.println("Input your first name");
        String name = scnr.next();
        //initialize String to be printed at the end 
        String editedName = name.substring(1);
        String sillyName = "Banana-fana fo-f".concat(editedName);
        System.out.println(sillyName);
    }
}
    
  
  





