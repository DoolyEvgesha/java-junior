package controller;

import message.Message;
import message.MessageCounter;

public class LoggerController {
    private final MessageCounter messageCounter;

    public LoggerController() {
        this.messageCounter = new MessageCounter();
    }

    public void process(Message message) {
        messageCounter.addMessage(message);
        messageCounter.accumulate();
        messageCounter.printLastMessage();
    }
}
