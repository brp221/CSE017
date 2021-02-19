/*
CSE017 Fall 2019
@Bratislav Petkovic 
Programming Assigmnet 1
Program: ShoppingCart
*/
import java.util.Scanner ;
import java.util.ArrayList;
import java.lang.String ;

public class ShoppingCart{
    Scanner scnr = new Scanner(System.in);
    private String customerName  ;
    private String CurrentDate ;
    private ArrayList <ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
    
    //default constructor 
    public ShoppingCart(){
        this.customerName = "none" ;
        this.CurrentDate = "none" ;
    }
    //parameterized constructor
    public ShoppingCart(String customerName, String CurrentDate){
        this.customerName = customerName ;
        this.CurrentDate = CurrentDate ;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getDate() {
        return CurrentDate;
    }
    public void setDate(String date){
        this.CurrentDate = date;
    }

    public void addItem(ItemToPurchase item){
        System.out.println("Enter the item name");
        item.setItemName(scnr.nextLine());
        String nameItem = item.getItemName();

        System.out.println("Enter the item description");
        item.setItemDescription(scnr.nextLine());
        String itemDesc = item.getItemDescription() ;

        System.out.println("Enter the item price ");
        item.setItemPrice(scnr.nextInt());
        int itemPrice = item.getItemPrice();

        System.out.println("Enter the item quantity");
        item.setItemQuantity(scnr.nextInt());
        int itemQuantity = item.getItemQuantity();
        scnr.nextLine();
        cartItems.add(item) ;
    }

    public void removeItem(String itemName){
        boolean checkItem = false ;
        for(int i = 0; i< cartItems.size(); i++){
        if(itemName.equalsIgnoreCase(cartItems.get(i).getItemName())){
            cartItems.remove(cartItems.get(i));
            checkItem = true ;
            break ;
        }
    }
        if(checkItem == true){
            System.out.println("Item has been removed");
        }
        else if(checkItem == false){
            System.out.println("Item not found in cart.Nothing has been removed");
        }
    }

    public void modifyItem(ItemToPurchase item){
        boolean checkItem = false ;
        System.out.println("Enter the name of the item to be modified : ");
        String itemName = scnr.nextLine();
        for(int i = 0; i< cartItems.size(); i++){
            if(itemName.equalsIgnoreCase(cartItems.get(i).getItemName())){
                System.out.println("Enter the new item quantity : ");
                cartItems.get(i).setItemQuantity(scnr.nextInt());
                int quantity = cartItems.get(i).getItemQuantity();
                scnr.nextLine();
                checkItem = true;
           }
           if(checkItem == true){
               System.out.println("Item has been modified");
            }
           else if(checkItem == false){
               System.out.println("Item not found in cart. Item not modified.");
            }
        }
    }


    public int getNumItemsInCart(){
        int numItems = 0;
        for(int i = 0; i < cartItems.size(); i++){
          numItems += cartItems.get(i).getItemQuantity();
        }
        return numItems;
      }
      
      public int getCostOfCart(){
        int totalCost = 0;
        for(int i = 0; i < cartItems.size(); i++){
          totalCost += (cartItems.get(i).getItemQuantity() * cartItems.get(i).getItemPrice());
        }
        return totalCost;
      }
      
      public void printTotal(){
        if(cartItems.size() > 0){
          System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
          System.out.println("Number of items: " + getNumItemsInCart());
        }
        else{
          System.out.println("Your shopping cart is empty.");
        }
      }
      
      public void printDescriptions(){
        System.out.println("Item Descriptions");
        if(cartItems.size() > 0){
          for(int i = 0; i < cartItems.size(); i++){
            System.out.println(cartItems.get(i).getItemName() + ": " + cartItems.get(i).getItemDescription());
          }
        }
        else{
          System.out.println("Your shopping cart is empty.");
        }
      }
      
      public void printCartItems(){
        if(cartItems.size() > 0){
          for(int i = 0; i < cartItems.size(); i++){
            System.out.println(cartItems.get(i).getItemName() + " " + cartItems.get(i).getItemQuantity() + 
            " @ $" + cartItems.get(i).getItemPrice() + " = $" + cartItems.get(i).getItemQuantity() * cartItems.get(i).getItemPrice());
          }
        }
      }





}