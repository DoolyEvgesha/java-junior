package message;

public class MatrixIntegerMessage extends Message {
    private final Integer[][] message;

    public MatrixIntegerMessage(Integer[][] message) {
        super("primitive: ");
        this.message = message;
    }

    public Integer[][] getMessage() {
        return message;
    }
    @Override
    public void countRepetitive() {
        for (Integer[] row : message) {
            for (Integer element : row) {
                storage.add(element.toString());
            }
        }
    }
}
