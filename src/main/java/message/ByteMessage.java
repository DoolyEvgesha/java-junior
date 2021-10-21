package message;

import java.util.List;

public class ByteMessage extends Message {
    private Byte message;
    private Byte sum;

    public ByteMessage(byte message) {
        super("primitive: ");
        this.message = message;
        this.sum = 0;
    }

    public String getMessageString() {
        return prefix + sum;
    }

    @Override
    public List<String> accumulate(List<String> storage) {
        sum = (byte) countSum(sum, message, (int) Byte.MAX_VALUE, (int) Byte.MIN_VALUE, storage);
        storage.add(message.toString());
        return storage;
    }
}
