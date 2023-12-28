package uncheckedexception;

public class InvalidirctcException extends RuntimeException{
    private String errorCode;



    public InvalidirctcException(String code, String message) {
        super(message);
        this.errorCode = code;
    }
        public String getErrorCode() {
            return errorCode;

    }
}
