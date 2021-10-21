package controller;

import message.Message;
import message.MessageCounter;
import printer.PrinterConsole;

public class LoggerController {
    private final PrinterConsole printerConsole;
    private MessageCounter messageCounter;

    public LoggerController(PrinterConsole printerConsole) {
        this.printerConsole = printerConsole;
        this.messageCounter = new MessageCounter();
    }

    public void process(Message message) {
        if (!messageCounter.compareFinalMessage(message)) {
            printerConsole.print(messageCounter.getFinalMessageString());
            messageCounter.addMessage(message);
        }
        messageCounter.countRepetitive(message);
//        printerConsole.print();
    }
}
