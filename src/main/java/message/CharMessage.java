package message;

public class CharMessage extends Message{
    private final Character message;

    public CharMessage(char message) {
        super("char: ");
        this.message = message;
    }

    @Override
    public String getMessageString() {
        return message;
    }

    @Override
    public void countRepetitive() {
        storage.add(message.toString());
    }
}
