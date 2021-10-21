package printer;

public class PrinterConsole {
    public void print(String... strings) {
        for (String string : strings) {
            if (string != null) {
                System.out.println(string);
            }
        }
    }
}
