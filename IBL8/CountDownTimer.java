/**
 *  CSE017 Fall 2019
 *  @ Bratislav Petkovic 
 *  IBL8
 *  Program : CountDownTimer
 */ 

public class CountDownTimer{
  public static void countDown(int countInt){
    if(countInt == 0){
      System.out.println("GO!");
    }
    else{
      System.out.println(countInt);
      countDown(countInt-1);
    }
  }
  
  public static void main(String[] args){
    countDown(2);
  }
}