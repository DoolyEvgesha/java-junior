package message;

public class ObjectMessage extends Message {
    private final Object message;

    public ObjectMessage(Object message) {
        super("reference: ");
        this.message = message;
    }

    public Object getMessage() {
        return message;
    }

    @Override
    public void countRepetitive() {
        storage.add(message.toString());
    }
}
