package ao.morgado.botstrapper.exception;

public class ValidationException extends RuntimeException{

    String field;

    public ValidationException(String field, String message) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}