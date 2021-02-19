//Bratislav Petkovic 
//IBL 2 cABLEpLAN
//9-6-19

public class CablePlan{
    int numDays ;

    /**
     * @param numDays the numDays to set
     */
    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public int getNumDays(){
        System.out.println("Number of days :" + numDays);
        return numDays ;
    }

}