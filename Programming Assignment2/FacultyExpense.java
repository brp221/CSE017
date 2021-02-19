import java.util.*;
import java.io.*;
import java.text.*;

public class FacultyExpense extends ExpenseAccount{
    /**
     * 2-arg constructor for faclty account
     * @param accountName
     * @param balance
     */
    public FacultyExpense(String accountName, double balance){
        super(accountName);
        balance = getBalance();
    }
    /**
     * prints the invoice for the firstLastName and the charge on the account
     * @param firstLastName
     */
    public void printInvoice(String firstLastName){
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the name of your file: ");
        String fileName = scnr.next();
        System.out.println("");
        File inputSource = new File(fileName);
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

        try{
            double charge;
            System.out.println("Invoice for : " + inputElements.get(1)+ " "+ inputElements.get(2));
            for(int i = 3; i<inputElements.size();i++){
               charge = Double.parseDouble(inputElements.get(i)) ;
               makePayment(charge);

               System.out.println("Department Faculty account was charged $" + inputElements.get(i));
            }

        }
        catch(AccountDepletedException exc){
            System.out.println(exc.getMessage());
            System.out.println("");
            System.exit(0);
        }
        if(!inputElements.get(0).equals("G")&!inputElements.get(0).equals("E")){
            throw new UnknownAccountException();
        }

   }
}