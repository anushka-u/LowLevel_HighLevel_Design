package interfaceSeggeregation.badDesign;

public class MultiPurposePrinter implements Machine{
    @Override
    public void print() {
        System.out.println("Printing thru multi purpose printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanning via Multi purpose printer");
    }

    @Override
    public void copy() {
        System.out.println("Copying thru MultiPurpose Printer");
    }
}
