public class ItemToPurchaseExtnd extends ItemToPurchase {
    private String itemDescription ;
    ItemToPurchaseExtnd(){
        this.itemDescription = "none" ;
    }

    public void setItemDescription(String itemDesc){
        this.itemDescription = itemDesc ;
    }
    public void printItemCost(){
        double itemCost =  this.getItemPrice() * this.getItemQuantity() ;
        System.out.println(this.getItemName() + " " + this.getItemQuantity()+ " @" +
        this.getItemPrice() +" = " + itemCost  );
    }
    public void printItemDescription(){
        System.out.println(this.getItemName() + ": "+ this.itemDescription);
    }
}