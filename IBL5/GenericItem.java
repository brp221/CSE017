

public class GenericItem{
    protected String itemName ;
    protected int itemQuantity ;
    
    public void setName(String newName){
            itemName = newName;
    }
    public void setQuantity(int newQty){
        itemQuantity = newQty;
    } 
    public void printItem(){
        System.out.println(itemQuantity + " " +itemName);
    }
}