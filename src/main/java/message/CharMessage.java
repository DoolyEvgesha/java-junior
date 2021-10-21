package message;

import java.util.List;

public class CharMessage extends Message{
    private final Character message;

    public CharMessage(char message) {
        super("char: ");
        this.message = message;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        storage.add(message.toString());
        return storage;
    }
}
