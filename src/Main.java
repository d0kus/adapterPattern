public class Main {
    public static void main(String[] args){
        LegacyPrinter oldPrinter = new LegacyPrinter();
        Printer legacyPrinter = new LegacyPrinterAdapter(oldPrinter);

        oldPrinter.LegacyPrint();
        legacyPrinter.print();
    }
}
