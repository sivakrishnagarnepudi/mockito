package checkedexception;

public class InvalidirctcException extends Exception{
    private String errorCode;



    public InvalidirctcException(String code, String message) {
        super(message);
        this.errorCode = code;
    }
    public String getErrorCode() {
        return errorCode;

    }
}
