package message;

public class ArrayIntegerMessage extends Message {
    private final Integer[] message;

    public ArrayIntegerMessage(Integer[] message) {
        super("primitives array: ");
        this.message = message;
    }

    public Integer[] getMessage() {
        return message;
    }

    @Override
    public void countRepetitive() {
        for (Integer element : message) {
            storage.add(element.toString());
        }
    }
}
