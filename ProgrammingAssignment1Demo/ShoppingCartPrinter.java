/*
CSE017 Fall 2019
@Bratislav Petkovic 
Programming Assigmnet 1
Program: ShoppingCartPrinter
*/

import java.util.ArrayList ;
import java.util.Scanner;

public class ShoppingCartPrinter{
    public static void main(String[] args){
        //introduce scanner class
        java.util.Scanner scnr = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Item 1 ");
        System.out.println("Enter the item name:");
        String object1name = scnr.nextLine() ;
        item1.setItemName(object1name);
        System.out.println("Enter the item price:");
        int object1price = scnr.nextInt() ;
        item1.setItemPrice(object1price);
        System.out.println("Enter the item quantity:");
        int object1qnty = scnr.nextInt() ;
        item1.setItemQuantity(object1qnty);

        scnr.nextLine();
        System.out.println("Item 2 ");
        System.out.println("Enter the item name:");
        String object2name = scnr.nextLine() ;
        item2.setItemName(object2name);
        System.out.println("Enter the item price:");
        int object2price = scnr.nextInt() ;
        item2.setItemPrice(object2price);
        System.out.println("Enter the item quantity:");
        int object2qnty = scnr.nextInt() ;
        item2.setItemQuantity(object2qnty);

        double item1total = item1.getItemPrice() *item1.getItemQuantity() ;
        double item2total = item2.getItemPrice() *item2.getItemQuantity() ;
        System.out.println("TOTAL COST");
        System.out.println(item1.getItemName() + " " +item1.getItemQuantity()+ " @ $" +item1.getItemPrice() + " = $" +item1total );
        System.out.println(item2.getItemName() + " " +item2.getItemQuantity()+ " @ $" +item2.getItemPrice() + " = $" +item2total );
        System.out.println("");
        double totalCost = item1total + item2total ;
        System.out.println("TOTAL :  $" + totalCost );

        

    }
}