package message;

import printer.PrinterConsole;

import java.util.LinkedList;
import java.util.List;

public class MessageCounter {
    private List<String> storage;
    private List<Message> messages;
    private final PrinterConsole printer;

    public MessageCounter() {
        this.storage = new LinkedList<>();
        this.messages = new LinkedList<>();
        this.printer = new PrinterConsole();
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

//    public boolean compareFinalMessage(Message message) {
//        return getFinalMessageType().equals(message.getClass().getCanonicalName());
//    }

    public void printLastMessage() {
        printer.print(storage.get(storage.size() - 1));
    }

    public void accumulate() {
        for (Message mes: messages) {
            storage = mes.accumulate(storage);
        }
    }
}
