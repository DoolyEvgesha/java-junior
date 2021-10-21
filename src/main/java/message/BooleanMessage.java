package message;

public class BooleanMessage extends Message  {
    private final Boolean message;

    public BooleanMessage(boolean message) {
        super("primitive: ");
        this.message = message;
    }

    @Override
    public void countRepetitive() {
        storage.add(message.toString());
    }
}
