package interfaceSeggeregation.badDesign;

import javax.crypto.Mac;
/*
Single Purpose Printer should only print but shouldn't copy and scan.
but as it implements Machine it's forced to implement scan and copy method too.
 */
public class SimplePrinter implements Machine {
    @Override
    public void print() {
        System.out.println("Simple Printer only printss....");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Simple Printer doesn't scan");
    }

    @Override
    public void copy() {
        throw new UnsupportedOperationException("SimplePrinter doesn't copy");
    }
}
