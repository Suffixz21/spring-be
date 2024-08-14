package za.co.trade.backend.exception;

import za.co.trade.backend.utils.ErrorMessage;
import za.co.trade.backend.utils.enums.MessageType;

public class UserAlreadyExistsException extends RuntimeException {
    private final ErrorMessage errorMessage;

    public UserAlreadyExistsException() {
        this.errorMessage = new ErrorMessage(MessageType.ERROR, "User with username already exists");
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }
}