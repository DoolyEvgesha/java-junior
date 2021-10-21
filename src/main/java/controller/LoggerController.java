package controller;

import message.Message;
import printer.PrinterConsole;

public class LoggerController {
    private final PrinterConsole printerConsole;

    public LoggerController(PrinterConsole printerConsole) {
        this.printerConsole = printerConsole;
    }

    public void process(Message message) {
        if (buffer.isNewBufferType(buffer.getClass(), this.buffer.getClass())) {
            printer.print(this.buffer.getBody());
            this.buffer = buffer;
        }
        this.buffer.accumulate(message);
        try {
            ArrayList<String> result = this.buffer.getExtraordinaryBody();
            String[] array = new String[result.size()];
            printer.print(result.toArray(array));
        } catch (Exception e) {

        }
    }
}
