

public class ProduceItem extends GenericItem{
    protected String expirationDate = "";

    public void setExpiration(String newDate){
        expirationDate = newDate;
    }
    public String getExpiration(){
        return expirationDate;
    }
    public void printItem(){
        System.out.println(itemQuantity + " " +itemName + ", expire(s) on " + expirationDate);
    }
}