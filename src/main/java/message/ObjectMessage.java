package message;

import java.util.List;

public class ObjectMessage extends Message {
    private final Object message;

    public ObjectMessage(Object message) {
        super("reference: ");
        this.message = message;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        storage.add(message.toString());
        return storage;
    }
}
