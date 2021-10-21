package message;

import java.util.List;

public class ArrayIntegerMessage extends Message {
    private final Integer[] message;

    public ArrayIntegerMessage(Integer[] message) {
        super("primitives array: ");
        this.message = message;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        for (Integer element : message) {
            storage.add(element.toString());
        }
        return storage;
    }
}
