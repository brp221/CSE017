import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.text.*;

public class ExpenseAccount{
    private String accountName;
    private double balance = 0 ;
    /**
     * 1-arg constructor of the generic account 
     * @param accountName is just the name of the account
     */
    public ExpenseAccount(String accountName){
        this.accountName = accountName ;
    }
    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * deducts the charge from the inputted balance
     * @param charge
     * @throws AccountDepletedException
     */
    public void makePayment(double charge) throws AccountDepletedException{
        balance = balance - charge ;
        if(balance<0){
            throw new AccountDepletedException();
        }
    }
    /**
     * checks if the account is of valid type: G or E
     * catches FileNotFoundExc
     * @param inputSource
     */
    public void printInvoice(File inputSource){
        Scanner input = null;
        ArrayList<String> inputElements = new ArrayList<String>();
        try{
            input = new Scanner(inputSource);
            while(input.hasNext()){
                inputElements.add(input.next());
            }
            input.close();
        }
        catch(FileNotFoundException exc){
            System.out.println("Cannot read from " + inputSource);
            System.exit(0);
        }
        if(!inputElements.get(0).equals("G")&!inputElements.get(0).equals("E")){
            throw new UnknownAccountException();
        }
         
                
}
}