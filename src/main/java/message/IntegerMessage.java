package message;

import java.util.List;

public class IntegerMessage extends Message {
    private final Integer message;

    public IntegerMessage(int message) {
        super("primitives matrix: ");
        this.message = message;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        storage.add(message.toString());
        return storage;
    }
}
