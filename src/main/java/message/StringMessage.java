package message;

public class StringMessage extends Message {
    private final String message;
    private int counter;

    public StringMessage(String message) {
        super("string: ");
        this.message = message;
        this.counter = 0;
    }

    public String getMessage() {
        return prefix + message();
    }

    private String message() {
        return (counter > 1) ? message + " (x" + counter + ")" : message;
    }

    private void clearCounter() {
        counter = 0;
    }

    @Override
    public void countRepetitive(Object message) {
        if (!storage.contains((String) message)) {
            storage.add(getMessage());
            clearCounter();
        }
        message = (String) message;
        counter++;
    }
}
