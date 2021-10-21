package message;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MessageCounter {
    private int integerSum = 0;
    private final List<String> storage;
    private List<Message> messages;

    public MessageCounter() {
        this.storage = new ArrayList<>();
        this.messages = new LinkedList<>();
    }

    public List<String> getStorage() {
        return storage;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void addStorage(String string) {
        storage.add(string);
    }

    private Message getFinalMessage() {
        return messages.get(messages.size() - 1);
    }

    private String getFinalMessageType() {
        return getFinalMessage().getClass().getCanonicalName();
    }

    public boolean compareFinalMessage(Message message) {
        return getFinalMessageType().equals(message.getClass().getCanonicalName());
    }

    public String getFinalMessageString() {
        return getFinalMessage().getMessageString();
    }

//    public void countRepetitive(Message message) {
//        getFinalMessage().countRepetitive(message);
//    }

    private void accumulateIntegers() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof IntegerMessage).toArray()) {

        }
    }

    private void accumulateBytes() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof ByteMessage).toArray()) {

        }
    }

    private void accumulateArrayIntegers() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof ArrayIntegerMessage).toArray()) {

        }
    }

    private void accumulateMatrixIntegers() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof MatrixIntegerMessage).toArray()) {

        }
    }

    private void accumulateStrings() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof StringMessage).toArray()) {

        }
    }

    private void accumulateStringArrays() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof StringArrayMessage).toArray()) {

        }
    }

    private void accumulateChars() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof CharMessage).toArray()) {

        }
    }

    private void accumulateBools() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof BooleanMessage).toArray()) {

        }
    }

    private void accumulateObjects() {
        for (IntegerMessage mes: (IntegerMessage[]) messages.stream().filter(m -> m instanceof ObjectMessage).toArray()) {

        }
    }
}
