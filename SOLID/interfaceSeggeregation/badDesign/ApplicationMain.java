package interfaceSeggeregation.badDesign;

public class ApplicationMain {

    public static void main(String[] args) {
        Machine machine = new SimplePrinter();
        machine.print();
        machine.scan();
    }
}
