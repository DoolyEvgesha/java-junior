package message;

import java.util.List;

public class StringMessage extends Message {
    private final String message;
    private int counter;

    public StringMessage(String message) {
        super("string: ");
        this.message = message;
        this.counter = 0;
    }

    public String getMessageString() {
        return prefix + message();
    }

    private String message() {
        return (counter > 1) ? message + " (x" + counter + ")" : message;
    }

    private void clearCounter() {
        counter = 0;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        if (!storage.contains(message)) {
            storage.add(getMessageString());
            clearCounter();
        }
        counter++;
        return storage;
    }
}
