package message;

import java.util.List;

public class MatrixIntegerMessage extends Message {
    private final Integer[][] message;

    public MatrixIntegerMessage(Integer[][] message) {
        super("primitive: ");
        this.message = message;
    }
    @Override
    public List<String> accumulate(List<String> storage) {
        for (Integer[] row : message) {
            for (Integer element : row) {
                storage.add(element.toString());
            }
        }
        return storage;
    }
}
