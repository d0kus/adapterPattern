public class LegacyPrinterAdapter implements Printer{
    LegacyPrinter oldPrinter = new LegacyPrinter();
    @Override
    public void print(){
        oldPrinter.LegacyPrint();
    }
}
