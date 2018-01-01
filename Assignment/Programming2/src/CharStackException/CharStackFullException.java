package CharStackException;

/**
 * Created by tracy on 2017-10-21.
 */
public class CharStackFullException extends Exception {
    public CharStackFullException(){
        super("Char Stack has reached its capacity of CharStack.MAX_SIZE.");
    }
}

