
/**
 * exception class which is thrown when the account is not of valid type
 */
public class UnknownAccountException extends IllegalArgumentException{
    /**
    * Constructor with no args
    * Creates a custom message
    */
    public UnknownAccountException(){
        super("Invalid Account");
    }
}