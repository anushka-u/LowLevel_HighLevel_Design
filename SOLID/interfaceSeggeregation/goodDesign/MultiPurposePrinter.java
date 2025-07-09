package interfaceSeggeregation.goodDesign;

public class MultiPurposePrinter implements PrinterMachine,ScannerMachine,CopyMachine{
    @Override
    public void copy() {
        System.out.println("MultiPurpose printer copies Data");
    }

    @Override
    public void print() {
        System.out.println("Printing via Multipurpose printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanning via Multipurpose Printer");
    }
}
