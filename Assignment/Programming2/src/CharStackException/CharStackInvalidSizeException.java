package CharStackException;

/**
 * Created by tracy on 2017-10-21.
 */
public class CharStackInvalidSizeException extends Exception{
    public CharStackInvalidSizeException(){
        super("Invalid stack size specified.");
    }

    public CharStackInvalidSizeException(int piStackSize){
        super("Invalid stack size specified: " + piStackSize);
    }
}

