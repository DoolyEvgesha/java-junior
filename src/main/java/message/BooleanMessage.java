package message;

import java.util.List;

public class BooleanMessage extends Message {
    private final Boolean message;

    public BooleanMessage(boolean message) {
        super("primitive: ");
        this.message = message;
    }

    private String getMessageString() {
        return prefix + message;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        String res = getMessageString();
        if (!storage.contains(res)) {
            storage.add(getMessageString());
        }
        return storage;
    }
}
