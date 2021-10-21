package message;

import java.util.Arrays;
import java.util.List;

public class StringArrayMessage extends Message{
    private final String[] message;

    public StringArrayMessage(String[] message) {
        super("string: ");
        this.message = message;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        storage.addAll(Arrays.asList(message));
        return storage;
    }
}
