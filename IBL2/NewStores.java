public class NewStores {
    public static void main(String[] args){
        Store store1 = new Store("Macys","Department") ;
        Store store2 = new Store("H&M's","Clothing") ;   
        Store store3 = new Store("Sals","Restaurant") ;

        System.out.println("Store 1's ID: " + store1.getID());
        System.out.println("Store 2's ID: " + store2.getID());
        System.out.println("Store 3's ID: " + store3.getID());

    }


}