package message;

public class ArrayIntegerMessage extends Message {
    private final Integer[] message;

    public ArrayIntegerMessage(Integer[] message) {
        super("primitives array: ");
        this.message = message;
    }

    public String getMessageString() {
        return message;
    }

    @Override
    public void countRepetitive(Object newMessage) {
        for (Integer element : message) {
            storage.add(element.toString());
        }
    }
}
