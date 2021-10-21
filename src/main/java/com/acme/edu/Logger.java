package com.acme.edu;

import controller.LoggerController;
import message.*;

public class Logger {
    private static LoggerController loggerController;

    public Logger() {
        loggerController = new LoggerController();
    }

    public static void log(int integer) {
        loggerController.process(new IntegerMessage(integer));
    }

    public static void log(Integer... integer) {
        loggerController.process(new ArrayIntegerMessage(integer));
    }

    public static void log(Integer[]... integer) {
        loggerController.process(new MatrixIntegerMessage(integer));
    }

    public static void log(byte byteValue) {
        loggerController.process(new ByteMessage(byteValue));
    }

    public static void log(String string) {
        loggerController.process(new StringMessage(string));
    }

    public static void log(String... string) {
        loggerController.process(new StringArrayMessage(string));
    }

    public static void log(Boolean bool) {
        loggerController.process(new BooleanMessage(bool));
    }

    public static void log(char symbol) {
        loggerController.process(new CharMessage(symbol));
    }

    public static void log(Object object) {
        loggerController.process(new ObjectMessage(object));
    }
}
