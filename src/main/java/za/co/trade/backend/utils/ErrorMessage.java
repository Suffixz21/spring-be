package za.co.trade.backend.utils;

import za.co.trade.backend.utils.enums.MessageType;

public class ErrorMessage {
    private final MessageType type;
    private final String message;

    public ErrorMessage(MessageType type, String message) {
        this.type = type;
        this.message = message;
    }

    public MessageType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}