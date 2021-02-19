import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TestAccounts{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        File inputFile = new File(args[0]);
        Scanner input = null;
        ArrayList<String> textElements = new ArrayList<String>();
        //tries to read the file and to parse it into a String ArrayList
        try{
            input = new Scanner(inputFile);
            while (input.hasNext()) {
                textElements.add(input.next());
            }
            input.close();
        }
        //catches the FileNotFound exception
        catch(FileNotFoundException exc){
            System.out.println("Cannot read from " + args[0]);
            System.exit(0);
        }
        //creates an instance of the super class ExpenseAccount
        ExpenseAccount account1 = new ExpenseAccount("CSE109");
        //try to print the invoice for the file
        try{
            //printInvoice from the superclass checks if the account is valid
            account1.printInvoice(inputFile);
            //case for Faculty Expense Account
            if(textElements.get(0).equals("E")){
                FacultyExpense account2 = new FacultyExpense("Faculty Expenses", 0);
                //ask user for input of type Double
                System.out.println("Set the balance of the account");
                account2.setBalance(scnr.nextDouble());
                String name = textElements.get(1) + " " +textElements.get(2);
                //potentially throws and catches the AccountDepletedExc 
                System.out.println("");
                account2.printInvoice(name);
                System.out.println(""); 
            }
            //Case for Grader Expense Account 
            if(textElements.get(0).equals("G")){
                GraderExpense account3 = new GraderExpense("Grader Expenses", 0);
                System.out.println("Set the balance of the account");
                //ask user for input of type Double
                account3.setBalance(scnr.nextDouble());
                String name = textElements.get(1) + " " +textElements.get(2);
                //potentially throws and catches the AccountDepletedExc 
                System.out.println("");
                account3.printInvoice(name);
                System.out.println(""); 
            }
        }
        //catch the UnknownAccountException potentially
        catch(UnknownAccountException exc){
            String name = textElements.get(1) + " " +textElements.get(2);
            //Even if the exception is thrown, the program should print 
            //the "Invoice for : ______" part of the output
            System.out.println("Invoice for: "+ name);
            //print out the exception's message
            System.out.println(exc.getMessage());
            System.out.println("");
        }
        
}
}

