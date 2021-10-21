package message;

public class IntegerMessage extends Message {
    private final Integer message;

    public IntegerMessage(int message) {
        super("primitives matrix: ");
        this.message = message;
    }

    @Override
    public void countRepetitive() {
        storage.add(message.toString());
    }
}
