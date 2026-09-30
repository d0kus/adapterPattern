public class Main {
    public static void main(String[] args){

        Printer oldPrinter2000 = new LegacyPrinterAdapter();
        LegacyPrinter legacyPrinter = new LegacyPrinter();

       // legacyPrinter.print();
        oldPrinter2000.print();


    }
}
