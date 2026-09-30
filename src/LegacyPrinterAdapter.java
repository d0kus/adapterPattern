public class LegacyPrinterAdapter implements Printer{
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legPrint){
        this.legacyPrinter = legPrint;
    }
    @Override
    public void print(){
        legacyPrinter.LegacyPrint();
    }
}
