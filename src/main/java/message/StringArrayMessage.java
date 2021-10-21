package message;

import java.util.Arrays;

public class StringArrayMessage extends Message{
    private final String[] message;

    public StringArrayMessage(String[] message) {
        super("string: ");
        this.message = message;
    }

    public String[] getMessage() {
        return message;
    }

    @Override
    public void countRepetitive() {
        storage.addAll(Arrays.asList(message));
    }
}
