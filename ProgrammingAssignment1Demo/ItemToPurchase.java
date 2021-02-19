/*
CSE017 Fall 2019
@Bratislav Petkovic 
Programming Assigmnet 1
Program: ItemToPurchase
*/
import java.util.ArrayList ;

public class ItemToPurchase{
    private String itemName ;
    private int itemPrice ; 
    private int itemQuantity ;
    private String itemDescription ;

    public ItemToPurchase(){
        this.itemName = "none" ;
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "none" ;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    /**
     * @param itemQuantity the itemQuantity to set
     */
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }
    /**
     * @return the itemPrice
     */
    public int getItemPrice() {
        return itemPrice;
    }
    /**
     * @return the itemQuantity
     */
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemDescription(String itemDesc){
        this.itemDescription = itemDesc ;
    }
    public String getItemDescription(){
        return this.itemDescription ;
    }
    public void printItemCost(){
        double itemCost =  itemPrice * itemQuantity ;
        System.out.println(itemName+ " " + itemQuantity+ " @ $" +
        itemPrice +" = " + itemCost);
    }
    public void printItemDescription(){
        System.out.println(itemName + ": " + itemDescription);
    }
}