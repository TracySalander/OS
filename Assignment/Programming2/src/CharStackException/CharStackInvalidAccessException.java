package CharStackException;

/**
 * Created by tracy on 2017-10-21.
 */
public class CharStackInvalidAccessException extends Exception {
    // Fill it up yourself
    public CharStackInvalidAccessException(){
        super("Invalid stack accessing");
    }

    public CharStackInvalidAccessException(int piSize){
        super("Invalid stack accessing" + piSize);
    }
}
