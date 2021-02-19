import java.util.*;
import java.io.*;
import java.text.*;
/**
 * exception class which is thrown when the account has negative charge
 */
public class AccountDepletedException extends IllegalArgumentException {
    /**
     * Constructor with no args
     * Creates a custom message
     */
    public AccountDepletedException(){
        super("Insufficient Funds");
    }
}