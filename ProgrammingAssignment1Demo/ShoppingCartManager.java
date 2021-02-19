/*
CSE017 Fall 2019
@Bratislav Petkovic 
Programming Assigmnet 1
Program: ShoppingCartManager
*/

import java.util.*;
import java.lang.String ;
import java.lang.Character ;

public class ShoppingCartManager{
    static Scanner scnr = new Scanner(System.in);
    static ShoppingCart cart = new ShoppingCart(); 

    public static void main(String[] args){
        System.out.println("Enter customer's name : ");
        String customerName = scnr.nextLine() ;
        cart.setCustomerName(customerName);
        System.out.println("Enter today's date : ");
        String dateToday = scnr.nextLine() ;
        cart.setDate(dateToday) ; 
        System.out.println("Customer's name : " + customerName);
        System.out.println("Today's Date : " + dateToday);
        printMenu(cart) ;

    }

    public static void printMenu(ShoppingCart cart){
        String userOption = " ";
    do {
      System.out.println("");
      System.out.println("MENU");
      System.out.println("a - Add item to cart");
      System.out.println("d - Remove item from cart" );
      System.out.println("c - Change item quantity");
      System.out.println("i - Output items' description");
      System.out.println("o - Output shopping cart");
      System.out.println("q - quit");
      userOption = scnr.nextLine();
      break;
    }while(userOption != "q");
   
    //for each case call upon the corresponding method.If the method requires further 
    //parameters ask the user for specific input within each specific case.
    switch (userOption){
       case "a":
        System.out.println("ADD ITEM");
        ItemToPurchase item = new ItemToPurchase() ;
        System.out.println("");
        cart.addItem(item) ;
        System.out.println("");
        printMenu(cart);
        break;

       case "d":
        System.out.println("REMOVE ITEM");
        System.out.println("");
        System.out.println("Enter name of item to remove: ");
        scnr.nextLine();
        String removeItem = scnr.nextLine();
        cart.removeItem(removeItem);
        System.out.println("");
        printMenu(cart);
        break;

       case "c":
        ItemToPurchase modItem = new ItemToPurchase();
        System.out.println("MODIFY ITEM QUANTITY");
        System.out.println();
        cart.modifyItem(modItem);
        System.out.println("");
        printMenu(cart);
        break;

       case "i":
        System.out.println("OUTPUT ITEM DESCRIPTIONS");
        System.out.println(cart.getCustomerName() + "'s Shopping Cart - " + cart.getDate());
        System.out.println();
        cart.printDescriptions();
        System.out.println("");
        printMenu(cart);
        break;

        case "o":
        System.out.println("OUTPUT SHOPPING CART");
        System.out.println();
        cart.printTotal();
        System.out.println();
        cart.printCartItems();
        System.out.println("Total: $" + cart.getCostOfCart());
        System.out.println();
        System.out.println();
        System.out.println("");
        printMenu(cart);
        break;

       case "q":
       System.out.println("");
       System.out.println("The Program has been terminated");
       break;

       default:
        System.out.println("Please provide correct input.");
        printMenu(cart);
        break; 
    }
}
}