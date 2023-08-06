package in.verma.app10.exception;
import in.verma.app10.model.Account;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
    }
}
