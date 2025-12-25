package creational.singleton;

public class SingletoTest {
    public static void main(String[] args) {
        PrintSpooler docPrinter  = PrintSpooler.getInstance();
        docPrinter.print("MyDocument...");

        PrintSpooler imgPrinter = PrintSpooler.getInstance();
        imgPrinter.print("MyImage...");

        PrintSpooler_TS docPrinter_ts  = PrintSpooler_TS.INSTANCE;
        docPrinter_ts.print("Thread safe document...");


    }
}
