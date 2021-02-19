
import java.util.ArrayList;
public class ItemInventory{
public static void main(String[] args){
    GenericItem genericItem1;
    ProduceItem produceItem1;
    ArrayList<GenericItem> inventoryList = new ArrayList<GenericItem>();

    genericItem1 = new GenericItem() ;
    genericItem1.setName("Schmeckels");
    genericItem1.setQuantity(9);

    produceItem1 = new ProduceItem() ;
    if(produceItem1 instanceof ProduceItem){
    produceItem1.setExpiration("February 31st,2019");
    produceItem1.setName("Milk");
    produceItem1.setQuantity(1);
    }
    System.out.println("");
    genericItem1.printItem();
    produceItem1.printItem();

    inventoryList.add(produceItem1);
    inventoryList.add(genericItem1);
    System.out.println("\nInventory:");
    for(int i =0; i<inventoryList.size();++i){
        inventoryList.get(i).printItem();
    }
    System.out.println("");
} 
}