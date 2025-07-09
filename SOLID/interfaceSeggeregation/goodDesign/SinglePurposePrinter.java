package interfaceSeggeregation.goodDesign;

public class SinglePurposePrinter implements PrinterMachine{
    @Override
    public void print() {
        System.out.println("Simple Purpose Printer only prints");
    }
}
