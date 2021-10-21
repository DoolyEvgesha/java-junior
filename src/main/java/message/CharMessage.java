package message;

public class CharMessage extends Message{
    private final Character message;

    public CharMessage(char message) {
        super("char: ");
        this.message = message;
    }

    public char getMessage() {
        return message;
    }

    @Override
    public void countRepetitive() {
        storage.add(message.toString());
    }
}
