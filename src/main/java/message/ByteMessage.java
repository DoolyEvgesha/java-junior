package message;

public class ByteMessage extends Message {
    private Byte message;
    private Byte sum;

    public ByteMessage(byte message) {
        super("primitive: ");
        this.message = message;
        this.sum = 0;
    }

    public void setMessage(Byte message) {
        this.message = message;
    }

    public String getMessage() {
        return prefix + sum;
    }

    @Override
    public void countRepetitive() {
        this.sum = (byte) countSum(sum, message, (int) Byte.MAX_VALUE, (int) Byte.MIN_VALUE);
        storage.add(message.toString());
    }
}
