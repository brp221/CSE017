//Bratislav Petkovic 
//IBL 2 STORE
//9-6-19
public class Store{
    private static int nextId = 1 ;
    String name ;
    String type ; 
    private static int ID ;

    public Store(String storeName , String storeType){
        this.name = name ;
        this.type = type ;
    }

    /**
     * @return the iD
     */
    public int getID() {
        ID = getNextId() ; 
        return ID;
    }

    public static int getNextId(){
        int id = nextId ;
        nextId++ ;
        return id ;
    }

}